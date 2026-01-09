package application;

import java.util.Scanner;

import model.entities.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Código: ");
		int id = sc.nextInt();
		System.out.print("Descrição: ");
		String descricao = sc.nextLine();
		sc.nextLine();
		
		Produto produto = new Produto(id, descricao, 0);
		
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
		
		System.out.println(produto);
		
		sc.close();

	}

}
