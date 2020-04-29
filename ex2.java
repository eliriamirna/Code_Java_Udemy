package ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		//Progarama que diz se um número é par ou ímpar
		
		//Declaração de variáveis
		int n;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		//Processamento e saída de dados
		if (n % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
		}
		
	}
	