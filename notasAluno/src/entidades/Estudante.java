package entidades;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calcularNotaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String aprovadoOuReprovado() {
		if (calcularNotaFinal() >= 60.00){
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}
	
}
