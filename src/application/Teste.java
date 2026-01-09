package application;

import java.util.Scanner;

import model.entities.Item;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do item:");
		System.out.print("Código: ");
		int id = sc.nextInt();
		System.out.print("Descrição: ");
		sc.nextLine();
		String descricao = sc.nextLine();
		System.out.print("Código ref: ");
		String ref = sc.nextLine();
		System.out.print("Código de barras: ");
		String codigoDeBarras = sc.next();
		
		System.out.println();
		
		System.out.print("Entrada (s/n)? ");
		char entrada = sc.next().toLowerCase().charAt(0);
		
		if(entrada == 's') {
			System.out.print("Quantidade de entrada: ");
			int qtd = sc.nextInt();
			Item item = new Item(id, descricao, ref, codigoDeBarras, qtd);
			System.out.println(item);
			item.entrada(qtd);
		}else {
			Item item = new Item(id, descricao, codigoDeBarras, codigoDeBarras);
			System.out.println(item);
		}
		
		sc.close();

	}

}
