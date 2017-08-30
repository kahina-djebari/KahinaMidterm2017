package design;

import java.util.Scanner;

import static sun.misc.Version.println;

/**
 * Created by Kahina on 8/30/2017.
 */
public abstract class EmployeeAsbtract implements Employee {

    int employeeId;
    String employeeName;

    @Override
    public int employeeId() {
        return employeeId;
    }

    @Override
    public String employeeName() {
        return employeeName;
    }

    @Override
    public void assignDepartment() {
        System.out.println("IT department");
    }

    @Override
    public int calculateSalary() {
        System.out.println("Enter the monthly salary");
        Scanner sc = new Scanner(System.in);
        int MonthlySalary = sc.nextInt();
        int salary = MonthlySalary *12;
        System.out.println("Salary = " + salary);
        return salary;

    }

    @Override
    public void benefitLayout() {


    }
}
