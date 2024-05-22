package entidades;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque() {
		
		return quantidade * preco;
		
	}
	
	public void adicionarProdutoAoEstoque(int quantidade) {
		
		this.quantidade += quantidade;
		
	}
	
	public void removerProdutosDoEstoque(int quantidade) {
		
		this.quantidade -= quantidade;
		
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, total: $" + String.format("%.2f", totalValorEmEstoque());
	}
}
