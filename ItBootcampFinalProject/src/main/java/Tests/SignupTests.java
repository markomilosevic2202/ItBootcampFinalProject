package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTests extends BasicTest {
    private String name;
    private String email;
    private String password;
    private String confirmPassword;


    @Test(priority = 10)
    public void checksInputTypes() {
        navPage.getSignUpLink().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/signup"),
                "[ERROR] Page url does not contains : '/signup' ");

    }


    //Test #1: Visits the signup page
//Koraci:
//Klik na sign up dugme iz navigacije
//Verifikovati da se u url-u stranice javlja /signup ruta
    @Test(priority = 20)
    public void checksInputTypesvisitsTheLoginPage() {
        navPage.getSignUpLink().click();
        Assert.assertEquals(
                signupPage.getInputEmail().getAttribute(
                        "type"), "email", "[ERROR] Input type for email is not good");

        Assert.assertEquals(
                signupPage.getInputPassword().getAttribute(
                        "type"), "password", "[ERROR] Input type for password is not good");

        Assert.assertEquals(
                signupPage.getInputConfirmPassword().getAttribute(
                        "type"), "password", "[ERROR] Input type for confirm password is not good");

    }

    ////Klik na sign up dugme iz navigacije
    ////Verifikovati da polje za unos emaila za atribut type ima vrednost email
    ////Verifikovati da polje za unos lozinke za atribut type ima vrednost password
    ////Verifikovati da polje za unos lozinke za potvrdu za atribut type ima vrednost password
    @Test(priority = 30)
    public void displaysErrorsWhenEselAlreadyExists() {
        name = "Another User";
        email = "admin@admin.com";
        password = "12345";
        confirmPassword = "12345";
        navPage.getSignUpLink().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/signup"),
                "[ERROR] Page url does not contains : '/signup' ");
        signupPage.getInputName().sendKeys(name);
        signupPage.getInputEmail().sendKeys(email);
        signupPage.getInputPassword().sendKeys(password);
        signupPage.getInputConfirmPassword().sendKeys(confirmPassword);
        signupPage.getButtonSignMeUp().click();
        messagePopUpPage.getVisualElementPopUp();
        Assert.assertTrue(
                messagePopUpPage.getTextMesage().contains("E-mail already exists"),
                "[ERROR] Message not contains: 'E-mail already exists'");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/signup"),
                "[ERROR] Page url does not contains : '/signup' ");


    }

    //Test #3: Displays errors when user already exists
//Podaci:
//name: Another User
//email: admin@admin.com
//password: 12345
//confirm password: 12345
//Koraci:
//Klik na sign up dugme iz navigacije
//Verifikovati da se u url-u stranice javlja /signup ruta
//Popuniti formu za registraciju podacima
//Klik na sign up dugme
//Sacekati da popu za prikaz poruke bude vidljiv
//Verifikovati da greska sadrzi poruku E-mail already exists
//Verifikovati da se u url-u stranice javlja /signup ruta
    @Test(priority = 40)
    public void Signup() throws InterruptedException {
        name = "Marko Milosevic";
        email = "marko.milosevic2202@gmail.com";
        password = "12345";
        confirmPassword = "12345";
        navPage.getSignUpLink().click();
        signupPage.getInputName().sendKeys(name);
        signupPage.getInputEmail().sendKeys(email);
        signupPage.getInputPassword().sendKeys(password);
        signupPage.getInputConfirmPassword().sendKeys(confirmPassword);
        signupPage.getButtonSignMeUp().click();
        navPage.getHomeLink().click();
        messagePopUpPage.getVisualElementMessageSignUp();
        Assert.assertTrue(
        messagePopUpPage.getTextMesageSignUp().contains("verify your account"),
                "[ERROR] Message not contains: 'verify your account'");
        messagePopUpPage.getButtonClose().click();
        navPage.getLogOutButton();

    }
//name: Ime i prezime polaznika
//email template: ime.prezime@itbootcamp.rs
//password: 12345
//confirm password: 12345
//Koraci:
//Klik na sign up dugme iz navigacije
//Popuniti formu podacima za registraciju
//Klik na sign up dugme
//Ucitati stranicu /home
//Verifikovati da dijalog za obavestenje sadrzi tekst IMPORTANT: Verify your account
//Kliknuti na Close dugme iz dijaloga
//Kliknuti na logout
}