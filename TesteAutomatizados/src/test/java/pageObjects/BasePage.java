package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	@FindBy(xpath = "//select[@class='product_sort_container']")
	public WebElement abaEscolhas;

	public void acionarAbaEscolhas() {
		abaEscolhas.click();

	}

	

}
