package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
}
//Polje za unos imena
//Polje za unos emaila
//Polje za unos lozinke
//Polje za potvrdi lozinku
//Sign me up dugme
