package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SetingsPage {
    WebElement driver;

    public SetingsPage(WebElement webElement) {
        this.driver = webElement;
    }

    public WebElement getInputName(){
        return driver.findElement(By.id("name"));
    }
}
