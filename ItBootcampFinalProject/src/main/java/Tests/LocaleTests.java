package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocaleTests extends BasicTest{

    @Test(priority = 10)
    public void setLocaleToES() {
        navPage.getLanguageButton().click();
        navPage.getButtonEsLanguage().click();
        Assert.assertTrue
                (navPage.getTextFromHeader().contains("Página"),
                        "[ERROR] The language has not been changed to: 'ES'");

    }

    //Test #1: Set locale to ES
    //Koraci:
    //Postaviti jezik na ES
    //Verifikovati da se na stranici u hederu javlja tekst Página de aterrizaje

    @Test(priority = 30)
    public void setLocaleToEN() {
        navPage.getLanguageButton().click();
        navPage.getButtonEnLanguage().click();
        Assert.assertTrue
                (navPage.getTextFromHeader().contains("Landing"),
                        "[ERROR] The language has not been changed to: 'EN'");

    }

    //Test #2: Set locale to EN
    //Koraci:
    //Postaviti jezik na EN
    //Verifikovati da se na stranici u hederu javlja tekst Landing

    @Test(priority = 30)
    public void setLocaleToCN() {
        navPage.getLanguageButton().click();
        navPage.getButtonCnLanguage().click();
        Assert.assertTrue
                (navPage.getTextFromHeader().contains("首页"),
                        "[ERROR] The language has not been changed to: 'CN'");

    }
    //Test #3: Set locale to CN
    //Koraci:
    //Postaviti jezik na CN
    //Verifikovati da se na stranici u hederu javlja tekst 首页

    @Test(priority = 40)
    public void setLocaleToFR() {
        navPage.getLanguageButton().click();
        navPage.getButtonFrLanguage().click();
        Assert.assertTrue
                (navPage.getTextFromHeader().contains("d'atterrissage"),
                        "[ERROR] The language has not been changed to: 'FR'");

    }
    //Test #4: Set locale to FR
    //Koraci:
    //Postaviti jezik na FR
    //Verifikovati da se na stranici u hederu javlja tekst Page d'atterrissage
}
