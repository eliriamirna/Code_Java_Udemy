package ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		//Progarama que diz se um n�mero � par ou �mpar
		
		//Declara��o de vari�veis
		int n;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		//Processamento e sa�da de dados
		if (n % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("�MPAR");
		}
		
		sc.close();
		}
		
	}
	