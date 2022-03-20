package br.com.fiap.orientaçaoObjeto;

public class Programa {

	public static void main(String[] args) {

			Animal objetoGato = new Gato();
			Animal objetoCachorro = new Cachorro();
			Animal cachorroOuGato = new Gato();
			
			objetoCachorro.andando();
			objetoCachorro.parou();
			objetoCachorro.cachorroLatindo();
			
			System.out.println();
			
			objetoGato.andando();
			objetoGato.parou();
			
			System.out.println();
			
			objetoCachorro.anos = 11;
			objetoCachorro.quantidadePata = 4;
			objetoCachorro.raca = "Shitzu";
			
			System.out.println("O meu cachorro tem " + objetoCachorro.anos + " Anos");
			System.out.println("Ele tem " + objetoCachorro.quantidadePata + " patas" );
			System.out.println("A raça dele é " + objetoCachorro.raca);

			System.out.println();
			
			if (objetoGato.miar && cachorroOuGato.quantidadePata <= 4) {
				cachorroOuGato.gato();
			} else {
				cachorroOuGato.cachorro();
			}
			
			
	}
}
