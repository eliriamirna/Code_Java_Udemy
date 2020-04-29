import java.util.Scanner;

public class entrada_dados_aula24 {

	public static void main(String[] args) {
		
		//Entrada de dados aula 24
		
		//Declaração de variáveis
		Scanner sc = new Scanner(System.in); 
		String x;
		int y;
		double z;
		char w;
		String s1;
		
		//Entrada de dados e processamento
		x = sc.next();
		System.out.println("Você digitou " + x);
		
		y = sc.nextInt();
		System.out.println("Voce digitou o número: " + y);
		
		z = sc.nextDouble();
		System.out.println("Você digitou o número: " + z);
		
		w = sc.next().charAt(0);
		System.out.println("Você digitou o caractere: " + w);
		
		s1 = sc.nextLine();
		System.out.println("Você digitou: " + s1);
		
		sc.close();
	}

}
