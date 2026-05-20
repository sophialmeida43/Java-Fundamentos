package Java_estruturas_decisão;

import java.util.Scanner;

public class Meses_ano {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número do mês (1-12):");
		int mes = Integer.parseInt(entrada.nextLine());

		String nomeMes = "";
		String estacao = "";
		String dias = "";

		switch (mes) {
		case 1:
			nomeMes = "Janeiro";
			dias = "31";
			break;
		case 2:
			nomeMes = "Fevereiro";
			dias = "28 ou 29";
			break;
		case 3:
			nomeMes = "Março";
			dias = "31";
			break;
		case 4:
			nomeMes = "Abril";
			dias = "30";
			break;
		case 5:
			nomeMes = "Maio";
			dias = "31";
			break;
		case 6:
			nomeMes = "Junho";
			dias = "30";
			break;
		case 7:
			nomeMes = "Julho";
			dias = "31";
			break;
		case 8:
			nomeMes = "Agosto";
			dias = "31";
			break;
		case 9:
			nomeMes = "Setembro";
			dias = "30";
			break;
		case 10:
			nomeMes = "Outubro";
			dias = "31";
			break;
		case 11:
			nomeMes = "Novembro";
			dias = "30";
			break;
		case 12:
			nomeMes = "Dezembro";
			dias = "31";
			break;

		default:
			break;
		}

		if (mes >= 1 && mes <= 12) {
			switch (mes) {
			case 12:
			case 1:
			case 2:
				estacao = "verão";
				break;

			case 3:
			case 4:
			case 5:
				estacao = "outone";
				break;

			case 6:
			case 7:
			case 8:
				estacao = "Inverno";
				break;

			case 9:
			case 10:
			case 11:
				estacao = "Primavera";
				break;
			}

			System.out.println("Mês: " + nomeMes);
			System.out.println("Estacao: " + estacao);
			System.out.println("Dias: " + dias);
		}

		entrada.close();
	}
}
