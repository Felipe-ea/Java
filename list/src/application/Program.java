package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		
		// Declara e instancia uma lista do tipo <String> (ArrayList é uma classe que otimiza a list)
		List<String> list = new ArrayList<>();
		
		// Adiciona um valor a list
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		// Adciona outro valor em uma posição específica
		list.add(2, "Marco");
		
		// list.remove("Alex"); ---> Remove o item da list
		// list.remove(1); ---> Remove  o item na posição especifica
		
		// Mostra o tamanho da lista
		System.out.println(list.size());
		
		// Mostra os elementos da list
		for (String x : list) {
			System.out.println(x);
		}
		
		// Remove todos os itens que o primeiro caractere for a letra M
		// O que está dentro do () se chama de predicado e é uma expressão Lambda
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		// Mostra o numero da posicao (index) do item indicado
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		// Filtra os itens da list baseado no predicado
		// Instacia List com o nome result
		// Converte para o tipo stream --> É um tipo que aceita predicados
		// .filter para filtrar usando um predicado
		// collect transforma para o tipo list novamente
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
			}
		
		// Mostra que se o filtro não achar nada ele retorna NULL
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}
}
