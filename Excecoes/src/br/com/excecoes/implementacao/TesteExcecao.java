package br.com.excecoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {
		// Excecoes: nao sao controladas pelo programador
		// Existem dois tipos:
		// A) Checked : O java verifica antes da compila��o
		// B) Unchecked: s� ocorre ap�s a compila��o
		try {
			int numero = Integer.parseInt("7");
			System.out.println("Resultado = " + (numero * 10));

			String email=null;
			if (email==null) {
				throw new RuntimException("Dado Corrompido");
			}
			System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")));

		}catch(NullPointerException e) {
			System.out.println("Objeto NULLO");
			
		}catch(StringIndexOutOfBoundsException e ) {
			System.out.println("Coordenada Inv�lida");
			
			
		}catch(NumberFormatException e) {
			System.out.println("N�mero Inv�lido");
		
			
		}catch(Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();

		}finally {
			System.out.println("Ate LOGO!!!");
		}





	}

}