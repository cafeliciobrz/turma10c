package Repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Entre com seu email").toLowerCase();
	while (email.indexOf("@")==-1) {
		email = JOptionPane.showInputDialog("Email deve ter @ Entre com seu nome").toLowerCase();
	}
    System.out.println(email);
    
    String nome = JOptionPane.showInputDialog("Entre Nome").toUpperCase();
    while (nome.lenth()<5 || nome.lenthe()>20) {
    	nome = JOptionPane.showInputDialog("Digite um nome entre 5 e 20").toUpperCase();
    }
    System.out.println(nome);
}