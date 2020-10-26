package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista= new HashSet<String>();
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("INFRA");
		lista.add("DBA");
		lista.add("DEV");
		lista.add("SUPORTE");
		lista.add("ESTAGIARIO");
		System.out.println(lista); // entre [] representa lista
		//  System.out.println("Exibindo 2 elemento.: " + lista.get(1)); - não consegue usar pq não ter index e
		// deve usar o 
	}

}
