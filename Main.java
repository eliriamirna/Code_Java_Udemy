import javax.swing.JOptionPane;

public class Main { 

	public static void main(String[] args) {
		//Calcular se um número é maior ou igual a 100
		
	//declarar variáveis
		double n;
		String aux;
		
	//entrada de dados
	aux = JOptionPane.showInputDialog("Digite um número");
	n = Double.parseDouble(aux);
	
	//processamento e saída
	if (n>=100) {
		JOptionPane.showMessageDialog(null, "Este número é maior ou igual a 100");
	}else {
			JOptionPane.showMessageDialog(null, "Este número não é maior u igual a 100");
			
		}
	
		

	}

}
