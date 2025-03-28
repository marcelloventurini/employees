package entities;

import java.util.List;

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

    public static String verifyId(List<Employee> employees, String id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                return id;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return String.format("Name: %s; Id: %s; Salary: %.2f", name, id, salary);
    }
}
