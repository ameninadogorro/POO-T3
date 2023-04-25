package br.edu.principal;
import java.util.*;
public class Principal {
	public static void main(String[] args) {
		//q_28T3
		int cod ;
		int qtd;
		double valor_item = 0;
	    double valor_total = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o código do produto: ");
			cod = sc.nextInt();
			System.out.println("Digite o quantidade do produto: ");
				qtd = sc.nextInt();
				
				if (cod==100) {
					System.out.println("Cachorro Quente");
						valor_item =  1.20;
				}
				if (cod==101) {
					System.out.println("Bauru Simples");
						valor_item =  1.30;
				}
				if (cod==102) {
					System.out.println("Bauru com Ovo");
						valor_item = 1.50;
				}
				if (cod==103) {
					System.out.println("Hambúrguer");
						valor_item =  1.20;
				}
				if (cod==104) {
					System.out.println("Cheeseburguer");
						valor_item =  1.30;
				}
				if (cod==105) {
					System.out.println("Refrigerante");
						valor_item =  1.0;
				}
				System.out.println("O valor do item é: R$"+ valor_item);
				valor_total = qtd * valor_item;
				System.out.println("Deseja mais alguma coisa?(1.Sim e 2.Não)");
				 	int resposta = sc.nextInt();
			if (resposta == 2) {
				System.out.println("O valor total é: R$" + valor_total);
			}	
			
	  }
}
