package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		double mediaVetor = 0.0;
		for (int i = 0; i < vetor.length; i++) {
		
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			
			mediaVetor += vetor[i];
			
		}
		
		mediaVetor = mediaVetor / vetor.length;
		System.out.printf("Media vetor %.3f%n", mediaVetor);
		
		System.out.println("Elementos abaixo da media:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < mediaVetor) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();

	}

}
