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
		String codigoREF = sc.next();
		System.out.print("Código de barras: ");
		String codigoBarras = sc.next();
		
		Item item = new Item(id, descricao, codigoREF, codigoBarras, 0);
		
		System.out.print("Entrada (s/n)? ");
		char entrada = sc.next().toLowerCase().charAt(0);
		
		if(entrada == 's') {
			System.out.print("Quantidade de entrada: ");
			int qtd = sc.nextInt();
			item.entrada(qtd);
		}
		
		System.out.println(item);
		
		System.out.print("Saída (s/n)? ");
		char saida = sc.next().toLowerCase().charAt(0);
		
		if(saida == 's') {
			System.out.print("Quantidade de saída: ");
			int qtd = sc.nextInt();
			item.saida(qtd);
		}
		
		System.out.println(item);
		
		sc.close();

	}

}
