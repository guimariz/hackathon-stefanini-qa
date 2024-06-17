package rpg_game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class GuerreiroTest {
	Guerreiro guerreiro;
	
	@Before
	public void unit() {
		guerreiro = new Guerreiro("teste");
	}
	
	@Test
	public void testGuerreiro() {		
		guerreiro.setForca(10);
		guerreiro.setAgilidade(5);
		guerreiro.setHp(2);
		guerreiro.setFuncao("Guerreiro");
		guerreiro.setNome("teste");
		assertEquals(10, guerreiro.getForca());
		assertEquals(5, guerreiro.getAgilidade());
		assertEquals(2, guerreiro.getHp());
		assertEquals("Guerreiro", guerreiro.getFuncao());
		assertEquals("teste", guerreiro.getNome());
	}
	
	@Test
	public void testLvlUp() {
		guerreiro.lvlUp();
		
		guerreiro.setLevel(10);
		guerreiro.setForca(5);
		guerreiro.setAgilidade(2);
		guerreiro.setInteligencia(1);
		assertEquals(10, guerreiro.getLevel());
		assertEquals(5, guerreiro.getForca());
		assertEquals(2, guerreiro.getAgilidade());
		assertEquals(1, guerreiro.getInteligencia());
	}
	
	@Test
	public void testAtaque() {
		assertNotNull(guerreiro.ataque());
		assertEquals(guerreiro.getForca() + 2, guerreiro.ataque());
	}
	
	@Test
	public void testAtaque2() {		
		assertNotNull(guerreiro.ataque2());
		assertEquals(guerreiro.getForca() + 8, guerreiro.ataque2());
	}
	
}
