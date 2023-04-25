package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		double n = 0;
		double e = 0;
		double i;
		double j;
		double FatNum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro e positivo: ");
		n = sc.nextDouble();

		e = 1;

		for(i = 1; i <= n; i++ ) {
			FatNum = 1;
			
			for(j = 1; j <= i; j++) {
				FatNum = FatNum * j;
			}
			
			e = e + 1/FatNum;
			
		}

		System.out.println("E é igual a "+new DecimalFormat(".##").format(e));
		System.out.println("Esse é o resultado seguinte a formula E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N! ");

			}
}
