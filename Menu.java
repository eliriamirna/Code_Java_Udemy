import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
    //Este programa exibir� um menu para o usu�rio
		
	//Vari�veis
		int n;
		
	//Entrada de dados
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das op��es" + 
	"\n1. Cadastrar usu�rio" +
	"\n2.Alterando dados" +
	"\n3. Excluir usu�rio"));
		
	//Processamento e sa�da	
	switch (n) {    
	case 1:
		JOptionPane.showMessageDialog(null, "Aqui vc ir� cadastrar o usu�rio");
	break;
	
	case 2:
		JOptionPane.showMessageDialog(null, "Vamos alterar os dados?");
	break;
	
	case 3:
		JOptionPane.showMessageDialog(null, "Tem certeza que deseja excluir usu�rio?");
	 break;
	}
	//fim switch
	//fim m�todo main
	//fim classe
		
	}

}
