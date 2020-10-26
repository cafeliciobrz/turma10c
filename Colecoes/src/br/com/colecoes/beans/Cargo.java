package br.com.colecoes.beans;

public class Cargo {
	private String nome;
	private String nivel;
	private float salario;
	private float totalsalario;
	
	
	
	public Cargo(String nome, String nivel, float salario, float totalsalario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
		this.totalsalario = totalsalario;
	}



	public Cargo() {
		super();
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public float getTotalsalario() {
		return totalsalario;
	}


	public void setTotalsalario(float totalsalario) {
		this.totalsalario = totalsalario;
	}
	
	

	
	

}
