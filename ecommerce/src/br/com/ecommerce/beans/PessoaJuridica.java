package br.com.ecommerce.beans;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	private String ie;
	private String contato;
	//Regra do Pattern, todo objeto é private e não pode ser protected(dificilmente usa)

	
	
	
	public void setAll(int id, String nome, String fone, Endereco endereco, String cnpj, String ie, String contato) {
		super.setAll(id, nome, fone, endereco);
		this.cnpj = cnpj;
		this.ie = ie;
		this.contato = contato;
	}
		
	
	
	
	public String getAll() {
		return
				// Antigo "Nome.....:" + cnpj + "\n" +
				// Antigo "CNPJ.....:" + cnpj + "\n" +
				// Antigo "IE.......:" + ie + "\n" +
				// Antigo "Contato..:" + contato;
				
				//getAll() sem espeficar classe pode dar looping pq existe na subclass e tem q colocar da sClass
				
				super.getAll() + "\n" +
				"CNPJ.....:" + cnpj + "\n" +
				"IE.......:" + ie + "\n" +
				"Contato..:" + contato;
				
				
	}
	

	public PessoaJuridica(int id, String nome, String fone, Endereco endereco, String cnpj, String ie, String contato) {
		super(id, nome, fone, endereco);
		this.cnpj = cnpj;
		this.ie = ie;
		this.contato = contato;
	}

	
	public PessoaJuridica() {
		super();
	}
	
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	

}
