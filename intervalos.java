import java.util.Scanner;

public class intervalos {

	public static void main(String[] args) {
		//Mostrar que um n�mero est� dentro do intervalo [0,25], [25,50], [50,75], [75,100].
		
		//Declara��o de vari�veis
		double n;
		
		//Entrada de dados
		System.out.println("Entre com um n�mero");
		Scanner sc = new Scanner(System.in);
		n = sc.nextDouble();
		
		//Processamento e sa�da de dados
		if (0 <= n && n <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if (25 < n && n <= 50) {
			System.out.println("Intervalo [25,50]");
		}
		else if (50 < n && n <= 75) {
			System.out.println("Intervalo [50,75]");
		}
		else if (75 < n && n <= 100) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		sc.close();

	}

}
