import java.util.Scanner;

public class imposto_lisarb {

	public static void main(String[] args) {
		//Cálculo de imposto sobre a renda de Lisarb
		
		//Declaração de variáveis
		double renda, imposto;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Informa o valor da renda: ");
		renda = sc.nextDouble();
		
		//Processamento e saída de dados
		if (renda >= 0 && renda <= 2000.00) {
			imposto = 0;
			System.out.println("Isento");		
		}
		else if (renda >= 2000.01 && renda <= 3000.00) {
			imposto = (renda - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		else if (renda >= 3000.01 && renda <= 4500.00) {
			imposto = (0.08 * 1000.00) + (renda - 3000.00) * 0.18;
			System.out.printf("R$ %.2f%n", imposto);
		}
		else {
			imposto = ((1000.00 * 0.08) + (1500.00 * 0.18) + (renda - 4500.00) * 0.28);
			System.out.printf("R$ %.2f%n", imposto);
		}
	}

}
