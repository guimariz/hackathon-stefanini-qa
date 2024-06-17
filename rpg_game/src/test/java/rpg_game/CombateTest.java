package rpg_game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CombateTest {
	
	Combate combate;
	
	@Test
	public void testLutaCorporal() {
		Combate combate = new Combate();
		//Instanciando novos personagens
		Personagem persona1 = new Personagem();
		Personagem persona2 = new Personagem();
		
		//teste so funciona ao chamar a classe
		combate.lutaCorporal(persona1, persona2);
		
		assertEquals((persona2.getHp() - persona1.ataque()), persona2.getHp());
	}
	
	@Test
	public void testEmbateXadrez() {
		Combate combate = new Combate();
		Personagem persona1 = new Personagem();
		Personagem persona2 = new Personagem();
		
		//verificando se persona 1 ganhou
		persona1.setInteligencia(2);
		persona2.setInteligencia(1);
		assertEquals(combate.embateXadrez(persona1, persona2), persona1.getNome()+" ganhou");
		
		//verificando se houver um empate
		persona1.setInteligencia(1);
		persona2.setInteligencia(1);
		assertEquals(combate.embateXadrez(persona1, persona2), "Disputa no cara ou coroa");
		
		//verificando se persona2 ganhou
		persona1.setInteligencia(1);
		persona2.setInteligencia(2);
		assertEquals(combate.embateXadrez(persona1, persona2), persona2.getNome()+ "ganhou");
		
	}

}
