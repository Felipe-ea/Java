package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta cliente;
				
		System.out.print("Digite o número da conta: ");
		int numeroDaConta = sc.nextInt();
		System.out.print("Digite o nome do cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Existe um depósito inicial? (s/n)");
		char depositoInicial = 'x';
		depositoInicial = sc.next().charAt(0);
		System.out.println();
		
		
		if(depositoInicial == 'S' || depositoInicial == 's') {
			
			System.out.print("Digite o valor do depósito: ");
			double valorDoDeposito = sc.nextDouble();
			
			cliente = new Conta(nome, numeroDaConta, valorDoDeposito);					
			
		}
		else {			
			cliente = new Conta(nome, numeroDaConta);						
		}
		
		System.out.println("Dados da conta:");
		System.out.println(cliente.toString());
		System.out.println();
		
		System.out.print("Digite o valor do depósito: ");
		double valorDoDeposito = sc.nextDouble();
		
		
		cliente.deposito(valorDoDeposito);
		
		System.out.println("Atualização dos dados da conta:");
		System.out.println(cliente.toString());
		System.out.println();
		
		System.out.print("Digite o valor do saque: ");
		double valorDoSaque = sc.nextDouble();
		
		cliente.saque(valorDoSaque);
		
		System.out.println("Atualização dos dados da conta:");
		System.out.println(cliente.toString());
		
		sc.close();

	}

}
