import javax.swing.JOptionPane;

public class Main { 

	public static void main(String[] args) {
		//Calcular se um n�mero � maior ou igual a 100
		
	//declarar vari�veis
		double n;
		String aux;
		
	//entrada de dados
	aux = JOptionPane.showInputDialog("Digite um n�mero");
	n = Double.parseDouble(aux);
	
	//processamento e sa�da
	if (n>=100) {
		JOptionPane.showMessageDialog(null, "Este n�mero � maior ou igual a 100");
	}else {
			JOptionPane.showMessageDialog(null, "Este n�mero n�o � maior u igual a 100");
			
		}
	
		

	}

}
