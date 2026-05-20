package Java_introdução;

import java.util.Scanner;

public class Latão {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double cobre;
		double zinco;

		System.out.println("Qual o peso do galão? ");
		double peso = entrada.nextDouble();

		cobre = peso * 0.7;
		zinco = peso * 0.3;

		System.out.println("Cobre: " + cobre);
		System.out.println("Zinco: " + zinco);

		entrada.close();
	}
}