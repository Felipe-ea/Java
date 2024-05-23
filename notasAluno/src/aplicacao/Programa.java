package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudante;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante  estudante = new Estudante();
		
		System.out.print("Nome: ");
		estudante.nome = sc.nextLine();
		System.out.print("Nota 1: ");
		estudante.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		estudante.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		estudante.nota3 = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("Nota final: %.2f%n", estudante.calcularNotaFinal());
		System.out.println(estudante.aprovadoOuReprovado());
		
		if (estudante.aprovadoOuReprovado() == "Reprovado")  {
			System.out.printf("Faltam %.2f pontos", (60 - estudante.calcularNotaFinal()));
		}else {
			return;
		}
	}

}
