package br.com.televisao.modelo;

public class Televisao {
	   private String marca;
	   private boolean status;
	   private float valor;
	   private int canal;
	   private float volume;
	   public void preencherMarca(String pMarca) {
		   marca = pMarca.toUpperCase();	   
	   }
	   public String retornarMarca() {
		   return marca;
	   }
	   public void preencherValor(Float pValor) {
		   valor = pValor;
	   }
	   public String retornarValor() {
		   return valor;
	   }

	   
	   public void ligar() {
		   status=true;
	   }
	   
	   public void desligar() {
		   status=false;
		   canal=0;
	   }
	   public boolean retornarStatus() {
		   return status;
	   }
	   
	   public void mudarCanal(int pCanal) {
		   if (status==true && pCanal>0) {
			   canal=pcanal;
		   }
	   }
	   
	   public int retornarCanal() {
		   return canal;
	   }
	   
	   
	   public void aumentarVolume(int pVolume) {
		   if (status==true && pVolume>0) {
			   volume+=pVolume;
		   }
	   }
	   
	   public void diminuirVolume(int pVolume) {
		   if (status==true && (volume-pVolume)>=0) {
			   volume-=pVolume;
		   }
	   }
	   
	   public int retornarVolume() {
		   return volume;
	   }
	   
	   
	   public String retornarTudo() {
		   return
				   "Marca....: " + marca + "\n" +
				   "Valor....: " + valor + "\n" +
				   "Status...: " + status + "\n" +
				   "Volume...: " + volume + "\n" +
				   "Canal....: " + Canal + "\n";
	   }
	   
	   
   

}//Fim código
