package Repeticao;


public class DesafioDo {

	public static void main(String[] args) {
		int numero  = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, entre com n�mero"));
		int conta = 0;
		int chute = 0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2, advinha n�mero Jogador 1"));
			conta=conta+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				JOptionPane.showMessageDialog(null, "O n�mero � maior do que inserido pel Jogador 1);
			}else if  (numero<chute) {
				JOptionPane.showMessageDialog(null, "O n�mero � menor do que inserido pel Jogador 1);
			}
		}while(numero!=chute);
		System.out.println("Parab�ns!! voc� acertou o n�mero Jogador com " + conta + "tentativa(s)." );

	}
}
