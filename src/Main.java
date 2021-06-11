import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        while (true) {
            System.out.println("Введите информацию о сотруднике фамилия, имя, возрост, пол, оброзования, должность, отдел): ");
            System.out.println("Введите фамилия сотрудника: ");
            String surname = scanner.next();
            System.out.println("Введите имя сотрудника: ");
            String name = scanner.next();
            System.out.println("Введите возрост сотрудника: ");
            int age = scanner.nextInt();
            System.out.println("Введите пол сотрудника: ");
            String gender = scanner.next();
            System.out.println("Введите оброзования сотрудника : ");
            String education = scanner.next();
            System.out.println("Введите должность сотрудника: ");
            String position = scanner.next();
            System.out.println("Введите отдел: ");
            String department = scanner.next();
            scanner.nextLine();
            employees.add(new Employee(surname, name, age, gender, education, position, department));
            System.out.println("хотите закончить ввод данных, введите end: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
        }
        while (true) {
            System.out.println("Если не хотите менять данные, введите end:");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            System.out.println("Введите фамилия и имя работникка , для которого хотите изменить данные");
            String surname = scanner.next();
            String name = scanner.next();
            scanner.nextLine();
            int empIndex = searchBySurname(employees, surname, name);
            if (empIndex != -1) {
                System.out.println("Меняем [Фамилия]?");
                input = scanner.nextLine();
                if (input.equals("yes")) {
                    employees.get(empIndex).setSurname(scanner.nextLine());
                }
                System.out.println("Меняем [Имя]? ");
                input = scanner.nextLine();
                if (input.equals("yes")) {
                    employees.get(empIndex).setName(scanner.nextLine());
                }
                System.out.println("Меняем [Возраст]? ");
                input = scanner.nextLine();
                if (input.equals("yes")) {
                    employees.get(empIndex).setAge(Integer.parseInt(scanner.nextLine()));
                }
                System.out.println("Меняем [Пол]? ");
                input = scanner.nextLine();
                if (input.equals("yes")) {
                    employees.get(empIndex).setGender(scanner.nextLine());
                }
                System.out.println("Меняем [Оброзования]? ");
                input = scanner.nextLine();
                if (input.equals("yes")) {
                    employees.get(empIndex).setEducation(scanner.nextLine());
                }
                System.out.println("Меняем [Должность]? ");
                input = scanner.nextLine();
                if (input.equals("yes")) {
                    employees.get(empIndex).setPosition(scanner.nextLine());
                }
                System.out.println("Меняем [Отдел]? ");
                input = scanner.nextLine();
                if (input.equals("yes")) {
                    employees.get(empIndex).setDepartment(scanner.nextLine());
                }
            }
        }
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int searchBySurname(List<Employee> employees, String surname, String name) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSurname().equals(surname) && employees.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        run();
    }
}