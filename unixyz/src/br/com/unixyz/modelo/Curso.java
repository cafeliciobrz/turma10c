package br.com.unixyz.modelo;

public class Curso {
	private int id;
	private String descri��o;
	private float valor;
	private int cargaHoraria;
	
	
	
	
	
	public Curso(int id, String descri��o, float valor, int cargaHoraria) {
		super();
		this.id = id;
		this.descri��o = descri��o;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
	
	public Curso() {
		super();
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	

}
