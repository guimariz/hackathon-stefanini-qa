package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name = "user-name")
	private WebElement campoUsuario;

	@FindBy(name = "password")
	private WebElement campoSenha;

	@FindBy(name = "login-button")
	private WebElement botaoLogin;
	
	@FindBy(xpath = "//h3[contains(@data-test,'error')]")
	public WebElement mensagemError;
	
	@FindBy(xpath = "//span[@class='title'][contains(.,'PRODUCTS')]")
	public WebElement loginSucess;

	public void informarCampoUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}

	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void acionarBotaoLogin() {
		botaoLogin.click();
	}

	public void realizarLogin(String usuario, String senha) {
		informarCampoSenha(senha);
		informarCampoUsuario(usuario);
		acionarBotaoLogin();

	}
	
		

	

}
