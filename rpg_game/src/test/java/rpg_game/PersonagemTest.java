package rpg_game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonagemTest {

    private String funcao;
    private String nome;
    
    private int hp;
    
    private int level = 1;
    
    //Dando certo pelo stackoverflow
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    
	Personagem personagem;
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	public void testAgilidade() {
		Personagem personagem = new Personagem();
		Bota bota = new Bota();
		
		bota.setAgilidade(0);
		personagem.setAgilidade(1 + bota.getAgilidade());
		assertEquals(1 + bota.getAgilidade(), personagem.getAgilidade());
		
		//Testando segundo if, não deu certo
		bota.setAgilidade(1);
		personagem.setAgilidade(1 + bota.getAgilidade());
		assertEquals(1 + bota.getAgilidade(), personagem.getAgilidade());
	}
	
	@Test
	public void testForca() {
		Personagem personagem = new Personagem();
		Bota bota = new Bota();
		
		bota.setForca(0);
		personagem.setForca(1 + bota.getForca());
		assertEquals(1 + bota.getForca(), personagem.getForca());
	
	}
	
	@Test
	public void testInteligencia() {
		Personagem personagem = new Personagem();
		Bota bota = new Bota();
		
		bota.setInteligencia(1);
		personagem.setInteligencia(1 + bota.getInteligencia());
		assertEquals(1 + bota.getInteligencia(), personagem.getInteligencia());
	}
	
	@Test
	public void testMana() {
		Personagem personagem = new Personagem();
		Bota bota = new Bota();
		
		//só esta conseguindo testar o else
		bota.setInteligencia(1);
		personagem.setMana(1 + bota.getInteligencia());
		assertEquals(1 + bota.getInteligencia(), personagem.getMana());
	}
	
	@Test
	public void testLevel() {
		Personagem personagem = new Personagem();
		
		personagem.setLevel(level);
		assertEquals(level, personagem.getLevel());
	}
	
	@Test
	public void testEquiparBota() {
		//Instancia
		Personagem personagem = new Personagem();
		Bota bota = new Bota();
		
		//Chama a classe
		personagem.EquiparBota(bota);
		
		//Faz todos os sets
		personagem.setForca(1 + bota.getForca());
		personagem.setAgilidade(1 + bota.getAgilidade());
		personagem.setInteligencia(1 + bota.getInteligencia());
		
		//Faz as validacoes
		assertEquals(1 + bota.getForca(), personagem.getForca());
		assertEquals(1 + bota.getAgilidade(), personagem.getAgilidade());
		assertEquals(1 + bota.getInteligencia(), personagem.getInteligencia());
	}
	
	@Test
	public void testAtaque() {
		Personagem personagem = new Personagem();
		
		assertNotNull(personagem.ataque());
		assertEquals(0, personagem.ataque());
	}
	
	@Test
	public void testExibirDadosInicialJogador() {
		Personagem personagem = new Personagem();		
		personagem.exibirDadosInicialJogador();
		
		//stackoverflow
		assertEquals("***********************************\r\n"
				+ "*Dados inicial do jogador*\r\n"
				+ "Nome Personagem: null\r\n"
				+ "Level inicial: 1\r\n"
				+ "HP inicial: 0\r\n"
				+ "Mana inicial: 0\r\n"
				+ "Força inicial: 0\r\n"
				+ "Agilidade inicial: 0\r\n"
				+ "Inteligencia inicial: 0\r\n"
				+ "***********************************" + System.getProperty("line.separator"), outContent.toString());
	}
	
	@Test
	public void testExibirNovosDadosJogador() {
		Personagem personagem = new Personagem();		
		personagem.exibirNovosDadosJogador();
		
		assertEquals("***********************************\r\n"
				+ "*Novos dados do jogador*\r\n"
				+ "Novo Level: 1\r\n"
				+ "Novo HP: 0\r\n"
				+ "Novo Mana: 0\r\n"
				+ "Nova Força: 0\r\n"
				+ "Nova Agilidade: 0\r\n"
				+ "Nova Inteligencia: 0\r\n"
				+ "***********************************" + System.getProperty("line.separator"), outContent.toString());
	}
	
	@Test
	public void testFuncao() {
		Personagem personagem = new Personagem();
		
		personagem.setFuncao(funcao);
		assertEquals(funcao, personagem.getFuncao());
	}
	
	@Test
	public void testHp() {
		Personagem personagem = new Personagem();
		
		personagem.setHp(hp);
		assertEquals(hp, personagem.getHp());
	}
	
	@Test
	public void testNome() {
		Personagem personagem = new Personagem();
		
		personagem.setNome(nome);
		assertEquals(nome, personagem.getNome());
	}
	
}
