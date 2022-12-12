package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    WebDriver driver;

    //Header
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getButtonAboutUsHeader() {
        return driver.findElement(By.id("menu-item-10418"));
    }

    public WebElement getButtonProductsHeader() {
        return driver.findElement(By.id("menu-item-25172"));
    }

    public WebElement getButtonBlogHeader() {
        return driver.findElement(By.id("menu-item-25174"));
    }

    public WebElement getButtonContactHeader() {
        return driver.findElement(By.id("menu-item-10420"));
        //return driver.findElements(By.id("menu-item-10420")).get(0).;
    }

    public WebElement getButtonNet30getHeader() {
        return driver.findElement(By.xpath("//*[@class='header-actions d-flex align-items-center']/a[4]"));
    }

    public WebElement getButtonCreditProHeader() {
        return driver.findElement(By.className("navbar-brand"));
    }


    public WebElement getButtonCartHeader() {
        return driver.findElements(By.className("cart-icon")).get(1);
    }

    public WebElement getButtonLoginHeader() {
        return driver.findElement(By.xpath("//*[@class='container']/div/a[3]"));
    }
    public int getNumberInCart() {


        return Integer.parseInt(driver.findElement(By.className("cart-content-count")).getText());
    }






    //Search

    public WebElement getButtonSearchHeader() {
        return driver.findElement(By.id("search-toggle"));
    }
    public WebElement getSearchWindowsHeader() {
        return driver.findElement(By.className("input-group"));

    }
    public WebElement getInputSearch() {
        return driver.findElement(By.id("woocommerce-product-search-field-0"));
    }

    public WebElement getButttonSearchInWindows() {
        return driver.findElement(By.xpath("//*[@class='input-group']/button"));
//        List<WebElement> a = driver.findElements(By.className("input-group"));
//        System.out.println();
//        return a.get(4);
    }
    public int getNumberElementInSearch() {
        List<WebElement> a = driver.findElements(By.className("col-md-6"));
        System.out.println(a.size());
        return a.size();
    }



    //Footer

    public WebElement getButtonNet30getFooter() {
        return driver.findElement(By.id("menu-item-25176"));
    }

    public WebElement getButtonBecomeAnAffFooter() {
        return driver.findElement(By.id("menu-item-25175"));
    }

    public WebElement getButtonTermsConditionsFooter() {
        return driver.findElement(By.id("menu-item-25178"));
    }

    public WebElement getButtonContactFooter() {
        return driver.findElement(By.id("menu-item-25179"));
    }

    public WebElement getButtonPrivacyPolicyFooter() {
        return driver.findElement(By.id("menu-item-25180"));
    }
    public WebElement getButtonBlogFooter() {
        return driver.findElement(By.id("menu-item-25181"));
    }
    public WebElement getButtonFAQ() {
        return driver.findElement(By.id("menu-item-25182"));
    }
    public String getTextFromHeader() {
        return driver.findElement(By.xpath("//h1")).getText();
    }

    public String getTextFromP() {
        return driver.findElement(By.xpath("//p")).getText();
    }

    public WebElement getInputSubscribe() {
        return driver.findElement(By.name("EMAIL"));
    }
    public WebElement getButtonSubscribe() {
        return driver.findElement(By.className("mailchimp-custom-cl147"));
    }


}