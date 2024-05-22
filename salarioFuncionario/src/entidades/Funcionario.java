package entidades;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double calcularSalarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void calcularSalarioComAumento(double percentualAumento) {
		salarioBruto += salarioBruto * percentualAumento / 100.0;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", calcularSalarioLiquido());
	}

}
