package application;

import java.util.Scanner;

import model.entities.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto a, b;
		
		a = new Produto();
		b = new Produto();
		
		System.out.println("Digite os dados do produto a:");
		System.out.print("ID: ");
		a.idProduto = sc.nextInt();
		sc.nextLine();
		System.out.print("Descrição interna: ");
		a.descricaoInterna = sc.nextLine();
		System.out.print("Entrada: ");
		int qtdA = sc.nextInt();
		a.entrada(qtdA);
		
		System.out.print("\nDigite os dados do produto b: ");
		System.out.print("ID: ");
		b.idProduto = sc.nextInt();
		sc.nextLine();
		System.out.print("Descrição interna: ");
		b.descricaoInterna = sc.nextLine();
		System.out.print("Entrada: ");
		int qtdB = sc.nextInt();
		b.entrada(qtdB);
		
		System.out.println();
		
		System.out.println(a);
		System.out.println(b);
		
		sc.close();

	}

}
