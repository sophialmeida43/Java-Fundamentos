package Java_introdução;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double Fahrenheit;

		System.out.println("Quantos graus está fazendoo agora?");
		double graus = entrada.nextDouble();

		Fahrenheit = (graus * 1.8) + 32;

		System.out.println("Temperatura em Celsius:" + graus + "C");
		System.out.println("Temperatura em Fahrenheit:" + Fahrenheit + "F");

		entrada.close();
	}
}