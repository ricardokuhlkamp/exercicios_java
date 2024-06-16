import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int valor;
		valor = sc.nextInt();
		System.out.println("VocÊ digitou o valor: " + valor);
		
		double valor2;
		valor2 = sc.nextDouble();
		System.out.println("VocÊ digitou o valor: " + valor2);
		
		char z;
		z = sc.next().charAt(0);
		System.out.println("Você digitou o caracter: " + z);
		sc.close();
	}

}
