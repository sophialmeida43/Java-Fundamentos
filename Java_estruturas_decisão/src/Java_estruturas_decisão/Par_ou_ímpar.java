package Java_estruturas_decisão;

import java.util.Scanner;

public class Par_ou_ímpar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número:");
		int número = Integer.parseInt(entrada.nextLine());

		if (número % 2 == 0) {

			System.out.println("O número " + número + " é PAR!");
		}

		if (número % 2 != 0) {

			System.out.println("O número " + número + " é ÍMPAR!");
		}

		entrada.close();

	}
}
