package stepsDefinitions;
import static utils.Utils.*;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Entao;


public class FiltroMenorMaior {
	
	@Entao("é confirmado que ele teve acesso")
	public boolean validarOrdenacao() {
        ArrayList<WebElement> precoItem = new ArrayList<WebElement>(driver.findElements(By.className("inventory_item_price")));
        String[] itemTexto = new String[precoItem.size()];

        boolean trigger = true;

        for(int i=0;i<precoItem.size();i++) {
            itemTexto[i] = precoItem.get(i).getText();
            itemTexto[i] = itemTexto[i].replace("$", "");
            Float numTeste = Float.parseFloat(itemTexto[i]);
            Float numTeste2 = 50.00f;

            if(i+1<precoItem.size()) {
                itemTexto[i+1] = precoItem.get(i+1).getText();
                itemTexto[i+1] = itemTexto[i+1].replace("$", "");
                numTeste2 = Float.parseFloat(itemTexto[i+1]);
                System.out.println(i);
            }

            if(numTeste.compareTo(numTeste2) > 0 && i+1 < precoItem.size()) { //só a falha.
                trigger = false;
                break;
            }
        }
        return trigger;
    }

}
