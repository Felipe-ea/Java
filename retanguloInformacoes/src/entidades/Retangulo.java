package entidades;

public class Retangulo {
	
	public double largura;
	public double altura;

	
	public double calcularArea() {
		return largura * altura;
	}
	
	public double calcularPerimetro() {
		return (largura + altura) * 2.0;
	}
	
	public double calcularDiagonal() {
		return Math.sqrt((largura * largura) + (altura * altura));
	}
	
}
