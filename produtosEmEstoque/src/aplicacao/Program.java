package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.next();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();		
		System.out.print("Digite os produtos a serem adicionados ao estoque: ");
		int quantidadeAdicionada = sc.nextInt();
		produto.adicionarProdutoAoEstoque(quantidadeAdicionada);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();		
		System.out.print("Digite os produtos a serem removidos do estoque: ");
		int quantidadeRemovida = sc.nextInt();
		produto.removerProdutosDoEstoque(quantidadeRemovida);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		
		
		
		sc.close();

	}

}
