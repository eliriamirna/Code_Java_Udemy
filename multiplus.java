import java.util.Scanner;

public class multiplus {

	public static void main(String[] args) {
		//Este programa irá calcular se 2 números são múltiplus ou não
		
		//Declaração de variáveis
		double A, B;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		//Processamento e saída de dados
		if(A % B == 0 || B % A == 0) {
			System.out.println("São Múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
		sc.close();
		
	}

}
