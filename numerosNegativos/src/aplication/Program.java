package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		if(n <= 10) {
			
			for(int i=0; i<n; i++){			
				System.out.print("Digite um número: ");
				vetor[i] = sc.nextInt();
				
			}
			System.out.println("Números negativos:");
			for (int i=0; i<n; i++) {
				
				if (vetor[i] < 0) {
					System.out.println(vetor[i]);
				}
				
			}
			
		}
		else {
			System.out.println("O número não pode ser maior que 10");
		}
	
		sc.close();

	}

}
