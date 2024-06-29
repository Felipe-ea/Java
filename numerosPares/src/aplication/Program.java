package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vetor = new int[n];
		
		for (int i=0; i < n; i++) {
			
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
						
		}
		int pares = 0;
		System.out.println();
		System.out.println("Números pares:");
		for (int i=0; i < n; i++) {
		
			if ((vetor[i]%2) == 0) {
				
				System.out.printf(vetor[i] + " ");
				pares++;
				
			}
				
		}
		System.out.println();
		System.out.println();
		System.out.printf("Quantidade de pares = " + pares);
		
		sc.close();
	}

}
