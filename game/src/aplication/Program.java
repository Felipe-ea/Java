package aplication;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int numero = random. nextInt(100);

		System.out.println("******************* QUE COMECEM OS JOGOS *******************");
		System.out.println();
		System.out.println("UM NÚMERO DE 1 A 100 FOI GERADO ALEATORIAMENTE");
		System.out.println();
		
		System.out.print("Digite um número entre 1 e 100:");
		int numeroDigitado = sc.nextInt();
		sc.nextLine();
		
		while(numeroDigitado != numero) {
			System.out.println("Numero errado!!");
			System.out.println();
			if(numeroDigitado > numero) {
				System.out.print("O numero digitado é muito alto, tente novamente:");
				System.out.println();
				System.out.println();
			}
			else {
				System.out.print("O numero digitado é muito baixo, tente novamente:");	
				System.out.println();
				System.out.println();
			}
			
			System.out.printf("Digite outro número:");
			numeroDigitado = sc.nextInt();		
		}
		
		System.out.println("Parabéns, você acertou!!");
		System.out.printf("O número gerado foi " + numero);
		
		sc.close();
	}

}
