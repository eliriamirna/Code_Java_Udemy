import java.util.Locale;
import java.util.Scanner;

public class lanchonete_cod_preco {

	public static void main(String[] args) {
		//Um programa que leia o código de um item e a quantidade desse item com o preço final
		
		//Declaração de variáveis
		int cod, quant;
		double v1, v2, v3, v4, v5, preco;
		
		//Entrada de dados
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o código do produto: ");
		cod = sc.nextInt();
		System.out.println("Entre com a quantidade do produto: ");
		quant = sc.nextInt();
		v1 = 4.00;
		v2 = 4.50;
		v3 = 5.00;
		v4 = 2.00;
		v5 = 1.50;
				
		//Processamento e saída de dados
		if (cod == 1) {
			preco = quant * v1;
			System.out.printf("Total = R$ %.2f%n", preco);
		}
		else if (cod == 2) {
			preco = quant * v2;
			System.out.printf("Total = R$ %.2f%n", preco);
		}
		else if (cod == 3) {
			preco = quant * v3;
			System.out.printf("Total = R$ %.2f%n", preco);
		}
		else if (cod == 4) {
			preco = quant * v4;
			System.out.printf("Total = R$ %.2f%n", preco);
		}
		else {
			preco = quant * v5;
			System.out.printf("Total = R$ %.2f%n", preco);
		}
		sc.close();

	}

}
