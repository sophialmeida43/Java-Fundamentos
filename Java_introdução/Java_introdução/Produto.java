package Java_introdução;

import java.util.Scanner;

public class Produto {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double desconto;
		double valorFinal;

		System.out.println("Qual valor do produto? ");
		double valor = entrada.nextDouble();

		desconto = valor * 0.10;
		valorFinal = valor - desconto;

		System.out.println("Valor original do produto: " + valor);
		System.out.println("Valor do desconto: " + desconto);
		System.out.println("valor final com desconto: " + valorFinal);

		entrada.close();
	}
}
