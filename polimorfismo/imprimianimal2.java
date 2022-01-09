package br.com.generation.polimorfismo;

public class imprimianimal2 {

	public static void main(String[] args) {
		
		testeAnimal2 t = new testeAnimal2();
		testeAnimal2 l = new testeAnimal2();
		testeAnimal2 s = new testeAnimal2();
		
		
		t.animalFazendoBarulho(new cachorro());
		System.out.println();
		l.animalFazendoBarulho(new cavalo());
		System.out.println();
		s.animalFazendoBarulho(new preguica());
	}

}
