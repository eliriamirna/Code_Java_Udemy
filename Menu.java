import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
    //Este programa exibirá um menu para o usuário
		
	//Variáveis
		int n;
		
	//Entrada de dados
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções" + 
	"\n1. Cadastrar usuário" +
	"\n2.Alterando dados" +
	"\n3. Excluir usuário"));
		
	//Processamento e saída	
	switch (n) {    
	case 1:
		JOptionPane.showMessageDialog(null, "Aqui vc irá cadastrar o usuário");
	break;
	
	case 2:
		JOptionPane.showMessageDialog(null, "Vamos alterar os dados?");
	break;
	
	case 3:
		JOptionPane.showMessageDialog(null, "Tem certeza que deseja excluir usuário?");
	 break;
	}
	//fim switch
	//fim método main
	//fim classe
		
	}

}
