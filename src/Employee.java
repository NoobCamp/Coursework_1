import java.util.Objects;

public class Employee {

    private static int createID = 1;

    private final String fullName;
    private final int id;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        id = createID++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "ФИО = '" + fullName + '\'' +
                ", ID = " + id +
                ", Отдел = " + department +
                ", Зарплата = " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, id, department, salary);
    }
}