package br.com.ecommerce.beans;

public class PessoaFisica extends Cliente{ 	//Como indicar que a subclasse PessoaFisica é filha da superclasse Cliente
	private String cpf;
	private String rg;
	

	
	
	

		
	public void setAll(int id, String nome, String fone, Endereco endereco, String cpf, String rg) {
		super.setAll(id, nome, fone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getall() {
		return
				super.getAll() + "\n" +
				"CPF.:" + cpf + "\n" +
				"RG..:" + rg;
				
	}

	public PessoaFisica(int id, String nome, String fone, Endereco endereco, String cpf, String rg) {
		super(id, nome, fone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	

	public PessoaFisica() {
		super();
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}


}


//final Class
