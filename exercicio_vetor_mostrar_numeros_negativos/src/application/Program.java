package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		num = sc.nextInt();
		System.out.println();
		int[] arrayInt = new int[num];
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.print("Digite um número: ");			
			arrayInt[i] = sc.nextInt();
			System.out.println();
		}
		System.out.println("Números Negativos: ");
		for (int i = 0; i < arrayInt.length; i++) {
			if(arrayInt[i] < 0) {
				System.out.println(arrayInt[i]);
			}
		}
		
		sc.close();

	}

}
