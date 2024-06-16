package entities;

public class Retangulo {
	public double comp;
	public double altu;
	
	public double area() {
		return comp * altu;
	}
	
	public double perimeter() {
		return (2 * comp) + (2 * altu);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(comp, 2.0) + Math.pow(altu, 2));
	}
}
