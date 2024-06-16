
public class Main {

	public static void main(String[] args) {
		double x = 3;
		double y = 4;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("raiz quadrada de " + x + " = " + A);
		System.out.println("raiz quadrada de " + y + " = " + B);
		System.out.println("raiz quadrada de 25.0 " + " = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2);
		C = Math.pow(5, 2);
		System.out.println(x + " elecado a " + y + " = " + A);
		System.out.println(x + " elecado ao quadrado = " + B);
		System.out.println("5.0 elecado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}

}
