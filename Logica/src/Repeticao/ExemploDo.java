package Repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		String candidato="";
		int totalx=0;
		int totalY=0;
		do {
			candidato = JOptionPane.showInputDialog("Digite <X> ou <Y>").toUpperCase();
		}while(candidato.contentEquals("X") || candidato.contentEquals("Y"));

	}

}
