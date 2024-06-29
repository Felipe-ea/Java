package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		int menorDe16 = 0;
		double mediaAltura = 0.0;
		
		for (int i = 0; i<n; i++) {		
			System.out.println("Dados da "+ (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			sc.nextLine();
			altura[i] = sc.nextDouble();
			sc.nextLine();
			
			mediaAltura += altura[i];
			
			if (idade[i] < 16) {
				menorDe16++;
			}
			else {
				
			}
			
		}
			mediaAltura = mediaAltura / n;
			double porcentagemMenor = ((double)menorDe16 / n) * 100;
			
			System.out.printf("Altura média: %.2f%n", mediaAltura);
			System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n ", porcentagemMenor);
			
			for(int i1 = 0; i1<n; i1++) {
				if(idade[i1] < 16) {
					System.out.println(nome[i1]);
				}
			}
		
		
		
		sc.close();

	}

}
