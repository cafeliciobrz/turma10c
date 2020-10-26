package br.com.unixyz.implementacao;


import br.com.unixyz.modelo.Formacao;
import br.com.unixyz.util.Magica;


public class ImplementarFormacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formacao formacao = null;
		
		char respota = Magica.s("Digite \n<T> Tecnologo \n<B> Bacharelado ou \n<M> Medio").charAt(0);
		if (resposta=='T') {
			formacao = new Tecnologo(
						Magica.s("Descricao"),
						Magica.i("Duracao"),
						Magica.f("Mensalidade"),
						true
						);
		}else if (resposta=='B') {
			formacao = new Bacharelado(
					Magica.s("Descricao"),
					Magica.i("Duracao"),
					Magica.f("Mensalidade"),
					Magica.i("Carga Horaria Estagio"),
					Magica.s("TCC")
					);
		}else {
			formacao = new Medio(
					Magica.s("Descricao"),
					Magica.i("Duracao"),
					Magica.f("Mensalidade"),
					Magica.s("Tipo")
					);
		}
		
		formacao.calcMensalidade(0.0005);
		System.out.println(formacao.getAll();
		System.out.println(formacao.retornarMedia(5,7,4,10));
	
		
	}

}
