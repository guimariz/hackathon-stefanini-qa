package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ComprarProdutos;

public class CancelarCompraSteps {
	
	@Dado("usuario clica na compra de três itens")
	public void usuarioClicaNaCompraDeTrêsItens() {
	    Na(ComprarProdutos.class).clicarnacompra();
	}

	@Dado("usuario clica no carrinho de compras")
	public void usuarioClicaNoCarrinhoDeCompras() {
	    Na(ComprarProdutos.class).clicarCarrinho();
	}

	@Quando("usuario clica no botao cancelar")
	public void usuarioClicaNoBotaoCancelar() {
	    Na(ComprarProdutos.class).botaoCancelarCompra();
	}

	@Entao("a compra é cancelada")
	public void aCompraÉCancelada() {
		assertEquals("PRODUCTS", driver.findElement(By.xpath("//span[@class='title']")).getText());
	}


}
