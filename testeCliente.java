package br.generation.com;

public class testeCliente {

	public static void main(String[] args) {
     
		cliente d1 = new cliente();
		cliente d2 = new cliente();
		
		d1.nome = "Rafaella";
		d1.endereco = "fernandes de moraes 554";
		d1.telefone = 552224534;
		
		
		d2.nome = "vitoria";
	    d2.endereco = " joao antunes 228";
	    d2.telefone = 552322254;
	    
	    System.out.println("Nome cliente " + d1.nome);
		System.out.println("O endereço é " + d1.endereco );
	    System.out.println(" O telefone é " + d1.telefone);
	    d1.consultaPreco();
	    d1.PesquisaProduto();
	    
	    System.out.println();
	    
	    System.out.println("Nome cliente " + d2.nome);
		System.out.println("O endereço é " + d2.endereco );
	    System.out.println(" O telefone é " + d2.telefone);
	    d2.consultaPreco();
	    d2.PesquisaProduto();
	    
	    
	}

}
