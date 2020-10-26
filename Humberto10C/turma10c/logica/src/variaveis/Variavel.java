package variaveis;

import javax.swing.JOptionPane;

public class Variavel {

	public static void main(String[] args) {
		/*
		 * Tipos de Dados=> 
		 * Alfanum�rico (String) : � o dado que n�o deve ser utilizado em opera��es aritm�ticas.
		 * CEP (dentro do contexto para o CEP dos colaboradores do Itau)
		 *  
		 * Num�rico: � o dado que pode ser utilizado em opera��es aritm�ticas e/ou
		 * ele � um dado chave de busca dentro da aplica��o.
		 * CEP (dentro de um contexto das aplica��es dos Correios)
		 * Dois tipos num�ricos:
		 * => int    => para n�meros inteiros
		 * => double => para n�meros reais (com casas decimais)
		 */
		
		String nome = JOptionPane.showInputDialog("Digite seu Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		double imc = peso / (altura*altura);
		//System.out.printf("Sr(a) %s, voc� tem %d anos de idade. Seu IMC � %.2f\n",
		//		nome,idade,imc);
		System.out.println("Usu�rio.: " + nome);
		System.out.println("Idade...: " + idade);
		// %f => numeros reais /// %s => Strings /// %d => inteiros 
		System.out.printf("IMC.....: %.2f\n", imc);
	}

}