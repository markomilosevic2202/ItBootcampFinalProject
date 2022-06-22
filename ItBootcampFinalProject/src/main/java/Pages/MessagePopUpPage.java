package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MessagePopUpPage {
    WebDriver driver;
    public MessagePopUpPage(WebDriver driver) {
        this.driver = driver;
    }



    public void getVisualElementPopUp() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.elementToBeClickable(
                 By.xpath("//*[@class='v-btn v-btn--flat v-btn--text theme--dark v-size--default']")));
    }
    public String getTextMesage(){
        return driver.findElement(By.className("v-snack__content")).getText();
    }

    public void getVisualElementMessageSignUp() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@class='v-card v-sheet theme--light']")));
    }
    public String getTextMesageSignUp(){
        return driver.findElement(By.xpath("//*[@class='v-card v-sheet theme--light']/div[2]")).getText();
    }

    public WebElement getButtonClose(){
        return driver.findElement(By.xpath("//*[@class='v-card v-sheet theme--light']/div[3]/button"));
    }
}
//metodu koja ceka da pop up bude vidljiv
//Elemente koji u sebi sadrze tekstove poruke
//Close dugme
//
//metodu koja ceka da se verify your account dijalog pojavi
//metodu koja vraca zaglavlje iz verify your account dijaloga koji sadrzi tekst IMPORTANT: Verify your account
//
//Close dugme iz verify account dijaloga