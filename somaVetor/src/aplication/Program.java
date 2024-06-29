package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i<n; i++) {
			
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();			
		}
		double soma = 0.0;
		double media = 0.0;
		System.out.println();
		System.out.print("Valores = ");
		for (int i = 0; i<n; i++) {
			
			System.out.print(vetor[i] + " ");
			soma += vetor[i];
		}
		
		media = soma / vetor.length;
		System.out.println();
		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Média = %.2f", media);
		
		
		
		sc.close();

	}

}
