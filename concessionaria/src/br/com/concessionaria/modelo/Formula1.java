package br.com.concessionaria.modelo;

public class Formula1 {
   
   private String cor;
   private String escuderia;
   private boolean status;
   private float velocidadeAtual;
   private float valor;
   private float acelerar;
   private float desacelerar;
   //Sintaxe para os metodos
   // <modificador> <tipo do retorno> <nomeMetodo> (<TipoParam> <nomeParam>){
   //preencherCor() - preencherValor() - retornarCor() - retornarvalor()
   
   public void preencherEscuderia(String pEscuderia) {
	   escuderia = pEscuderia.toUpperCase();
	   
   }
 
   public String retornarEscuderia() {
	  return escuderia;
   }
   

   public void preencherCor(String pCor) {
	   cor = pCor.toUpperCase();
   }
   
   public String retornarCor() {
	   return cor;
   }
   
   public void preencherValor (Float pValor) {
	   valor = pValor;
   }
   
   public Float retornarValor() {
	   return valor;
   }
    
   
   public String retornarLiga() {
	   status=false;
	   return "Carro LIGADO!!";
   }
   

   public String retornarDesliga() {
	   status=false;
	   return "Carro DESLIGADO!!";
   }
    
   public void acelerar(float pVelocidade) {
	   if (status==true) {
		   velocidadeAtual+=pVelocidade;
	   }
   }
   
   public void desacelerar(float pVelocidade) {
	   if (status==false) {
	   velocidadeAtual-=pVelocidade;
	   if (velocidadeAtual<0) {
		   velocidadeAtual=0;
	   }
	   }
   }
   
   public float retornarVelocidadeAtual() {
	   return velocidadeAtual;
   }
   
   

   



}// Fechar Classe
