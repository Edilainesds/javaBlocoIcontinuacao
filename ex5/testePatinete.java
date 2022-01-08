package br.com.generation.ex5;

public class testePatinete {

	public static void main(String[] args) {
	patinete tipo1 = new patinete();
	patinete tipo2 = new patinete();
	
	tipo1.marca = " yellow";
	tipo1.tamanho = 37;
	tipo1.cor = " rosa e Preto";
	
	System.out.println(" Marca " +tipo1.marca);
	System.out.println(" Tamanho " +tipo1.tamanho);
	System.out.println(" Cor" +tipo1.cor);
	
	tipo1.andar();
	tipo1.trabalhar();
	
	System.out.println();
	
	
	tipo2.marca = " rappi";
	tipo2.tamanho = 36;
	tipo2.cor = " Laranja";
	
	System.out.println(" Marca " +tipo2.marca);
	System.out.println(" Tamanho " +tipo2.tamanho);
	System.out.println(" Cor" +tipo2.cor);
	
	tipo2.andar();
	tipo2.trabalhar();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
