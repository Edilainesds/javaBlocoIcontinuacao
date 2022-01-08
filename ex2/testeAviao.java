package br.com.generation.ex2;

public class testeAviao {

	public static void main(String[] args) {

	   aviao c1 = new aviao();
	   aviao c2 = new aviao();
	   
	   
	   c1.nomeDoFabricante = "Embraer";
	   c1.numeroDoModelo = 145362700;
	   c1.numeroDeAssentos = 104;
	   
       System.out.println(" O nome do Fabricante é " +c1.nomeDoFabricante);    
       System.out.println("O numero do Modelo é " +c1.numeroDoModelo);
       System.out.println("O numero de Assentos é " +c1.numeroDeAssentos);
	   
       c1.Pousa();
       c1.decola();
       
       System.out.println();
       
       c2.nomeDoFabricante = "ACS Aviation";
	   c2.numeroDoModelo = 242498985;
	   c2.numeroDeAssentos = 80;
	   
	   System.out.println(" O nome do Fabricante é " +c2.nomeDoFabricante);    
       System.out.println("O numero do Modelo é " +c2.numeroDoModelo);
       System.out.println("O numero de Assentos é " +c2.numeroDeAssentos);
	   
	   
	   c2.Pousa();
	   c2.decola();
	   
       
       
	}

}
