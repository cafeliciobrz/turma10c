package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;

public class ImplementarCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso objeto = new Curso(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showImputDiaglog("Descri��o").toUpperCase(),
				Float.parse.Float(JOptionPane.showInputDialog("Valor")),
				Integer.parseInt(JOptionPane.showInputDialog("Carga Hor�rio")),
				);
		

	}

}