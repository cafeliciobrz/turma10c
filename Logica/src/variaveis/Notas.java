package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		// Imput -> nome aluno, disciplina, duas notas
		// Exibir o nome do aluno, a m�dia e a disciplina
		// Entrar dia 02 - N�mero de faltas onde maior que 20 reprovado
		String alunonome = JOptionPane.showInputDialog("Informe nome do Aluno");
		String alunodisc = JOptionPane.showInputDialog("Informe nome da Disciplina");
		float alunonota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor Nota 1"));
		float alunonota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor Nota 2"));
		float alunomedia = (alunonota1+alunonota2)/2;
		byte alunofalta = Byte.parseByte(JOptionPane.showInputDialog("Digite a quantidade de faltas"));
		if (alunomedia>=6 && alunofalta<=20) {
			JOptionPane.showMessageDialog(null, "O aluno " + alunonome+ " na disciplina " + alunodisc + " fechou com m�dia " + alunomedia + " esta com n�mero de faltas = " + alunofalta + " e foi aprovado");
		}else if (alunomedia<4 || alunofalta>20){
			JOptionPane.showMessageDialog(null, "O aluno " + alunonome+ " na disciplina " + alunodisc + " fechou com m�dia " + alunomedia + " esta com n�mero de faltas = " + alunofalta + " e foi reprovado");
		}
		//Mesma linha para System.out 
		//System.out.printf("%s sua m�dia na disciplina %s foi de %.2f",alunonome,alunodisc,alunomedia);
		
		//Coloca em uma janela fora e o null vai centralizar a caixa de sa�da com seu monitor
		//JOptionPane.showMessageDialog(null, alunonome + "\n" + alunodisc + "\n" + alunomedia);
		
	}

}
