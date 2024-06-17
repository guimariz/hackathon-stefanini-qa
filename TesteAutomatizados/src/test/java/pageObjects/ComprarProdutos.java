package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComprarProdutos {

	@FindBy(id = "shopping_cart_container")
	public WebElement carrinhoCompras;

	@FindBy(xpath = "//option[@value='lohi']")
	public WebElement abaMaiorMenor;

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	public WebElement addToCart;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	public WebElement addToCart2;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	public WebElement addToCart3;

	@FindBy(id = "checkout")
	public WebElement checkout;

	@FindBy(id = "remove-sauce-labs-onesie")
	public WebElement botaoRemover;
	
	@FindBy(id = "first-name")
	public WebElement campoFirstName;
	
	@FindBy (id = "last-name")
	public WebElement campoLastName;
	
	@FindBy (id = "postal-code")
	public WebElement campoZipCode;
	
	@FindBy (id = "continue")
	public WebElement btnConinue;
	
	@FindBy (id = "finish")
	public WebElement btnFinish;
	
    @FindBy(xpath = "//h2[contains(.,'THANK YOU FOR YOUR ORDER')]")
    public WebElement mensagem;
    
	@FindBy(xpath = "//div[@class='removed_cart_item']")
	public WebElement removido;
	
	@FindBy(id = "cancel")
	public WebElement botaoCancelar;

	public void clicarRemover() {
		botaoRemover.click();
	

	}

	
	// Ações para fazer a compra
	
	public void acionarBotaoAbaMenorMaior() {
		abaMaiorMenor.click();
	}

	public void clicarnacompra() {
		addToCart.click();
		addToCart2.click();
		addToCart3.click();
	}

	public void clicarCarrinho() {
		carrinhoCompras.click();
	}

	public void clicarCheckout() {
		checkout.click();
	}
	
	//Preencher dados
	
	public void escreverFirstName(String firstNome) {
		campoFirstName.sendKeys(firstNome);
		}
	public void escreverLastName(String lastName) {
		campoLastName.sendKeys(lastName);
		}
	public void escreverZipCode(String zipcode) {
		campoZipCode.sendKeys(zipcode);
		}
	
	//FinalizarCompra
	
	public void clicarContinue() {
		btnConinue.click();
	}
	public void clicarFinish() {
		btnFinish.click();
		}
	 public void menssagemFinal() {
	        assertTrue(mensagem.isDisplayed());
	    }
	 public void removidoSucess() {
	        assertTrue(removido.isDisplayed());
	 }
	 public void botaoCancelarCompra() {
			botaoCancelar.click();
	 }
	

}
