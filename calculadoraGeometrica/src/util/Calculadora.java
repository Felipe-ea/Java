package util;

public class Calculadora {
	
	public static final double PI = 3.14159;
	
	public static double calcularCircinferencia(double raio) {
		return (2.0 * PI) * raio;
	}
	
	public static double calcularVolume(double raio) {
		
		return 4.0 * PI * raio * raio * raio / 3.0;
		
	}
	
}
