package br.edu.principal;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade;
		int qtd=0;
		int n=1;
		double media;
		double soma = 0;
	    System.out.println("Média das idades de um grupo de indivíduos");
	    System.out.println(" ");
	    System.out.println("Quando você digitar todas as idades digite 0 para finalizar.");
	    System.out.print("Digite a idade do 1º idivíduo: ");
	    idade = sc.nextInt();
	    
	    while (idade > 0) {
	        n++;
	        soma = soma + idade;
	        qtd = qtd + 1;
	        System.out.print("Insira a idade do "+n+"° idivíduo: ");
	        idade = sc.nextInt();
	    }
		
		System.out.println(" ");
		media = soma/qtd;
		System.out.println("A média das idades do grupo é igual a: "+media+" anos.");	
	}
}
