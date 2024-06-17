package rpg_game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ArqueiroTest 
{
	Arqueiro arqueiro;
	// Instanciando para toda classe
	@Before
	public void init() {
		arqueiro = new Arqueiro("teste");
	}
	
	@Test
	public void testArqueiro() {
		arqueiro.setForca(5);
		arqueiro.setAgilidade(10);
		arqueiro.setHp(250);
		arqueiro.setFuncao("Arqueiro");
		arqueiro.setNome("teste");
		//não usar assertTrue pois assertEquals da maior cobertura
		assertEquals(5, arqueiro.getForca());
		assertEquals(10, arqueiro.getAgilidade());
		assertEquals(250, arqueiro.getHp());
		assertEquals("Arqueiro", arqueiro.getFuncao());
		assertEquals("teste", arqueiro.getNome());
	}
	
	//teste passa somente ao chamar a função
	@Test
	public void testLvlUp() {
		arqueiro.lvlUp();
		arqueiro.setLevel(5);
		arqueiro.setForca(10);
		arqueiro.setAgilidade(250);
		arqueiro.setInteligencia(1);
		assertEquals(5, arqueiro.getLevel());
		assertEquals(10, arqueiro.getForca());
		assertEquals(250, arqueiro.getAgilidade());
		assertEquals(1, arqueiro.getInteligencia());
	}
	
	@Test
	public void testAtaque() {
	//assertNotNull para confirmar o retorno da função diferente de nulo
		assertNotNull(arqueiro.ataque());
		//Reforçando teste 
		assertEquals(arqueiro.getForca() + 3, arqueiro.ataque());
	}
	
	@Test
	public void testAtaque2() {
		assertNotNull(arqueiro.ataque2());
		assertEquals(arqueiro.getForca() + 5, arqueiro.ataque2());
	}
	
}
