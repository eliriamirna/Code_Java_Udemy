
public class soma_variavéis {

	public static void main(String[] args) {
		// 1. Este programa irá soma duas variáveis sendo que a segunda depende da primeira
		// 2. Cáculo de área de um trapézio
		// 3. Divisão com resultado casting double
		// 4. Divisão com resultado casting int
		
		//Declaração de variáveis
		
		//exemplo 1
		int x; 
		double y;
		
		//exemplo 2
		double b,B, h, A;
		
		//exemplo 3
		int a,c;
		double resultado;
		
		//exemplo 4
		double d;
		int e;
		
		//Entrada de dados e processamento
		
		//1
		x = 5;
		y = 2 * x;
		
		System.out.println("1. " + x +" e " + y);
		
		//2
		System.out.println();
		b = 6;
		B = 8;
		h = 5;
		
		A = (B+b)*h/2.0;
		
		System.out.println("2. " + A);
		System.out.println();
		
		//3
		a = 5;
		c = 2;
		resultado = (double) a/c;
		System.out.println("3. " + resultado);
		System.out.println();
		
		//4
		d = 5.0;
		e = (int) d;
		
		System.out.println("4. " + e);
		
			
					
		
	}

}
