package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		int pares = 0;
		int qtdPares = 0;
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			
			if ((vetor[i] % 2) == 0) {
				
				pares += vetor[i];
				qtdPares++;
			}			
		}
		
		double mediaPares = (double)pares/(double)qtdPares;
		
		if (mediaPares > 0.0) {
			System.out.printf("Media dos pares = %.1f", mediaPares);
		}
		else {
			System.out.println("Nenhum número par foi digitado");
		}
		
		
		
		
		sc.close();

	}

}
