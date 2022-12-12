package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class LoginTestCreditPro extends BasicTest {
    private static String email = "marko.milosevic@lumenspei.com";
    private static String password = "markOooooo!018";

//pravim staticke promenjive za email i pass pa ih u testovima po potrebi menjam

    @Test(priority = 10)
    public void emptyInput() throws InterruptedException {


        home.getButtonLoginHeader().click();
        Assert.assertEquals
                (loginPageCreditPro.getInputPassword().getAttribute("type"),"password",
                        "[ERROR] Input type for email is not good");
        loginPageCreditPro.getButtonLogin().click();
        Assert.assertTrue(loginPageCreditPro.getMessageText().contains("Username is required."),
                "[ERROR] Message not contain 'Username is required.'");
        // Thread.sleep(2000);
        loginPageCreditPro.getInputUsername().sendKeys(email);
        loginPageCreditPro.getButtonLogin().click();
        Assert.assertTrue(loginPageCreditPro.getMessageText().contains("The password field is empty."),
                "[ERROR] Message not contain 'The password field is empty.'");
        // Thread.sleep(2000);
        loginPageCreditPro.getInputUsername().clear();
        loginPageCreditPro.getInputPassword().sendKeys(password);
        loginPageCreditPro.getButtonLogin().click();
        Assert.assertTrue(loginPageCreditPro.getMessageText().contains("Username is required."),
                "[ERROR] Message not contain 'Username is required.'");


    }
    //clik na dugme u hederu proverava da li je tip inputa pass
    //klikni na dugme login i proveri poruku
    //unesi samo ispravan email klikni login i proveri poruku
    //unesi samo pasword klikni na login i proveri poruku


    @Test(priority = 20)
    public void badPass() throws InterruptedException {
        String badPass = email.toLowerCase(Locale.ROOT);
        home.getButtonLoginHeader().click();
        loginPageCreditPro.getInputUsername().sendKeys(email);
        loginPageCreditPro.getInputPassword().sendKeys(badPass);
        loginPageCreditPro.getButtonLogin().click();
        Assert.assertTrue(loginPageCreditPro.getMessageText().contains("The password you entered for the email address"),
                "[ERROR] Message not contain 'The password you entered for the email address'");
        loginPageCreditPro.getLinkForLostPass().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/lost-password")
                        & home.getTextFromP().contains("Lost your password?"),
                "[ERROR] Not on a good page(lost-password)");

    }
    //unesi ispravne kredenciale ali u pass smanji slova i proveri poruku
    //klikni na link iz poruke i proveri jel vodi na stranicu za reset pass


    @Test(priority = 30)
    public void resetPass() throws InterruptedException {
        String badEmail = email.substring(1,email.length());
        home.getButtonLoginHeader().click();
        loginPageCreditPro.getButtonReset().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/lost-password")
                        & home.getTextFromP().contains("Lost your password?"),
                "[ERROR] Not on a good page(lost-password)");
//        Assert.assertEquals
//                (loginPageCreditPro.getInputEmailResetPass().getAttribute("type"),"email",
//                        "[ERROR] Input type for email is not good");
        loginPageCreditPro.getButtonRestPass().click();
        Assert.assertTrue(loginPageCreditPro.getMessageText().contains("Enter a username or email address."),
                "[ERROR] Message not contain 'Enter a username or email address.'");
        loginPageCreditPro.getInputEmailResetPass().sendKeys(badEmail);
        loginPageCreditPro.getButtonRestPass().click();
        Assert.assertTrue(loginPageCreditPro.getMessageText().contains("Invalid username or email."),
                "[ERROR] Message not contain 'Invalid username or email.'");
        loginPageCreditPro.getInputEmailResetPass().sendKeys(email);
        loginPageCreditPro.getButtonRestPass().click();
        Assert.assertTrue(loginPageCreditPro.getMessageText().contains("Password reset email has been sent."),
                "[ERROR] Message not contain 'Password reset email has been sent.'");



    }
    //treba da se zavrsi!!!!!!
    //klikni na dugme na hederu klikni dugme reset verifikuj jel dobra stranica verifikuj jel input email
    // pretisni dugme reset verifikuj poruku
    // unesi validan email koji je skracen za prva dva slova click na button resetPass
    // unesi validan email i verifikuj poruku

    @Test(priority = 40)
    public void validInput() throws InterruptedException {
        home.getButtonLoginHeader().click();
        loginPageCreditPro.getInputUsername().sendKeys(email);
        loginPageCreditPro.getInputPassword().sendKeys(password);
        loginPageCreditPro.getButtonLogin().click();
        Assert.assertFalse(
                driver.findElements(By.className("profile_img")).isEmpty()
                , "[ERROR] User not login");

    }

}   //unesi validne kredencijame clik na login verifikuj da li postoji element na strani slika korisnika
