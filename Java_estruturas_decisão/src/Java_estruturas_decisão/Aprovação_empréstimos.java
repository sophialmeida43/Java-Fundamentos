package Java_estruturas_decisão;

import java.util.Scanner;

public class Aprovação_empréstimos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade:");
		int idade = Integer.parseInt(entrada.nextLine());

		System.out.println("Digite seu salário:");
		double salário = Double.parseDouble(entrada.nextLine());

		System.out.println("Nome sujo? (true/false):");
		boolean nome = Boolean.parseBoolean(entrada.nextLine());

		if (idade >= 18 && idade <= 65 && salário >= 1500 && !nome) {
			System.out.println("EMPRÉSTIMO APROVADO!");
		} else {
			System.out.println("EMPRÉSTIMO NEGADO:");

			if (idade < 18 || idade > 65) {
				System.out.println(" - Idade fora da faixa permitida");
			}

			if (salário < 1500) {
				System.out.println(" - Salário insuficiente");
			}

			if (nome) {
				System.out.println(" - Nome negativado");
			}
		}

		entrada.close();
	}
}
