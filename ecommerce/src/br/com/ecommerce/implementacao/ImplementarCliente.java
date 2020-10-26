package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.PessoaFisica;
import br.com.ecommerce.beans.PessoaJuridica;
import br.com.ecommerce.util.Magica;

public class ImplementarCliente {

	public static void main(String[] args) {
		// Como implementar com SuperClasse e subclasse

		// PessoaFisica pf = new PesseaFisica(); // Não tem seguranca arq fazendo assim
		
		// Cliente cli = new PessoaFisica(); // Forma correta 
		
		// Pode fazer a troca de Fiscia para Jurica - cli = new PessoaJuridica();
		
		Cliente c = new Cliente();
			
		int resposta =  Magica.i("Digite <1> PF ou <2> PJ");
		if (resposta==1)  {
			c = new PessoaFisica(
					1,
					"regina",
					"2516-1301",
					new Endereco(),
					"123.123.123.-00",
					"00.000.000-X"
					);
			
			
		}else if (resposta==2) {
			c = new PessoaJuridica(
					2,
					"Churras LTDA",
					"1004-4321",
					new Endereco(),
					"00.000.000/0001-00",
					"000.000.000.000",
					"SR JOAOZINHO"
					);
		}

		System.out.println(c.getAll());
		
	}

}
