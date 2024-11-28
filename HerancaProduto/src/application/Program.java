package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner digitar = new Scanner(System.in);
		
		Produto produto = new Produto("Tenis", 300.0);
		Produto produtoImportado = new ProdutoImportado("TV", 1200.0, 50.0);
		
		LocalDate data = LocalDate.parse(digitar.next(), DateTimeFormatter.ofPattern("dd//MM/yyyy"));
		
		ProdutoUsado produtoUsado = new ProdutoUsado("Carro", 30000.0, data);
		
		System.out.println(produto.etiqueta());
		System.out.println(produtoImportado.etiqueta());
		System.out.println(produtoUsado.etiqueta());
		
	}
}