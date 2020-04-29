import java.util.Scanner;

public class quadrantes {

	public static void main(String[] args) {
		//Posicionar quadrantes de um ponto com coordenadas (x,y)
		
		//Declaração de variáveis
		double x, y;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor da coordenada x: ");
		x = sc.nextDouble();
		System.out.println("Entre com o valor da coordenada y: ");
		y = sc.nextDouble();
		
		//Processamento e Saída de dados
		if (x > 0 && y > 0) {
			System.out.println("Q1");
			}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x == 00 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0) {
			System.out.println("Eixo x");
		}
		else {
			System.out.println("Eixo y");
		}
		sc.close();
		

	}

}
