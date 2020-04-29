package exercicio2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//Ler um número inteiro e dizer se ele é negativo ou não
		
		//Declaração de variáveis
		int num;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//Processamento e saída de dados
		if (num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
	
		sc.close();
		
		//fim main
		
			//fim classe

	}
}
