package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double maiorValor = 0.0;
		int posicao = 0;
		
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			sc.nextLine();
			
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				posicao = i;
			}
		}
		
		
		
		System.out.printf("Maior valor = %.1f%n", maiorValor);
		System.out.printf("Posição do maior valor = " + posicao);
		
		sc.close();

	}

}
