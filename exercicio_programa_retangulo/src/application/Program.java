package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o comprimento do retangulo: ");
		retangulo.comp = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite a altura do retangulo: ");
		retangulo.altu = sc.nextDouble();
		
		System.out.println();
		System.out.println("ÁREA: " + retangulo.area() + ";\n" 
						+ "PERIMETER: " + retangulo.perimeter() + ";\n"
						+ "DIAGONAL: " + String.format("%.2f", retangulo.diagonal()) + ";\n");
		
		sc.close();
	}

}
