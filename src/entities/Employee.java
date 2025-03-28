package entities;

public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    @Override
    public String toString() {
        return String.format("Name: %s; Id: %s; Salary: %.2f", name, id, salary);
    }
}
