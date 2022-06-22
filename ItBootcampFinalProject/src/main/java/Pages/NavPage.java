package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavPage {
    WebDriver driver;

    public NavPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLanguageButton() {
        return driver.findElement(By.xpath("//button[contains(@class,'btnLocaleActivation ')]"));
    }
    public WebElement getEnglishLanguageButton(){
        return driver.findElement(By.id("list-item-73"));
    }

    public WebElement getLoginLink() {
        return driver.findElement(By.xpath("//*[@class='v-toolbar__items']/a[3]"));
    }

    public WebElement getLogOutButton(){
        return driver.findElement(By.xpath("//*[@class='hidden-sm-and-down btnLogout v-btn v-btn--flat v-btn--text theme--light v-size--default']"));
    }
    public WebElement getSignUpLink(){
        return driver.findElement(By.xpath("//*[@class='v-toolbar__items']/a[4]"));
    }

}
//Home link
//About link
//My profile link
//Admin dugme
//Cities link iz padajuceg Admin menija
//Users link iz padajuceg Admin menija
//Sign up dugme
//Login dugme
//Logout dugme
//Dugme za izbor jezika
//EN dugme iz padajuceg menija za izbor jezika
//ES dugme iz padajuceg menija za izbor jezika
//FR dugme iz padajuceg menija za izbor jezika
//CN dugme iz padajuceg menija za izbor jezika