package Decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota 2"));
		float media = (nota1+nota2)/2; 
		if (media>=6) {
			System.out.println("Aprovado com media..:" + media);
		}else if (media<4) {
			System.out.println("Reprovado com media..:" + media);
		}else if (media>=4 && media<6) {
			JOptionPane.showMessageDialog(null, nome + " ESFORCE!! Voc� ainda tem chance de passar");;
		}
		JOptionPane.showMessageDialog(null, " FUIIII.....TCHAU");;
		/*
		 * and => &&
		 * or => ||
		 * 
		 */
	}

}
