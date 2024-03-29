package Tests;


import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class BasicTest {
    WebDriver driver;
    protected String baseUrl = "https://crediitpro.com/";
    protected String email = "marko.milosevic@lumenspei.com";

    protected CitiesPage citiesPage;

    protected LoginPage loginPage;

    MessagePopUpPage messagePopUpPage;

    protected NavPage navPage;

    protected SignupPage signupPage;

    protected HomePage home;

    protected LoginPageCreditPro loginPageCreditPro;

    protected ProductPage product;

    protected CheckoutPage checkout;

    protected SetingsPage setingsPage;


    @BeforeClass
    public  void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        navPage = new NavPage(driver);
        citiesPage = new CitiesPage(driver);
        loginPage = new LoginPage(driver);
        messagePopUpPage = new MessagePopUpPage(driver);
        signupPage = new SignupPage(driver);
        home = new HomePage(driver);
        loginPageCreditPro = new LoginPageCreditPro(driver);
        product = new ProductPage(driver);
        checkout = new CheckoutPage(driver);
       // setingsPage = new SetingsPage(driver);



    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);


    }


    @AfterMethod
    public void afterMethod() {

    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

//Osnovna klasa koju svaki test da nasledjuje. Ova klasa treba da ima:
//baseUrl - url stranice https://vue-demo.daniel-avellaneda.com
//beforeClass - gde se podesava drajver sa implicitnim cekanjem i cekanjem za ucitavanje stranice i kreiraju svi pagevi potrebni za testiranje
//aftterClass - gde se gasi stranica
//beforeMethod - gde se pre svakog testa ucitava baseUrl stranica
//(za vezbanje) afterMethod - gde se kreira screenshot stranice u slucaju da test ne prodje