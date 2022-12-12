package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageCreditPro {

    WebDriver driver;
    public LoginPageCreditPro(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getInputUsername() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getInputPassword() {
        return driver.findElement(By.id("password"));
    }
    public WebElement getButtonLogin() {
        return driver.findElement(By.name("login"));
    }

    public WebElement getButtonReset() {
        return driver.findElement(By.linkText("Reset it"));
    }

    public String getMessageText() {
        return driver.findElement(By.className("woocommerce-message")).getText();
    }
    public WebElement getLinkForLostPass() {
        return driver.findElement(By.xpath("//*[@class='woocommerce-message alert alert-danger']/a"));
    }
    public WebElement getInputEmailResetPass() {
        return driver.findElement(By.className("woocommerce-Input"));
    }
    public WebElement getButtonRestPass() {
        return driver.findElement(By.className("btn-outline-primary"));
    }
    public WebElement getProfilImage() {
        return driver.findElement(By.className("profile_img"));
    }
}
