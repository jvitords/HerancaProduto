package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner digitar = new Scanner(System.in);
		List<Produto> listaDeprodutosRegistrados = new ArrayList<Produto>();
		
		System.out.println("===== PRODUTOS =====\n");
		
		System.out.print("Quantos produtos deseja registrar? ");
		int produtosParaRegistar = digitar.nextInt();
		
		while (listaDeprodutosRegistrados.size() < produtosParaRegistar) {
			
			System.out.print("Qual é o tipo do produto? (c/i/u)");
			digitar.nextLine();
			String tipoDoProduto = digitar.nextLine();
			
			switch (tipoDoProduto) {
			case "c":
				System.out.println("---- REGISTRO DE PRODUTO COMUM ----\n");
				System.out.print("Produto: ");
				String nomeProdutoComum = digitar.nextLine();
				System.out.print("Valor: R$");
				Double valorProdutoComum = digitar.nextDouble();
				Produto produtoComum = new Produto(nomeProdutoComum, valorProdutoComum);
				listaDeprodutosRegistrados.add(produtoComum);
				System.out.println("\nProduto 'Comum' registrado com sucesso! \n");
				break;
				
			case "i":
				System.out.println("---- REGISTRO DE PRODUTO IMPORTADO ----\n");
				System.out.print("Produto: ");
				String nomeProdutoImportado = digitar.nextLine();
				System.out.print("Valor: R$");
				Double valorProdutoImportado = digitar.nextDouble();
				System.out.print("Taxa da alfândega: R$");
				Double taxaDaAlfandegaDoProdutoImportado = digitar.nextDouble();
				Produto produtoImportado = new ProdutoImportado(nomeProdutoImportado, valorProdutoImportado, taxaDaAlfandegaDoProdutoImportado);
				listaDeprodutosRegistrados.add(produtoImportado);
				System.out.println("\nProduto 'Importado' registrado com sucesso! \n");
				break;
				
			case "u":
				System.out.println("---- REGISTRO DE PRODUTO USADO ----\n");
				System.out.print("Produto: ");
				String nomeProdutoUsado = digitar.nextLine();
				System.out.print("Valor: R$");
				Double valorProdutoUsado = digitar.nextDouble();
				SimpleDateFormat formatoDaData = new SimpleDateFormat("dd/MM/yyyy");
				System.out.print("Data do contrato: ");
				Date data = formatoDaData.parse(digitar.next());
				Produto produtoUsado = new ProdutoUsado(nomeProdutoUsado, valorProdutoUsado, data);
				listaDeprodutosRegistrados.add(produtoUsado);
				System.out.println("\nProduto 'Usado' registrado com sucesso! \n");
				break;

			default:
				System.out.println("\nLetra inválida\n");
				break;
			}
		}
		
		for (Produto produto : listaDeprodutosRegistrados) {
			System.out.println(produto);
		}
		
		
		digitar.close();
		
	}
}