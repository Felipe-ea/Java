package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cotação do dolar: ");
		double cotacao = sc.nextDouble();
		System.out.print("Quantos dolares serão comprados: ");
		double quantidadeComprada = sc.nextDouble();
		
		sc.close();

		double total = Conversor.conversorDolar(cotacao, quantidadeComprada);
		
		System.out.printf("Total a ser pago em reais: %.2f%n", total);
		
	}

}
