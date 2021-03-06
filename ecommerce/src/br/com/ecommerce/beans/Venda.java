package br.com.ecommerce.beans;

public class Venda {
	private int notafiscal;
	private float total;
	private float desconto;
	private String data;
	private Produto produto;
	
	public String getAll();
		return
				"Nota Fiscal..: " + notafiscal + "\n" +
				"Total........: " + total + "\n" +
				"Desconto.....: " + desconto + "\n" +
				"Data.........: " + data;
	
	
	public Venda(int notafiscal, float total, float desconto, String data, Produto produto) {
		super();
		this.notafiscal = notafiscal;
		this.total = total;
		this.desconto = desconto;
		this.data = data;
		this.produto = produto;
	}
	
	
	
	
	public Venda() {
		super();
	}




	public int getNotafiscal() {
		return notafiscal;
	}
	public void setNotafiscal(int notafiscal) {
		this.notafiscal = notafiscal;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	

}
