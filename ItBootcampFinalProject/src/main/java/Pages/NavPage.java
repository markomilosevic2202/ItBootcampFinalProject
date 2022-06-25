package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavPage {
    WebDriver driver;

    public NavPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLinkHome(){
        return driver.findElement(By.className("hidden-sm-and-down"));
    }

    public WebElement getLinkAbout(){
        return driver.findElement(By.className("btnAbout"));
    }

    public WebElement getLinkLogin() {
        return driver.findElement(By.className("btnLogin"));
    }

    public WebElement getLinkLogut(){
        return driver.findElement(By.className("btnLogout"));
    }

    public WebElement getLinkSignUp(){
        return driver.findElement(By.xpath("//*[contains(text(),'Sign Up')]"));
    }

    public WebElement getLinkAdmin(){
        return driver.findElement(By.className("btnAdmin"));
    }
    public WebElement getLinkCitis(){
        return driver.findElement(By.className("btnAdminCities"));
    }

    public void getVisualElementLinkAdmin() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@class='v-toolbar__items']/button[3]")));
    }

    public WebElement getLanguageButton() {
        return driver.findElement(By.xpath("//button[contains(@class,'btnLocaleActivation ')]"));
    }

    public WebElement getButtonEnLanguage(){
        return driver.findElement(By.className("btnEN"));
    }

    public WebElement getButtonEsLanguage(){
        return driver.findElement(By.className("btnES"));
    }

    public WebElement getButtonCnLanguage(){
        return driver.findElement(By.className("btnCN"));
    }

    public WebElement getButtonFrLanguage(){
        return driver.findElement(By.className("btnFR"));
    }

    public String getTextFromHeader() {
        return driver.findElement(By.xpath("//h1")).getText();
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