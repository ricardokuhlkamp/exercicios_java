package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a oredem da matriz: ");
		int ordem = sc.nextInt();
		System.out.println();
		
		int[][] matriz = new int[ordem][ordem];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("digite o valor para a linha %d e coluna %d: ", i, j);
				matriz[i][j] = sc.nextInt();
				System.out.println();
			}
		}	
		
		System.out.println("Main Diagonal: ");
		for (int i = 0; i < ordem; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		
		sc.close();
		
	}

}
