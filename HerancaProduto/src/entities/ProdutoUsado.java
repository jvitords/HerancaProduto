package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{

	private LocalDate dataDaCompra;
	
	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, Double preco, LocalDate dataDaCompra) {
		super(nome, preco);
		this.dataDaCompra = dataDaCompra;
	}

	@Override
	public String etiqueta() {
		return getNome() + " (usado) - R$" + getPreco() + " (fabricado: " + dataDaCompra.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}
}
