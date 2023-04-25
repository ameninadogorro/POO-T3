package br.edu.principal;
import java.util.*;
public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      double base;
	      double altura;
	      double area;

	      System.out.print("Informe a medida da base do triângulo: ");
	      base = sc.nextDouble();
	      while (base <= 0) {
	         System.out.println("A base do triângulo deve ser maior que zero. Tente novamente.");
	         System.out.print("Informe a medida da base do triângulo: ");
	         base = sc.nextDouble();
	      }

	      System.out.print("Informe a medida da altura do triângulo: ");
	      altura = sc.nextDouble();
	      while (altura <= 0) {
	         System.out.println("A altura do triângulo deve ser maior que zero. Tente novamente.");
	         System.out.print("Informe a medida da altura do triângulo: ");
	         altura = sc.nextDouble();
	      }
	      area = (base * altura) / 2;
	      System.out.println("A área do triângulo é: " + area);
	   }
}
