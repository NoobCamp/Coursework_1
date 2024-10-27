import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final static Random random = new Random();

    private static Employee[] employees = new Employee[10];


    private static int calculateTotalAmountSalaries() {
        int totalAmountSalaries = 0;
        for (Employee employee : employees) {
            totalAmountSalaries += employee.getSalary();
        }
        return totalAmountSalaries;
    }

    private static int calculateAverageSalary() {
        int averageSalary = 0;
        averageSalary = calculateTotalAmountSalaries() / employees.length;
        return averageSalary;
    }

    private static Employee findMinSalary() {
        Employee minSalary = null;
        for (Employee employee : employees) {
            if (minSalary == null || employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    private static Employee findMaxSalary() {

        Employee maxSalary = null;
        for (Employee employee : employees) {
            if (maxSalary == null || employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }


    private static void print() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("тест1", 1, random.nextInt(50_000, 150_000));
        employees[1] = new Employee("тест2", 2, random.nextInt(50_000, 150_000));
        employees[2] = new Employee("тест3", 3, random.nextInt(50_000, 150_000));
        employees[3] = new Employee("тест4", 4, random.nextInt(50_000, 150_000));
        employees[4] = new Employee("тест5", 5, random.nextInt(50_000, 150_000));
        employees[5] = new Employee("тест6", 1, random.nextInt(50_000, 150_000));
        employees[6] = new Employee("тест7", 2, random.nextInt(50_000, 150_000));
        employees[7] = new Employee("тест8", 3, random.nextInt(50_000, 150_000));
        employees[8] = new Employee("тест9", 4, random.nextInt(50_000, 150_000));
        employees[9] = new Employee("тест10", 5, random.nextInt(50_000, 150_000));
        print();
        System.out.println("Общие затраты на зарплату сотрудникам: " + calculateTotalAmountSalaries());
        System.out.println("Сотрудник с минимальной зарплатой: " + findMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + findMaxSalary());
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
    }
}