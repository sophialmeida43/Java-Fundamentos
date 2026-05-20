package Java_estruturas_decisão;

import java.util.Scanner;

public class Voto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade:");
		int idade = Integer.parseInt(entrada.nextLine());

		String situacao;

		if (idade < 16) {

			situacao = "VOTO PROIBIDO";
		}

		else if (idade >= 18 && idade <= 70) {

			situacao = "VOTO OBRIGATÓRIO";
		}

		else {

			situacao = "VOTO FACULTATIVO";
		}

		System.out.println("Situação eleitoral: " + situacao);

		entrada.close();
	}

}
