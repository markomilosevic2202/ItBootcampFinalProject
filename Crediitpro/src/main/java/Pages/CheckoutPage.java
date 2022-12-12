package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public List<WebElement> getProductsInList() {
        return driver.findElements(By.linkText("Remove item"));
    }
    public WebElement getTotalPriceInCheckout() {
        return driver.findElements(By.xpath("//*[contains(@class, 'checkout_total_amount_wrap')]/p[1]")).get(1);
    }
    public List<WebElement> getAllNameProductsInList() {
        return driver.findElements(By.className("product-name"));
    }

}
