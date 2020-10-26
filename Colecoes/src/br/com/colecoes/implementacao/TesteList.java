package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		// Collection Framework => possuem recuros para facilitar o 
		// trabalho com dados multivalorados
		List<String> lista = new ArrayList<String>();

		lista.add("DBA");
		lista.add("DEV");
		lista.add("DEVOPS");
		lista.add("INFRA");
		System.out.println(lista); // entre [] representa lista
				
		// Ordenar
		Collections.sort(lista);
		System.out.println("Ordenada............: " + lista);
		System.out.println("Exibindo 2 elemento.: " + lista.get(1));
		lista.remove(1);
		System.out.println("Depois de excluir...: " + lista);
		/*
		 * Com for tradicional
		for (int contador=0;contador<lista.size(); contador++) {
			System.out.println("Cargo..: " + lista.get(contador));
			
		}
		*/
		
		//Agora com Foreach
		for (String elemento : lista) {
			System.out.println("Cargo..: " + elemento);
		}
		
		
		

	}

}
