package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
     WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getEmailInput() {
        return driver.findElement(By.id("email"));
    }
    public WebElement getPasswordInput() {
        return driver.findElement(By.id("password"));
    }
    public WebElement getSubmitButton() {
        return driver.findElement(By.xpath("//*[@class='v-btn v-btn--contained theme--light v-size--default secondary']"));
    }


}
//Polje za unos email-a
//Polje za unos lozinke
//Dugme za login.