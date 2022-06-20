package Tests;


import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import java.time.Duration;

public class BasicTest {
    private WebDriver driver;
    private String baseUrl = "https://vue-demo.daniel-avellaneda.com/";

    CitiesPage citiesPage = new CitiesPage();

    LoginPage loginPage = new LoginPage();

    MessagePopUpPage messagePopUpPage = new MessagePopUpPage();

    NavPage navPage = new NavPage();

    SignupPage signupPage = new SignupPage();

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();



    }
    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);    }





    @AfterMethod
    public void afterMethod() {

    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

//Osnovna klasa koju svaki test da nasledjuje. Ova klasa treba da ima:
//baseUrl - url stranice https://vue-demo.daniel-avellaneda.com
//beforeClass - gde se podesava drajver sa implicitnim cekanjem i cekanjem za ucitavanje stranice i kreiraju svi pagevi potrebni za testiranje
//aftterClass - gde se gasi stranica
//beforeMethod - gde se pre svakog testa ucitava baseUrl stranica
//(za vezbanje) afterMethod - gde se kreira screenshot stranice u slucaju da test ne prodje