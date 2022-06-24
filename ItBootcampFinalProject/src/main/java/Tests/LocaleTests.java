package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocaleTests extends BasicTest{

    @Test(priority = 10)
    public void visitsTheLoginPage() throws InterruptedException {
        navPage.getLanguageButton().click();
        navPage.getEnglishLanguageButton().click();
        navPage.getEsLanguageButton().;
        Thread.sleep(2000);
        System.out.println(navPage.getTextFromHeader());

    }

    //Test #1: Set locale to ES
    //Koraci:
    //Postaviti jezik na ES
    //Verifikovati da se na stranici u hederu javlja tekst Página de aterrizaje
    //
    //Test #2: Set locale to EN
    //Koraci:
    //Postaviti jezik na EN
    //Verifikovati da se na stranici u hederu javlja tekst Landing
    //
    //
    //Test #3: Set locale to CN
    //Koraci:
    //Postaviti jezik na CN
    //Verifikovati da se na stranici u hederu javlja tekst 首页
    //
    //Test #4: Set locale to FR
    //Koraci:
    //Postaviti jezik na FR
    //Verifikovati da se na stranici u hederu javlja tekst Page d'atterrissage
}
