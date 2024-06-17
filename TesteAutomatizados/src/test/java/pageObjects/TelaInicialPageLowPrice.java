package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static utils.Utils.*;

public class TelaInicialPageLowPrice extends BasePage {
	Actions acao = new Actions(driver);


	
@FindBy(className = "active_option")
public WebElement abaSelector;
	
	
	@FindBy(name = "btnAdd")
	public WebElement botaoAdd;

	public void acionarBotaoAdd() {
		botaoAdd.click();

	}

	public void acessarMenorMaior() {

		acao.moveToElement(abaEscolhas).build().perform();
		
	

	}
}
