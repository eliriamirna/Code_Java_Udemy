import java.util.Locale;
import java.util.Scanner;

public class operadora_telefonia {

	public static void main(String[] args) {
		//Cálculo de valor a ser pago por uma telefonia baseado nos minutos consumidos
		
		//Declaração de variáveis
		int min;
		double valor;
		
		//Entrada de dados
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de minutos utilizados: ");
		min = sc.nextInt();
		
		//Processameno e Saída de dados
		if (min >= 0 && min <= 100) {
			valor = 50.00;
			System.out.printf("R$ %.2f%n", valor);
		}
		else {
			valor = 50.00 + (min - 100) * 2;
			System.out.printf("R$ %.2f%n", valor);
		}
		
		sc.close();
	}

}
