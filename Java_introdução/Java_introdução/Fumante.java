package Java_introdução;

import java.util.Scanner;

public class Fumante {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int diasDoAno = 365;

		System.out.println("Quantos anos você fuma? ");
		int anos = Integer.parseInt(entrada.nextLine());

		System.out.println("Quantos cigarros você fuma por dia? ");
		int cigarrosDia = Integer.parseInt(entrada.nextLine());

		System.out.println("Você gasta quanto numa carteira de cigarros? ");
		double preco = Double.parseDouble(entrada.nextLine());

		int totalDias = anos * diasDoAno;
		int totalCigarros = totalDias * cigarrosDia;

		int carteiras = totalCigarros / 20;
		double gastoTotal = carteiras * preco;

		System.out.println("Total de cigarros fumados: " + totalCigarros);
		System.out.println("Total de carteiras: " + carteiras);
		System.out.println("Total gasto: R$ " + gastoTotal);
		
		entrada.close();
	}
}
