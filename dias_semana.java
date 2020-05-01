import java.util.Scanner;

public class dias_semana {

	public static void main(String[] args) {
		// Dias da semana.

		// Declaração de variáveis
		int n;
		String dia;

		// Entrada de dados
		System.out.println("Informe o número: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		// Processamento e Saída de dados
		switch (n) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "número inválido";
		}

		System.out.println("O dia da semana é: " + dia);

		sc.close();

	}

}
