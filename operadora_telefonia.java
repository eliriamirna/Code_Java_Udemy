import java.util.Locale;
import java.util.Scanner;

public class operadora_telefonia {

	public static void main(String[] args) {
		//C�lculo de valor a ser pago por uma telefonia baseado nos minutos consumidos
		
		//Declara��o de vari�veis
		int min;
		double valor;
		
		//Entrada de dados
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de minutos utilizados: ");
		min = sc.nextInt();
		
		//Processameno e Sa�da de dados
		valor = 50.00;
		if (min >= 0 && min <= 100) {
			System.out.printf("R$ %.2f%n", valor);
		}
		else {
			valor += + (min - 100) * 2;
			System.out.printf("R$ %.2f%n", valor);
		}
		
		sc.close();
	}

}
