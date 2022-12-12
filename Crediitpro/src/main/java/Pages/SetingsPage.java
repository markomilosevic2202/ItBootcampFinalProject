package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SetingsPage {
    WebDriver driver;

    public SetingsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getInputName(){
        return driver.findElement(By.id("name"));
    }
}
