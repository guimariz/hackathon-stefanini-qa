package utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.core.api.Scenario;

public class Utils {

    public static AppiumDriver<WebElement> driver;

    public static void acessarAndroid() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.socialnmobile.dictapps.notepad.color.note");
        desiredCapabilities.setCapability("appActivity", "com.socialnmobile.colornote.activity.Main");

       // URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static File gerarScreenShot(Scenario scenario){
        final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenShot, "image/png");
        File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(imagem, (new File("./target/screenshots", scenario.getName() + "-" + scenario.getStatus()+ ".png")));
        }catch (Exception e){
            e.printStackTrace();
        }

        return imagem;
    }
    
    public static void aguardarMobileElement(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
