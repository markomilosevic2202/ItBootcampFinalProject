package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavPage {
    WebDriver driver;

    public WebElement getLanguage() {
        return driver.findElement(By.className("v-icon notranslate mdi mdi-earth theme--light"));
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