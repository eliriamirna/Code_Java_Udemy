import java.util.Scanner;

public class entrada_dados_aula24 {

	public static void main(String[] args) {
		
		//Entrada de dados aula 24
		
		//Declara��o de vari�veis
		Scanner sc = new Scanner(System.in); 
		String x;
		int y;
		double z;
		char w;
		String s1;
		
		//Entrada de dados e processamento
		x = sc.next();
		System.out.println("Voc� digitou " + x);
		
		y = sc.nextInt();
		System.out.println("Voce digitou o n�mero: " + y);
		
		z = sc.nextDouble();
		System.out.println("Voc� digitou o n�mero: " + z);
		
		w = sc.next().charAt(0);
		System.out.println("Voc� digitou o caractere: " + w);
		
		s1 = sc.nextLine();
		System.out.println("Voc� digitou: " + s1);
		
		sc.close();
	}

}
