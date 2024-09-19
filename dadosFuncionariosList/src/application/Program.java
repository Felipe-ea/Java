package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// List do tipo Funcionário com o nome list -> Declara e instancia uma lista*** -> ArrayList é uma classe que implementa a interface
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();
		
		// Laço for para receber os parametros do objeto Funcionario
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Funcionário #"+(i+1)+":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			// Usa funcao auxiliar para verificar se o o id ja existe na lista e informa ao usuário
			while (temId(list, id)) {
				System.out.print("Id já existe! Tente denovo: ");
				id = sc.nextInt();
			}			
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			// Instancia o objeto funcionario
			Funcionario funcionario = new Funcionario(id, nome, salario);
			// Adiciona o objeto funcionario a lista
			list.add(funcionario);
			
			// Instancia e adiciona a lista direto ** list.add(new Employee(id, name, salary)); **
		}
		
		System.out.println();
		System.out.print("Entre com o ID do funcionário que terá o aumento: ");
		int id = sc.nextInt();
		// liste.stream transforma no tipo stream(que aceita expressoes lambda) -> filter todo x tal que x.getId seja igual ao id digitado(filtra todos os itens da lista que o id seja igual ao id difitado) -> find.first(vai pegar o primeiro) -> orElse(se não houver recebe null)
		Funcionario funcionario =list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (funcionario == null) {
			System.out.println();
			System.out.print("Esse ID não existe!");
		}
		else {
			System.out.print("Entre com a porcentagem de aumento: ");
			double porcentagemDeAumento = sc.nextDouble();
			funcionario.calcularAumentoDeSalario(porcentagemDeAumento);
		}
		
		System.out.println();
		System.out.println("Lista de funcionários:");
		// Para cada Funcionario funcionario na lista list imprima funcionario ( no caso obj)
		for (Funcionario obj : list) {
			System.out.println(obj);
		}		
		sc.close();
	}
	
	// Funcao que retorna true or false para determinar se o id existe na lista
	public static boolean temId(List<Funcionario> list, int id) {
		
		Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
	}
	

}
