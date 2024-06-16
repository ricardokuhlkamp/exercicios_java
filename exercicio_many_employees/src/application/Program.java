package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitie.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many emplyees will be registered? ");
		int quantidade = sc.nextInt();
		System.out.println();
		
		List<Employee> employee = new ArrayList<>();
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.println();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			employee.add(new Employee(id, name, salary));
			
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer idIncrease = sc.nextInt();
		System.out.println();
		
		if(hasId(employee, idIncrease) == 0) {
			System.out.println("This id does not exist!");
			System.out.println();
		} else {
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			System.out.println();
			for (Employee emp : employee) {
				if(emp.getId() == idIncrease) {
					emp.increaseSalary(percent);
				}
			}
		}
		
		System.out.println("List of employees: ");
		for (Employee emp2 : employee) {
			System.out.printf("%d, %s, %.2f", emp2.getId(), emp2.getName(), emp2.getSalary());
			System.out.println();
		}		
		
		sc.close();

	}
	
	public static Long hasId(List<Employee> list, Integer id) {
		return list.stream().filter(x -> x.getId() == id).count();
	}

}
