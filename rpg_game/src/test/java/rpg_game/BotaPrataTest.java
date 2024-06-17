package rpg_game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BotaPrataTest {
	
	BotaPrata botaPrata;
	
	@Test
	public void testBotaPrata() {
		BotaPrata botaPrata = new BotaPrata();
		
		botaPrata.setForca(2);
		botaPrata.setAgilidade(1);
		botaPrata.setInteligencia(1);
		botaPrata.setNomeBota("Bota prata");
		assertEquals(2, botaPrata.getForca());
		assertEquals(1, botaPrata.getAgilidade());
		assertEquals(1, botaPrata.getInteligencia());
		assertEquals("Bota prata", botaPrata.getNomeBota());
	}
}
