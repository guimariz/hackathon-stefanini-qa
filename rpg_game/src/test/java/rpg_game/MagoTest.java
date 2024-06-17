package rpg_game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class MagoTest {
	Mago mago;
	
	@Before
	public void init() {
		mago = new Mago("teste");
	}
	
	@Test
	public void testArqueiro() {
		mago.setForca(2);
		mago.setAgilidade(5);
		mago.setHp(10);
		mago.setFuncao("Mago");
		mago.setNome("teste");
		assertEquals(2, mago.getForca());
		assertEquals(5, mago.getAgilidade());
		assertEquals(10, mago.getHp());
		assertEquals("Mago", mago.getFuncao());
		assertEquals("teste", mago.getNome());
	}
	
	@Test
	public void testLvlUp() {
		mago.lvlUp();
		
		mago.setLevel(2);
		mago.setForca(5);
		mago.setAgilidade(10);
		mago.setInteligencia(10);
		assertEquals(2, mago.getLevel());
		assertEquals(5, mago.getForca());
		assertEquals(10, mago.getAgilidade());
		assertEquals(10, mago.getInteligencia());
	}
	
	@Test
	public void testAtaque() {
		assertNotNull(mago.ataque());
		assertEquals(mago.getForca() + 3, mago.ataque());
	}
	
	@Test
	public void testAtaque2() {
		assertNotNull(mago.ataque2());
		assertEquals(mago.getForca() + 4, mago.ataque2());
	}
}
