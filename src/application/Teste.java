package application;

import java.util.Scanner;

import model.entities.Fornecedor;
import model.entities.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do fornecedor:");
		System.out.print("Código: ");
		int id = sc.nextInt();
		System.out.print("Razão social: ");
		sc.nextLine();
		String razao = sc.nextLine();
		System.out.print("Apelido: ");
		String apelido = sc.nextLine();
		System.out.print("CNPJ: ");
		String cnpj = sc.next();
		
		Fornecedor fornecedor = new Fornecedor(id, razao, apelido, cnpj);
		
		System.out.println(fornecedor);
		
		/*System.out.println();
		
		System.out.print("Entrada (s/n)? ");
		char entrada = sc.next().toLowerCase().charAt(0);
		
		if(entrada == 's') {
			System.out.print("Quantidade de entrada: ");
			int qtd = sc.nextInt();
			produto.entrada(qtd);
		}
		
		System.out.println(produto);
		
		System.out.print("Saída (s/n)? ");
		char saida = sc.next().toLowerCase().charAt(0);
		
		if(saida == 's') {
			System.out.print("Quantidade de saída: ");
			int qtd = sc.nextInt();
			produto.saida(qtd);
		}
		
		System.out.println(produto);*/
		
		sc.close();

	}

}
