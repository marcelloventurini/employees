import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Id: ");
            String id = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employees.add(new Employee(name, id, salary));
        }

        System.out.print("Enter the id of the employee who will receive a raise: ");
        String id = scanner.nextLine();

        String result = Employee.verifyId(employees, id);

        if (result == null) {
            System.out.println("Id doesn't exist.");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();

            for (Employee employee : employees) {
                if (employee.getId().equals(result))
                    employee.raiseSalary(percentage);
            }
        }

        System.out.println("List of employees:");

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        scanner.close();
    }
}
