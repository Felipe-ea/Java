package entidade;

public class Conta {

	private String nome;
	private int numeroDaConta;
	private double saldo = 00.0;
	
	public Conta(String nome, int numeroDaConta) {
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
	}
	public Conta(String nome, int numeroDaConta, double valorDoDeposito) {
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
		deposito(valorDoDeposito);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valorDoDeposito) {		
		saldo += valorDoDeposito;
	}

	public void saque(double valorDoSaque) {
		saldo = (saldo - 5.00) - valorDoSaque;
	}
	
	public String toString() {
		
		return "Número da conta: " + numeroDaConta + ",  Nome: " + nome + ", Saldo: $ " + String.format("%.2f", saldo);
		
	}
	
	
}
