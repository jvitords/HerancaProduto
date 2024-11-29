package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ProdutoUsado extends Produto{

	private Date dataDaCompra;
	
	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, Double preco, Date dataDaCompra) {
		super(nome, preco);
		this.dataDaCompra = dataDaCompra;
	}

	@Override
	public String etiqueta() {
		SimpleDateFormat formatoDaData = new SimpleDateFormat("dd/MM/yyyy");
		return getNome() + " (usado) - R$" + getPreco() + " (fabricado: " + formatoDaData.format(dataDaCompra) + ")";
	}
}
