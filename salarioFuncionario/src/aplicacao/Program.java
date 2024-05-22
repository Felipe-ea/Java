package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite os dados do funcionário: ");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + funcionario);
		
		System.out.print("Digite o percentual de aumento do salário: ");
		double percentualAumento = sc.nextDouble();
		funcionario.calcularSalarioComAumento(percentualAumento);
		
		System.out.println("Funcionário: " + funcionario);
		
		
		
		sc.close();
		
	}

}
