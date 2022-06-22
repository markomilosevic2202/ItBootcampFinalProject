package Tests;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BasicTest {

    private String email;
    private String password;


    @Test(priority = 10)
    public void visitsTheLoginPage() throws InterruptedException {

        navPage.getLanguageButton().click();
        navPage.getEnglishLanguageButton().click();
        navPage.getLoginLink().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/login"),
                "[ERROR] Not on a good page");

    }

//Test #1: Visits the login page
//Koraci:
//Postaviti EN jezik stranice
//Klik na login dugme iz navigacije
//Verifikovati da se u url-u stranice javlja ruta /login

        @Test(priority = 20)
    public void checksInputTypes() {

        navPage.getLoginLink().click();
        Assert.assertEquals
                (loginPage.getEmailInput().getAttribute("type"),"email",
                        "[ERROR] Input type for email is not good");

        Assert.assertEquals
                (loginPage.getPasswordInput().getAttribute("type"),"password",
                        "[ERROR] Input type for password is not good");

    }
    //Test #2: Checks input types
//Koraci:
//Klik na login dugme iz navigacije
//Verifikovati da polje za unos emaila za atribut type ima vrednost email
//Verifikovati da polje za unos lozinke za atribut type ima vrednost password
//
    @Test(priority = 30)
    public void displaysErrorsWhenUserDoesNotExist() throws InterruptedException {
        email = "non-existing-user@gmal.com";
        password = "password123";

        navPage.getLoginLink().click();
        loginPage.getEmailInput().sendKeys(email);
        loginPage.getPasswordInput().sendKeys(password);
        loginPage.getSubmitButton().click();
        messagePopUpPage.getVisualElementPopUp();
        Assert.assertTrue
                (messagePopUpPage.getTextMesage().contains("User does not exists"),
                        "[ERROR] Message not contain: 'User does not exists'");


        Assert.assertTrue(
                driver.getCurrentUrl().contains("/login"),
                "[ERROR] Page url does not contain after message: '/login' ");

    }
    //email: non-existing-user@gmal.com
//password: password123
//Koraci:
//Klik na login dugme iz navigacije
//Popuniti login formu podacima za logovanje
//Klik na login dugme
//Sacekati da popu za prikaz greske bude vidljiv
//Verifikovati da greska sadrzi poruku User does not exists
//Verifikovati da se u url-u stranice javlja /login ruta
    @Test(priority = 40)
    public void displaysErrorsWhenPasswordIsWrong() throws InterruptedException {
        email = "admin@admin.com";
        password = "password123";
        navPage.getLoginLink().click();
        loginPage.getEmailInput().sendKeys(email);
        loginPage.getPasswordInput().sendKeys(password);
        loginPage.getSubmitButton().click();
        messagePopUpPage.getVisualElementPopUp();
        Assert.assertTrue
                (messagePopUpPage.getTextMesage().contains("Wrong password"),
                        "[ERROR] Message not contain: 'The password is wrong'");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/login"),
                "[ERROR] Page url does not contain after message: '/login' ");

    }


//Test #4: Displays errors when password is wrong
//Podaci:
//email: admin@admin.com
//password: password123
//Koraci:
//Klik na login dugme iz navigacije
//Popuniti login formu podacima za logovanje
//Klik na login dugme
//Sacekati da popu za prikaz poruke bude vidljiv
//Verifikovati da greska sadrzi poruku Wrong password
//Verifikovati da se u url-u stranice javlja /login ruta


    @Test(priority = 50)
    public void login() throws InterruptedException {
        email = "admin@admin.com";
        password = "12345";
        navPage.getLoginLink().click();
        loginPage.getEmailInput().sendKeys(email);
        loginPage.getPasswordInput().sendKeys(password);
        loginPage.getSubmitButton().click();
        Thread.sleep(2000);
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/home"),
                "[ERROR] Page url does not contain after message: '/home' ");

    }

    //Test #5: Login
//Podaci:
//email: admin@admin.com
//password: 12345
//Koraci:
//Klik na login dugme iz navigacije
//Popuniti login formu podacima za logovanje
//Verifikovati da se u url-u stranice javlja /home ruta
    @Test(priority = 60)
    public void logout() throws InterruptedException {

        Assert.assertTrue(
                 navPage.getLogOutButton().isEnabled(),"[ERROR] Button LogOut is not enabled' ");
        navPage.getLogOutButton().click();

    }
}

//Koraci:
//Verifikovati da je dugme logout vidljivo na stranici
//Kliknuti na logout dugme