package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "reGina@gama.Academy";
		System.out.println("Original           : " + email);
		System.out.println("Minuscula          : " + email.toLowerCase());
		System.out.println("Maiscula           : " + email.toUpperCase());
		System.out.println("Qtidade Caracteres : " + email.length());
		System.out.println("Posi��o do @       : " + email.indexOf("@"));
		System.out.println("Exibir do 2 at� 4  : " + email.substring(1,4));
		System.out.println("Exibir 3 at� fim   : " + email.substring(2));
		System.out.println("Exibir 1 netade    : " + email.substring(0, email.length()/2));
		
		//Exibir o usu�rio do email (antes do @)
		System.out.println("usu�rio            : " + email.substring(0, email.indexOf("@")));
		
		
		//Exibir o usu�rio do email (depois do @)
		System.out.println("Dom�nio            : " + email.substring(email.indexOf("@")+1));
		
		System.out.println("Primeiro Caracter  : " + email.charAt(4));
		System.out.println("Compara��o" + (email.equals("reGina@gama.Academy"));
		System.out.println("Compara��o ignorando caixa:" + email.equalsIgnoreCase("reGina@Gama.Academy"));
		
		

	}

}
