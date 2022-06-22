package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupPage {
     WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getInputName(){
        return driver.findElement(By.id("name"));
    }
    public WebElement getInputEmail(){
        return driver.findElement(By.id("email"));
    }
    public WebElement getInputPassword(){
        return driver.findElement(By.id("password"));
    }
    public WebElement getInputConfirmPassword(){
        return driver.findElement(By.id("confirmPassword"));
    }
    public WebElement getButtonSignMeUp(){
        return driver.findElement(By.xpath("//*[@class='v-btn v-btn--contained theme--light v-size--default secondary']"));
    }
    public void getVisualElementMessage() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@class='v-card v-sheet theme--light']")));
    }

}
//Polje za unos imena
//Polje za unos emaila
//Polje za unos lozinke
//Polje za potvrdi lozinku
//Sign me up dugme
