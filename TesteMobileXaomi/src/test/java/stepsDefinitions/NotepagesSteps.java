package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.NotesPage;

public class NotepagesSteps {
	
	 NotesPage notesPage = new NotesPage(driver);
	 
	

	    @Dado("que o usuario acione botaoadd")
	    public void queOUsuarioAcioneBotaoadd() throws Exception{
	        notesPage.telaInicioPermitir();
	    	notesPage.criarNota();
	    }
	    @E("^clicar em adicionar texto$")
		public void clicarEmAdicionarTexto() throws Throwable {
			notesPage.euAcionoOBotaoText();
		}
	    
	    @Dado("informar na nota {string}")
	    public void informarNaNota(String string) {
	        notesPage.informarNota(string);
	    }
	    
		@E("^acionar o botao check$")
		public void acionarOBotaoCheck()  {
			notesPage.acionarBotaoCheck();
		}


	    @Dado("acionar botao voltar")
	    public void acionarBotaoVoltar() {
	        notesPage.acionarBotaoVoltar();
	    }


	    @Entao("o sistema mostra note criado {string}")
	    public void oSistemaMostraNoteCriado(String string) {
	        notesPage.validarNotaCriada(string);
	    }
/////////////////////////////////////////////////////////////////////////////	
	    @Dado("clicar em adicionar lista")
	    public void clicarEmAdicionarLista() {
	       notesPage.clicarAbaLista();
	    }

	    @Dado("clicar no botao adicionar item")
	    public void clicarNoBotaoAdicionarItem() {
	     notesPage.clicarAdicionarItem();   
	    }

	    @Dado("informar o nome do item {string}")
	    public void informarONomeDoItem(String string) {
	        notesPage.preencherCampoAdicionarItemLista(string);
	    }

	    @Dado("clicar no botao ok")
	    public void clicarNoBotaoOk() {
	        notesPage.clicarBotaoConfirmarLista();
	    }
		

		@Quando("clicar na lista criada")
		public void clicarNaListaCriada() {
		   notesPage.clicarNaLista();
		}

		@Quando("clicar no editar")
		public void clicarNoEditar() {
		    notesPage.editarLista();
		}

		@Quando("mudar o cor")
		public void mudarOCor() {
		    notesPage.mudarCor();
		}
		@Entao("^o sistema mostra lista criada$")
		public void oSistemaMostraListaCriada() throws Throwable {
			notesPage.listaCriadaConfirm();
		}
/////////////////////////////////////////////////////////////////////////////////

@Dado("o clica na lista")
public void oClicaNaLista() {
    notesPage.clicarNaLista();
}

@Dado("o usuario clica no primeiro item")
public void oUsuarioClicaNoPrimeiroItem() {
   notesPage.checkoutLista1();
}

@Dado("clica no segundo item")
public void clicaNoSegundoItem() {
    notesPage.checoutLista2();
}

@Dado("clica no terceiro item")
public void clicaNoTerceiroItem() {
    notesPage.checkoutLista3();
}

@Entao("o sistema apresentar os itens checkados")
public void oSistemaApresentarOsItensCheckados() {
    notesPage.validarCheckDaLista();
}
//////////////////////////////////////////////////////////////

@Dado("clica nos tres pontinho no lado direito superior")
public void clicaNosTresPontinhoNoLadoDireitoSuperior() {
    notesPage.acionarTresPontinhosCantoSuperiorDireito();
}

@Dado("clica em Lembrete")
public void clicaEmLembrete() {
    notesPage.selecionarLembrete();
}

@Dado("clica em tipo alarme com hora")
public void clicaEmTipoAlarmeComHora() {
   notesPage.selecionarTipoDeFuncaoLembrete();
}

@Dado("clica na opção alarme com hora")
public void clicaNaOpçãoAlarmeComHora() {
   notesPage.selecionaOpcaoAlarmeComHora30min();
}

@Dado("clica em pronto")
public void clicaEmPronto() {
    notesPage.clicarEmProntoAlarmDefinitions();
    notesPage.acionarTresPontinhosCantoSuperiorDireito();
	notesPage.selecionarLembrete();
}


@Entao("o lembrete é ativado")
public void oLembreteÉAtivado() {
	
	assertEquals("EM 30 MINUTOS", driver.findElement(By.xpath("//android.widget.Button[@text='EM 30 MINUTOS']")).getText());
}
////////////////////////////////////////////////////////////////////////////////

@Dado("usuario segura o botao em qual a nota foi criada")
public void usuarioSeguraOBotaoEmQualANotaFoiCriada() {
    notesPage.clickAndHoldNota();
}

@Dado("aperta em botao remover")
public void apertaEmBotaoRemover() {
    notesPage.clicarBotaoRemover();
}

@Dado("seleciona ok")
public void selecionaOk() {
   notesPage.selecinarBotaoOkLixeira();
}

@Quando("clicar no submenu na esquerda parte inferior")
public void clicarNoSubmenuNaEsquerdaParteInferior() {
	notesPage.submenuParteInferiorDireita();
}

@Quando("clicar em lixeira")
public void clicarEmLixeira() {
   notesPage.clicarBotaoLixeira();
}

@Quando("ao quanto superior clicar no botao remover")
public void aoQuantoSuperiorClicarNoBotaoRemover() {
   notesPage.botaoLixeiraCantoSuperiorDireito();
}

@Quando("selecionar ok")
public void selecionarOk() {
    notesPage.selecinarBotaoOkLixeira();
}

@Entao("a nota sera removidade com sucesso")
public void aNotaSeraRemovidadeComSucesso() {
	assertEquals(0, driver.findElements(By.xpath("//android.widget.TextView[@text='Teste']")).size());
}

		
		
}
