package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = scanner.nextLine();
		System.out.print("Gross Salary: ");
		double grossSalary = scanner.nextDouble();
		System.out.print("Tax: ");
		double tax = scanner.nextDouble();
		Employee emp = new Employee(name, grossSalary, tax);
		System.out.println();
		
		System.out.println("Employee: " + emp);
		System.out.println();
		
		System.out.print("Which percentagem to increase salary? ");
		emp.incleaseSalary(scanner.nextDouble());
		System.out.println();
		
		System.out.println("Updated data: " + emp);
		
		scanner.close();
		
	}

}
