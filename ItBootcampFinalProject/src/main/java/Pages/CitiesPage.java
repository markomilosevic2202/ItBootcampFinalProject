package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CitiesPage {
     WebDriver driver;

    public CitiesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getButtonNewItem(){
        return driver.findElement(By.xpath("//*[contains(@class,'btnNewItem')]"));
    }
    public void getVisualElementDialogueNewItem() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@class='v-card v-sheet theme--light']")));
    }
    public WebElement getInputCities() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getButtonSave() {
        return driver.findElement(By.xpath("//*[contains(@class,'btnSave')]"));
    }
    public void getVisualElementDialogueSaved() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeSelected(
                By.xpath("//*[@class='container container--fluid']/div/div[3]/div/div/div/div/div/button")));
    }

    public void getVisualElementDialogueDelete() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[contains(@class,'v-size--default green--text')]")));
    }

    public String getTextMesage(){
        return driver.findElement(By.xpath("//*[@class='container container--fluid']/div/div[3]/div/div/div/div/div")).getText();
    }
    public WebElement getInputSearch(){
        return driver.findElement(By.id("search"));
    }
    public void waitNumberElementsToBe(int numberElements) {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//tr"),(numberElements+1)));
    }
    public WebElement getButtonEdit(int row){
        return driver.findElement(By.xpath("//*[@class='v-data-table__wrapper']/table/tbody/tr[1]/td/div/button"));
    }
    public WebElement getButtonDeleteFromDialog(){
        return driver.findElement(By.xpath("//*[contains(@class,'v-size--default green--text')]"));
    }
    public String getTextFromACell(int row, int cell){
        return driver.findElement(By.xpath(
                "//*[@class='v-data-table__wrapper']/table/tbody/tr[" + row + "]/td[" + cell + "]")).getText();
    }
    public WebElement getButtonDelete(int row){
        return driver.findElement(By.xpath("//*[@class='v-data-table__wrapper']/table/tbody/tr[1]/td/div/button[2]"));
    }

//*[@class='v-data-table__wrapper']/table/tbody/tr[2]/td[2]
}//*[@class='v-data-table__wrapper']/table/tbody/tr[1]/td/div/button
//dugme New Item
//input za pretragu
//metodu koja ceka da se dijalog za editovanje i kreiranje pojavi
//metodu koja ceka da se dijalog za brisanje pojavi
//save dugme iz dijalog za editovanje i kreiranje
//delete dugme iz dijaloga za brisanje
//metodu koja ceka da se u tabeli pojavi odredjeni broj redova. Metoda kao parametar prima broj redova. Ako se metoda pozove
// sa parametrom 5, to znaci da metoda ceka da se u tabeli pojavi 5 redova.
//metodu koja vraca celiju iz odredjenog reda. Metoda kao parametre prima red i kolonu a vraca td iz tabele.
// Npr: ukoliko se metoda pozove row=2, cell=3 tada metoda vraca trecu celiju iz 2 reda.
//metodu koja vraca edit dugme trazenog reda. Metoda kao parametar prima red a vraca dugme. Npr ako se metoda pozove row=3,
// metoda vraca edit dugme iz treceg reda tabele
//metodu koja vraca delete dugme trazenog reda. Metoda kao parametar prima red a vraca dugme. Npr ako se metoda pozove row=3, metoda vraca delete dugme iz treceg reda tabele