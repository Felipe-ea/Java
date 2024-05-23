package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio do circulo: ");
		double raio = sc.nextDouble();
		
		double c = Calculadora.calcularCircinferencia(raio);
		
		double v = Calculadora.calcularVolume(raio);		
		
		sc.close();
		
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculadora.PI);
	}

}
