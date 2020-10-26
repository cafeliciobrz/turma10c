package br.com.unixyz.modelo;
// implementa��o = principal = teste (camada onde tem o main())
// modelo = bens = javabeans = dto = to
/*
 * Design Patterns => DTO (Data Transfer Objet)
 * - Todo atributo DEVE ser privado
 * - Cada atributo deve possuir UM m�todo de imput (setter) e UM m�todo de output (getter)
 * - Cada Classe deve possuir no minim dois construtores
 *  (um vazio e o outro cheio - com todos os atributos)
 */

public class Aluno {
	private int rm;
	private String nome; // ou nome = "FORMATO"
	private String email;
	
	public Aluno() {
		super();
	}
	
	public Aluno (int rm, String nome, String email) {
		//nome = "Vazio"; // aqui ou na declara��o acima do parametro
		//email = "nomedoemail@dom�nio.com(br)";
		super();
		this.rm = rm;
		this.nome = nome;
		this.email= email;
	}
	
	
	public void setAll(int rm, String nome, String email) {
		this.rm = rm;
		this.nome = nome;
		this.email= email;
	}
	public String getAll() {
		return
				"RM....:" + rm + "\n" +
				"Nome..:" + nome + "\n" +
				"Email.:" + email;
		
	}
	
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}//fechar Chave da Clasee
