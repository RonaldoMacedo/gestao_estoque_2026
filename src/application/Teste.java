package application;

import java.util.Scanner;

import model.entities.Fornecedor;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Fornecedor a, b;
		
		a = new Fornecedor();
		b = new Fornecedor();
		
		System.out.println("Entre com os dados do fornecedor a:");
		System.out.print("ID: ");
		a.idFornecedor = sc.nextInt();
		sc.nextLine();
		System.out.print("Razão social: ");
		a.razaoSocial = sc.nextLine();
		System.out.print("Apelido: ");
		a.apelido = sc.nextLine();
		System.out.print("CNPJ: ");
		a.cnpj = sc.next();
		
		System.out.println("\nEntre com os dados do fornecedor b:");
		System.out.print("ID: ");
		b.idFornecedor = sc.nextInt();
		sc.nextLine();
		System.out.print("Razão social: ");
		b.razaoSocial = sc.nextLine();
		System.out.print("Apelido: ");
		b.apelido = sc.nextLine();
		System.out.print("CNPJ: ");
		b.cnpj = sc.next();
		
		sc.close();

	}

}
