package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner digitar = new Scanner(System.in);
		
		Produto produto = new Produto("Tenis", 300.0);
		Produto produtoImportado = new ProdutoImportado("TV", 1200.0, 50.0);
		
		SimpleDateFormat formatoDaData = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Data do contrato: ");
		Date data = formatoDaData.parse(digitar.next());
		System.out.println("Data: " + formatoDaData.format(data));
		 
		ProdutoUsado produtoUsado = new ProdutoUsado("Carro", 30000.0, data);
		
		System.out.println(produto.etiqueta());
		System.out.println(produtoImportado.etiqueta());
		System.out.println(produtoUsado.etiqueta());
		
		digitar.close();
	}
}