package Java_estruturas_decisão;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		double primeiro = Double.parseDouble(entrada.nextLine());

		System.out.println("Digite o segundo número:");
		double segundo = Double.parseDouble(entrada.nextLine());

		System.out.println("Digite a operação (+, -, *, /):");
		String operação = entrada.next();

		double resultado;
		boolean erro = false;

		switch (operação) {
		case "+":
			resultado = primeiro + segundo;
			System.out.println(primeiro + " + " + segundo + " = " + resultado);
			break;

		case "-":
			resultado = primeiro - segundo;
			System.out.println(primeiro + " - " + segundo + " = " + resultado);
			break;

		case "*":
			resultado = primeiro * segundo;
			System.out.println(primeiro + " * " + segundo + " = " + resultado);
			break;

		case "/":
			resultado = primeiro / segundo;
			System.out.println(primeiro + " / " + segundo + " = " + resultado);
			break;

		default:
			break;
		}

		entrada.close();
	}
}
