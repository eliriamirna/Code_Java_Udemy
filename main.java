package exercicio2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//Ler um n�mero inteiro e dizer se ele � negativo ou n�o
		
		//Declara��o de vari�veis
		int num;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//Processamento e sa�da de dados
		if (num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("N�O NEGATIVO");
		}
	
		sc.close();
		
		//fim main
		
			//fim classe

	}
}
