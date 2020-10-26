package Decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		// Peça para o usuário : nome e idade
		//Voce deve exibir
		//Obrigado a votar - se a idade for maior que 17 e menor que 70
		//Voto facultativo - se a idade for igual a 16 ou 17 ou idade for maior que 70
		//Proibido votar   - se a idade for menor que 16
		String nome = JOptionPane.showInputDialog("Entre com o seu nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua Idade"));
		if (idade>17 && idade<70) {
			JOptionPane.showMessageDialog(null, nome + " Seu VOTO é importante e pela idade você deve VOTAR");
		}
		if (idade==16 || idade==17 || idade>=70) {
			JOptionPane.showMessageDialog(null, nome + " Seu VOTO é importante e pela idade VOTO FACULTATIVO");
		}
		if (idade<16) {
			JOptionPane.showMessageDialog(null, nome + "Com esta idade, você é PROIBIDO VOTAR");
		}
	}

}
