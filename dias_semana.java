import java.util.Scanner;

public class dias_semana {

	public static void main(String[] args) {
		// Dias da semana.

		// Declara��o de vari�veis
		int n;
		String dia;

		// Entrada de dados
		System.out.println("Informe o n�mero: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		// Processamento e Sa�da de dados
		switch (n) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "ter�a";
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
			dia = "s�bado";
			break;
		default:
			dia = "n�mero inv�lido";
		}

		System.out.println("O dia da semana �: " + dia);

		sc.close();

	}

}
