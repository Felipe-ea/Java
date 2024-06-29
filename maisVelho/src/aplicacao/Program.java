package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < nome.length; i++) {
			
			System.out.println("Dados da "+ (i+1) +"a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int maisVelho = 0;
		int posicao = 0;
		
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] > maisVelho) {
				maisVelho = idade[i];
				posicao = i;
			}						
		}
		
		System.out.println("Pessoa mais velha: " + nome[posicao]);
		sc.close();
	}

}
