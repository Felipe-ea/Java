package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		
		for (int i = 0; i<n; i++) {
			
			vetorA[i] = sc.nextInt();
			
		}
		
		System.out.println("Digite os valores do vetor B:");
				
		for (int i = 0; i<n; i++) {

			vetorB[i] = sc.nextInt();
					
		}
		
		System.out.println("Vetor resulltante:");
		
		for (int i = 0; i<n; i++) {

			vetorC[i] = vetorA[i] + vetorB[i];
			
			System.out.println(vetorC[i]);
					
		}
		
		
		sc.close();
		

	}

}
