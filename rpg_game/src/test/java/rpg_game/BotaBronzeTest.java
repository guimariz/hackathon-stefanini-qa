package rpg_game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Quando tem extends só precisa testar a propria classe
public class BotaBronzeTest {
	
	BotaBronze botaBronze;
	//Verificar metodos get e set
	@Test
	public void testBotaBronze() {
		BotaBronze botaBronze = new BotaBronze();
		
		botaBronze.setForca(10);
		botaBronze.setNomeBota("Bota bronze");
		assertEquals(10, botaBronze.getForca());
		assertEquals("Bota bronze", botaBronze.getNomeBota());
	}

}
