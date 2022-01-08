package br.com.generation.ex4;

public class testeFuncionario {

	public static void main(String[] args) {
		funcionario numero1 = new funcionario();
		funcionario numero2 = new funcionario();
		
		
      numero1.nome = "Fernando";
      numero1.Cargo = "Analista de Dados";
      numero1.idade = 28;
      
      
      System.out.println(" Nome funcionário " +numero1.nome);
      System.out.println(" Cargo " +numero1.Cargo);
      System.out.println(" idade " +numero1.idade);
      
      numero1.trabalha();
      numero1.MarcaPonto();
      
      System.out.println();
      
      numero2.nome = "Vitoria";
      numero2.Cargo = "software Engineer";
      numero2.idade = 26;
      
      
      System.out.println(" Nome funcionário " +numero2.nome);
      System.out.println(" Cargo " +numero2.Cargo);
      System.out.println(" idade " +numero2.idade);
      
      numero2.trabalha();
      numero2.MarcaPonto();
      
      
      
      
      
	}

}
