package br.com.generation.ex3;

public class testaCelular {

	public static void main(String[] args) {
//3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
		//referentes esta classe, em seguida crie um objeto produto eletr�nico,
		//defina as instancias deste objeto e apresente as informa��es deste objeto
	//	no console.
		
		celular g1 = new celular();
		celular g2 = new celular();
		
		
		g1.modeloCelular = "MotoG";
		g1.ano = 2020;
		g1.marca =" Motorola";
		
		System.out.println("  modelo do celular" +g1.modeloCelular);    
	    System.out.println(" Ano de lan�amento " +g1.ano);
	    System.out.println(" Marca " +g1.marca);
	    
	    g1.ligar();
	    g1.desligar();
	    
	    
	    System.out.println();
	    
	    
	    g2.modeloCelular = "Samsung jk4";
		g2.ano = 2021;
		g2.marca =" Samsung";
		

		System.out.println(" Modelo do celular " +g2.modeloCelular);    
	    System.out.println(" Ano de lan�amento " +g2.ano);
	    System.out.println(" Marca " +g2.marca);
	    
	    g2.ligar();
	    g2.desligar();
	    
	       
		   
		 
		
	}

}
