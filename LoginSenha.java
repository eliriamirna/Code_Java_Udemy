/*
 * Elabore um programa que faça a leitura de um nome de usuário e uma senha,
liberando o acesso a um determinado aplicativo somente se ambas as entradas
estiverem corretas.

 * */

import javax.swing.JOptionPane;

       public class LoginSenha {

        public static void main(String[] args) {
        //Este progama libera o acesso para login e senha corretos
        // Login e senha
        // login = aluno
        // senha = aluno

        //declaração de variáveis
        String login, senha; // variáveis para armazenar o login e senha

        //entrada de dados	
        login = JOptionPane.showInputDialog("Entre com o Login");
        senha = JOptionPane.showInputDialog("Entre com a senha");

        if (login.equals("aluno") && senha.equals("aluno")) {
        JOptionPane.showMessageDialog(null, "Acesso liberado");
        } else {
        JOptionPane.showMessageDialog(null, "Login ou senha incorretos");
        } // fim do if

      } //fim do main
} // fim da classe
