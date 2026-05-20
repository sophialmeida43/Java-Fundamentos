package Java_estruturas_decisão;

import java.util.Scanner;

public class Positivo_negativo_zero {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número:");
		int número = Integer.parseInt(entrada.nextLine());

		if (número > 0) {

			System.out.println("O número " + número + " é POSITIVO!");
		}

		else if (número < 0) {

			System.out.println("O número " + número + " é NEGATIVO!");
		}

		else {

			System.out.println("O número é ZERO!");
		}

		entrada.close();

	}

}
