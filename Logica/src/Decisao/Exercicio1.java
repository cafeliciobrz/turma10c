package Decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// Hotel cobra R$ 80,00 diaria + taxa de servi�o
		// Taxas de servi�o
		// R$ 5.50 dia se hospedagem > 15 dias
		// R$ 6.00 dia se hospedagem = 15 dias
		// R$ 8.00 dia se hospedagem < 15 dias
		// Escreva c�digo que leta 3 valores inteiros e diferentes e mostre em ordem descrecente
		double vdiaria  = 0;
		short dias  = Short.parseShort(JOptionPane.showInputDialog("Entre com quantidade de dias para Hospedagem"));
		if (dias>15) {
			vdiaria = 85.50;
		} else if (dias==15) {
			vdiaria = 86.00;
		}else {
			vdiaria = 88.00;
		}
		double totdiaria = (vdiaria*dias);
		JOptionPane.showMessageDialog(null, "Sua hospedagem � " + dias + " com valor total a ser pago � R$ " + totdiaria );
	}

}