import java.util.Scanner;

public class tempo_jogo {

	public static void main(String[] args) {
		//Este programa ir� calcular a dura��o do tempo de um jogo de no m�x 24hrs.
		
		//Declara��o de vari�veis
		int hi, hf, ht;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Hora inicial");
		hi = sc.nextInt();
		System.out.println("Hora final");
		hf = sc.nextInt();
		
		//Processamento e sa�da de dados
		if (hi > hf) {
			ht = (24 - hi) + hf;
			System.out.println("O jogo durou " + ht + " horas.");
		}
		else if (hi == hf ) {
			ht = 24;
			System.out.println("O jogo durou " + ht + " horas.");
		}
		else {
			ht = hf - hi;
			System.out.println("O jogo durou " + ht + " horas.");
		}
		sc.close();
		
	}

}
