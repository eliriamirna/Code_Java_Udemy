import javax.swing.JOptionPane;

public class papelaria_produtos {

	public static void main(String[] args) {
		//C�digos cadastrados e produtos
		
		//Vari�veis
		int cod;
		
		//Entrada de dados
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do produto"));
		
		//Processamento e Sa�da
		switch (cod) {
		case 100:
			JOptionPane.showMessageDialog(null,"L�pis preto N.2");
		break;
		
		case 150:
			JOptionPane.showMessageDialog(null, "Borracha branca");
		break;
		
		case 200:
			JOptionPane.showMessageDialog(null, "Caneta Azul");
		break;
		
		case 230:
			JOptionPane.showMessageDialog(null, "Caneta Vermelha");
		break;
		
		case 256:
			JOptionPane.showMessageDialog(null, "Giz de cera 12und.");
		break;
		
		case 300:
			JOptionPane.showMessageDialog(null, "Cartolina Branca");
		break;
		
		case 310:
			JOptionPane.showMessageDialog(null, "Resma de sulfite branco A4");
		break;
		
		case 400:
			JOptionPane.showMessageDialog(null, "Estojo escolar verde");
		break;
		
		case 470:
			JOptionPane.showMessageDialog(null, "Caderno universit�rio 100fls.");
		break;
		
		case 500:
			JOptionPane.showMessageDialog(null, "Caderno brochura 50fls.");
		break;
		
		}
		//fim switch
		//fim do main
		//fim da classe
			
			

	}

}
