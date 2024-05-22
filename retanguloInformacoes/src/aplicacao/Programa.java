package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Digite a largura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		System.out.print("Digite a altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("Area: %.2f%n", retangulo.calcularArea());
		System.out.printf("Perimetro: %.2f%n", retangulo.calcularPerimetro());
		System.out.printf("Diagonal: %.2f%n", retangulo.calcularDiagonal());

	}

}
