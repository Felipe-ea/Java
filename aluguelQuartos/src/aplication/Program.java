package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluguel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos voce irá alugar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Aluguel[] estudante = new Aluguel[10];
		String nome;
		String email;
		int nQuarto = 0;
		
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Aluguel #" + (i+1) +":");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();			
			System.out.print("Quarto: ");
			nQuarto = sc.nextInt();
			sc.nextLine();
		
			estudante[nQuarto] = new Aluguel(nome, email, nQuarto);
		}
		
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < estudante.length; i++) {
			
			if (estudante[i] != null) {
				
				System.out.println(estudante[i].getnQuarto() + ": " + estudante[i].getNome() + ", " + estudante[i].getEmail());
				
			}
			
		}
		
		sc.close();

	}

}
