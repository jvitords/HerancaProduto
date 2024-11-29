package entities;

public class Produto {
	
	private String nome;
	private Double preco;
	private Double precoTotal;
	
	public Produto() {
	}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
		this.precoTotal = this.preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public String etiqueta () {
		return nome + " - R$" + preco;
	}
	
	public String toString() {
		return "Produto: " + nome;
	}
}