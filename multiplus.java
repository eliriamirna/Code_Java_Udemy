import java.util.Scanner;

public class multiplus {

	public static void main(String[] args) {
		//Este programa ir� calcular se 2 n�meros s�o m�ltiplus ou n�o
		
		//Declara��o de vari�veis
		double A, B;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		//Processamento e sa�da de dados
		if(A % B == 0 || B % A == 0) {
			System.out.println("S�o M�ltiplos");
		}
		else {
			System.out.println("N�o s�o m�ltiplos");
		}
		sc.close();
		
	}

}
