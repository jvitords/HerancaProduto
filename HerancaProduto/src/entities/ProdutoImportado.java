package entities;

public class ProdutoImportado extends Produto{

	private Double taxaDeAlfandega;
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, Double preco, Double taxaDeAlfandega) {
		super(nome, preco);
		this.taxaDeAlfandega = taxaDeAlfandega;
	}
	
	@Override
	public String etiqueta () {
		return getNome() + " - R$" + precoTotal() + " (Taxa de alfândega: R$" + taxaDeAlfandega;
	}
	
	public Double precoTotal() {
		return getPreco() + taxaDeAlfandega;
	}
	
	public String toString() {
		return "Produto: " + getNome() + "\nPreço total: R$" + precoTotal() + "\nTaxa da alfândega: R$" + taxaDeAlfandega;
	}
}															