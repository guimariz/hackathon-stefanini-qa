package stepsDefinitions;
import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;

public class ZipcodeSteps {
	
	@Entao("ocorre erro por nao preencher o first name")
	public void ocorreErroPorNaoPreencherOFirstName() {
     assertEquals("Error: First Name is required", driver.findElement(By.xpath("//h3[contains(text(),'Error: First Name is required')]")).getText());
	}

	@Entao("ocorre erro por nao preencher o LastName")
	public void ocorreErroPorNaoPreencherOLastName() {
		assertEquals("Error: Last Name is required", driver.findElement(By.xpath("//h3[contains(text(),'Error: Last Name is required')]")).getText());
	}

	@Entao("ocorre erro pro não preencher o zipcode")
	public void ocorreErroProNãoPreencherOZipcode() {
		 assertEquals("Error: Postal Code is required", driver.findElement(By.xpath("//h3[contains(text(),'Error: Postal Code is required')]")).getText());
	}


}
