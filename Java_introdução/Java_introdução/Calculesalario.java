package Java_introdução;

import java.util.Scanner;

public class Calculesalario {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas horas trabalha por dia? ");
		double trabalha = entrada.nextDouble();

		System.out.println("Quanto ganha por hora? ");
		double hora = entrada.nextDouble();

		double salario = trabalha * hora;

		System.out.println("aláSrio total: " + salario);

		entrada.close();
	}
}