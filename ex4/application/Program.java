package ex4.application;

import java.util.Locale;
import java.util.Scanner;

import ex4.entities.Employee;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.Name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println("\nEmployee: "+ employee.Name + ", $ "+ String.format("%.2f", employee.NetSalary()));
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        employee.perc=sc.nextDouble();
        employee.IncreaseSalary(employee.perc);
        System.out.println(employee);

        sc.close();
    }
}
