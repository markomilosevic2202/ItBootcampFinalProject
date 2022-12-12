package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public List<WebElement> getProducts() {
        return driver.findElements(By.className("col-md-6"));
    }

    public List<WebElement> getPrice() {
        return driver.findElements(By.className("woocommerce-Price-amount"));
    }
    }

