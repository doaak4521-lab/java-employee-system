package test;

import model.*;

public class MainTest {
    public static void main(String[] args) {
        Department department = new Department(1, "IT Department");

        Employee emp1 = new MonthlyEmployee(101, "Ahmed Ali", "Cairo", "01012345678", "ahmed@mail.com", Gender.MALE, 5000, 500);
        Employee emp2 = new HourlyEmployee(102, "Sara Mohamed", "Giza", "01112345678", "sara@mail.com", Gender.FEMALE, 160, 25);
        Employee emp3 = new CommissionEmployee(103, "Khaled Omar", "Alexandria", "01212345678", "khaled@mail.com", Gender.MALE, 10000, 0.15);

        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);

        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("--------------------------------------------------");
        
        for (Employee emp : department.getEmployees()) {
            System.out.println(emp);
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            System.out.println("--------------------------------------------------");
        }
    }
}
