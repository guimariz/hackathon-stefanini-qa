package rpg_game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BotaTest {
	Bota bota;
	
	@Test
	public void testForca() {
		Bota bota = new Bota();
		
		bota.setForca(1);
		assertEquals(1, bota.getForca());
	}
	
	@Test
	public void testAgilidade() {
		Bota bota = new Bota();
		
		bota.setAgilidade(1);
		assertEquals(1, bota.getAgilidade());
	}
	
	@Test
	public void testInteligencia() {
		Bota bota = new Bota();
		
		bota.setInteligencia(1);
		assertEquals(1, bota.getInteligencia());
	}
	
	@Test
	public void testNomeBota() {
		Bota bota = new Bota();
		
		bota.setNomeBota("teste");
		assertEquals("teste", bota.getNomeBota());
	}
	
}
