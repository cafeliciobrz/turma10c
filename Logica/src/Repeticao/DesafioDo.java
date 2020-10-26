package Repeticao;


public class DesafioDo {

	public static void main(String[] args) {
		int numero  = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, entre com número"));
		int conta = 0;
		int chute = 0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2, advinha número Jogador 1"));
			conta=conta+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				JOptionPane.showMessageDialog(null, "O número é maior do que inserido pel Jogador 1);
			}else if  (numero<chute) {
				JOptionPane.showMessageDialog(null, "O número é menor do que inserido pel Jogador 1);
			}
		}while(numero!=chute);
		System.out.println("Parabéns!! você acertou o número Jogador com " + conta + "tentativa(s)." );

	}
}
