import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	//exercicio5
		
    //Declara��o de vari�veis
		double A, B, C, areaTri, areaCir, areaTra, areaQua, areaRet;
	
	//Entrada de dados
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
	//Processamento e Sa�da de dados
		
		areaTri = A * C/2;
		areaCir = Math.PI * Math.pow(C, 2.0);
		areaTra = ((A + B) * C)/2;
		areaQua = Math.pow(B, 2.0);
		areaRet = A * B;
		
		System.out.printf("A �rea do tri�ncgulo ret�ngulo que tem A por base e C por altura = %.2f%n", areaTri);
		System.out.printf("A �rea do c�rculo de raio C = %.2f%n", areaCir);
		System.out.printf("A �rea do trap�zio que tem A e B por bases e C por altura = %.2f%n", areaTra);
		System.out.printf("A �rea do qyadrado que tem lado B = %.2f%n", areaQua);
		System.out.printf("A �rea do ret�ngulo que tem lados A e B = %.2f%n", areaRet);
		
		sc.close();
	}

}
