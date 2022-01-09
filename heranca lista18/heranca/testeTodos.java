package br.com.generation.heranca;

import java.util.Scanner;

public class testeTodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		cachorro a1 = new cachorro();
		cavalo   c2 = new cavalo();
		preguica d3 = new preguica();
		
	     a1.setNome("Tobias");
	     a1.setIdade(4);
	     
	     System.out.println(" Nome: " +a1.getNome());
	     System.out.println(" Idade : " +a1.getIdade());
	     
	     a1.DeveCorrer();
	     a1.DeveEmitirSom();
	     
	     System.out.println();
	     
	     c2.setNome("Spirit");
	     c2.setIdade(7);
	     
	     System.out.println(" Nome: " +c2.getNome());
	     System.out.println(" Idade: " +c2.getIdade());
	     
	     c2.DeveCorrer();
	     c2.DeveEmitirSom();
	     
	     System.out.println();
	     
	     d3.setNome(" Dorminhoca");
	     d3.setIdade(9);
	     
	     System.out.println(" Nome: " +d3.getNome());
	     System.out.println(" Idade: " +d3.getIdade());
	     
	     d3.DeveEmitirSom();
	     
	     
	     sc.close();
	     
	     
	     

	}

}
