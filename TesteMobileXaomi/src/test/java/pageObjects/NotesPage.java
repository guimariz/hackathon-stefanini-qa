package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.aguardarMobileElement;
import static utils.Utils.driver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NotesPage {

	public NotesPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private MobileElement inicioPermitir;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab")
	private MobileElement botaAdd;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Texto']")
	private MobileElement botaoTexto;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_note")
	private MobileElement escreverNota;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
	private MobileElement botaoCheck;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/back_btn'")
	private MobileElement botaoVoltar;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/title")
	private MobileElement confirmaNotaCriada;
	
	
	
	public void telaInicioPermitir() {
		inicioPermitir.click();
		
	}

	public void criarNota() throws Exception{
		botaAdd.click();
		Thread.sleep(5000);
		
	}

	public void euAcionoOBotaoText() {
		aguardarMobileElement(botaoTexto);
		botaoTexto.click();

	}
	
	public void informarNota(String text) {
		aguardarMobileElement(escreverNota);
		escreverNota.sendKeys(text);
	}
	
	public void acionarBotaoCheck() {
		aguardarMobileElement(botaoCheck);
		botaoCheck.click();
	}
	
	public void acionarBotaoVoltar() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/back_btn");
		aguardarMobileElement(el1);
		el1.click();
	}
	
	public void validarNotaCriada(String text) {
		aguardarMobileElement(confirmaNotaCriada);
		assertEquals(text, confirmaNotaCriada.getText());
	}
	
	
	public void validarCheckDaLista() {
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageButton");
		aguardarMobileElement(el4);
		assertTrue(el4.isDisplayed());
	}
	
	public void clicarAbaLista() {
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView");
		aguardarMobileElement(el3);
		el3.click();
	}
	public void clicarAdicionarItem() {
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
		aguardarMobileElement(el4);
		el4.click();
		
	}
	public void preencherCampoAdicionarItemLista(String texto) {
		MobileElement el5 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/edit");
		aguardarMobileElement(el5);
		el5.sendKeys(texto);
		
		
	}
	public void clicarBotaoConfirmarLista() {
		MobileElement el1 = (MobileElement) driver.findElementById("android:id/button1");
		aguardarMobileElement(el1);
		el1.click();
		
	}
	public void clicarBotaoCheckLista() {
		MobileElement el2 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/back_btn");
		aguardarMobileElement(el2);
		el2.click();
		
	}
	public void clicarAdicionarItem2() {
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView");
		aguardarMobileElement(el4);
		el4.click();	
	}
	public void preencherCampoAdicionarItemLista2(String texto) {
		MobileElement el5 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/edit");
		aguardarMobileElement(el5);
		el5.sendKeys(texto);
		
	}
	
	public void clicarNaLista() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/title");
		aguardarMobileElement(el1);
		el1.click();
		
	}
	public void listaCriadaConfirm() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/date");
		
		assertTrue(el1.isDisplayed());
	}
	
	public void editarLista() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/edit_btn");
		aguardarMobileElement(el1);
		el1.click();
		
	}
	public void mudarCor() {
		MobileElement el2 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/color_btn");
		aguardarMobileElement(el2);
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/txt1");
		aguardarMobileElement(el3);
		el3.click();
		
	}
	
	public void checkoutLista1() {
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
		aguardarMobileElement(el2);
		el2.click();
		
	}
	
	public void checoutLista2() {
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
		aguardarMobileElement(el3);
		el3.click();
		
	}
	public void checkoutLista3() {
	MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
	aguardarMobileElement(el4);
	el4.click();
	}
	public void acionarTresPontinhosCantoSuperiorDireito() {
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Mais");
		aguardarMobileElement(el1);
		el1.click();
		}
	public void selecionarLembrete() {
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView");
		aguardarMobileElement(el2);
		el2.click();
		}
	public void selecionarTipoDeFuncaoLembrete() {
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Spinner/android.widget.TextView");
		aguardarMobileElement(el3);
		el3.click();
		}
	public void selecionaOpcaoAlarmeComHora30min() {
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
		aguardarMobileElement(el4);
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/relative_time");
		aguardarMobileElement(el5);
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]");
		aguardarMobileElement(el6);
		el6.click();
		}
	public void clicarEmProntoAlarmDefinitions() {
		MobileElement el7 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/button1");
		aguardarMobileElement(el7);
		el7.click();
	}
	public void confirmarAtivacaoLembrete() {
		MobileElement el2 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/date");
		aguardarMobileElement(el2);
		assertTrue(el2.isDisplayed());
	}
	
	public void clickAndHoldNota() {
		Actions acao = new Actions(driver);
		MobileElement el3 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/title");
		aguardarMobileElement(el3);
		acao.clickAndHold(el3).perform();
		
	}
	public void clicarBotaoRemover() {
		MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Remover\"]/android.widget.ImageView");
		aguardarMobileElement(el1);
		el1.click();
		
	}
	public void selecinarBotaoOkLixeira() {
		MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
		aguardarMobileElement(el2);
		el2.click();
		
	}
	public void submenuParteInferiorDireita() {
		MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Mais\"]/android.widget.ImageView");
		aguardarMobileElement(el3);
		el3.click();

		
	}
	public void clicarBotaoLixeira() {
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/c.q.a.b/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[2]/android.widget.ImageView");
		aguardarMobileElement(el4);
		el4.click();
	
	}
	public void botaoLixeiraCantoSuperiorDireito() {
		MobileElement el5 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/main_btn1");
		aguardarMobileElement(el5);
		el5.click();
		
	}
	public void selecionarButaoOk() {
		MobileElement el6 = (MobileElement) driver.findElementById("android:id/button1");
		aguardarMobileElement(el6);
		el6.click();
		
		
	}
	
	


}
