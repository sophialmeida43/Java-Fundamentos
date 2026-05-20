package Java_introdução;

public class Tipodedado {
	public static void main(String[] args) {

		short x;
		x = (short) Math.pow(-2, 15);

		System.out.println("Valor de x: " + x);

		x = (short) (x - 1);

		System.out.println("Valor final de x: " + x);
	}
}