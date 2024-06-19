package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of employees: ");
		int n = sc.nextInt();
		List<Employee> employees = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("valuePerHour: ");
			Double valuePerHour = sc.nextDouble();
			if (ch == 'n') {	
				Employee emp = new Employee(name, hours, valuePerHour);
				employees.add(emp);
			} else {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee out = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(out);
			}			
		}
		System.out.println("PAYMENTS:");
		for (Employee employee : employees) {
			System.out.printf("%s - $ %.2f%n", employee.getName(), employee.payment());			
		}
		sc.close();
	}

}
