package br.com.unixyz.modelo;
/*
 * Poliforfismo :é qdo o mesmo método possui comportamntos diferentes e o mesmo nome
 * 2 tipos:
 * Overload (sobrecarga) : qdo os métodos estão na mesma classe, 
 * com assinaturas diferentes ex.: retornMedia()
 * 
 * Override (sobrescrita): qdo os métodos estão em classes diferentes, 
 * podem possuir a mesma assinatura. E.: getAll()
 * 
 * classe formação pode ser uma classe abstrada, não é instanciada
 * Ex: public abstract class formacao. usar qdo a formação não será necessária dar um new Formacao na instalancia
 * 
 * 
 * encapusular - dar somente o real uso (exmplo dar acesso ao Banco para apagar dados, isso não deveser feito)
 */
		

public class Formacao {
	private String descricao;
	private int duracao;
	private float mensalidade;


	
	public void calcMnesalidade (double faot) {} // para atender os metodos que estao nas ubs
	
	public float calcMensalidade( float n1, float n2, float proj1, float proj2) {
		return n1*(float)0.4 + n2*(float)0.4 + proj1*(float)0.1 + proj2*(float)0.1;
	}
	
	
	
	public float retornarMedia( float n1, float n2) {
		return n1*(float)0.5 + n2*(float)0.5;
	}
	
	
	
	
	public String getAll() {
		return
				"Descrição..:" + descricao + "\n" +
				"Duracao....:" + duracao + "\n" +
				"Mensalidade:" + mensalidade;
	}


	
	
	public void setAll(String descricao, int duracao, float mensalidade) {
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}




	public Formacao(String descricao, int duracao, float mensalidade) {
		super();
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}
	
	
	
	
	public Formacao() {
		super();
	}




	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	
	
}
