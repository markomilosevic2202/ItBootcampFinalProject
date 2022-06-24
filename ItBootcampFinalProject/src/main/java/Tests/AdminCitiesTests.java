package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminCitiesTests extends BasicTest {
    private String email;
    private String password;

    private String city;

    private String newCityName = "Marko Milosevic";

    private String oldCityName = "Marko";

    @Test(priority = 10)
    public void visitsTheAdminCitiesPageAndListCities() {
        email = "admin@admin.com";
        password = "12345";
        navPage.getLoginLink().click();
        loginPage.getEmailInput().sendKeys(email);
        loginPage.getPasswordInput().sendKeys(password);
        loginPage.getSubmitButton().click();
        navPage.getVisualElementLinkAdmin();
        navPage.getLinkAdmin().click();
        navPage.getButtonCitis().click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/admin/cities"),
                "[ERROR] Page url does not contains : '/admin/cities' ");


    }

    //Test #1: Visits the admin cities page and list cities
//Podaci:
//admin email: admin@admin.com
//admin password: 12345
//Koraci:
//Klik na sign up dugme iz navigacije
//Prijaviti se na sistem admin kredencijalima
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//Verifikovati da se u url-u stranice javlja /admin/cities ruta
    @Test(priority = 20)
    public void checksInputTypesForCreateEditNewCity() {
        navPage.getLinkAdmin().click();
        navPage.getButtonCitis().click();
        citiesPage.getButtonNewItem().click();
        citiesPage.getVisualElementDialogueNewItem();
        Assert.assertEquals
                (citiesPage.getInputCities().getAttribute("type"), "text",
                        "[ERROR] Input type for name cities is not good");

    }

    //Test #2: Checks input types for create/edit new city
//Koraci:
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//Kliknuti na New Item dugme
//Sacekati da se dijalog za kreiranje i editovanje grada pojavi
//Verifikovati da polje za unos grada za atribut type ima tekst text
    @Test(priority = 30)
    public void createNewCity() {

        navPage.getLinkAdmin().click();
        navPage.getButtonCitis().click();
        citiesPage.getButtonNewItem().click();
        citiesPage.getVisualElementDialogueNewItem();
        citiesPage.getInputCities().sendKeys(oldCityName);
        citiesPage.getButtonSave().click();
        citiesPage.getVisualElementDialogueSaved();
        Assert.assertTrue
                (citiesPage.getTextMesage().contains("Saved successfully"),
                        "[ERROR] Message not contain: 'Saved successfully'");
    }

    //Test #3: Create new city
//Podaci:
//city: [Ime i prezime polaznika]’s city
//Koraci:
//
//
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//Kliknuti na New Item dugme
//Sacekati da se dijalog za kreiranje i editovanje grada pojavi
//Uneti ime grada u polje
//Kliknuti na Save dugme
//Sacekati da popu za prikaz poruke bude vidljiv
//Verifikovati da poruka sadrzi tekst Saved successfully
    @Test(priority = 40)
    public void editCity()  {

        navPage.getLinkAdmin().click();
        navPage.getButtonCitis().click();
        citiesPage.getInputSearch().sendKeys(oldCityName);
        citiesPage.waitNumberElementsToBe(1);
        citiesPage.getButtonEdit(1).click();
        citiesPage.getInputCities().sendKeys(Keys.CONTROL + "a");
        citiesPage.getInputCities().sendKeys(newCityName);
        citiesPage.getButtonSave().click();
        citiesPage.getVisualElementDialogueSaved();
        //  Thread.sleep(2000);

        Assert.assertTrue
                (citiesPage.getTextMesage().contains("Saved successfully"),
                        "[ERROR] Message not contain: 'Saved successfully'");
    }

    //Test #4: Edit city
//Podaci:
//old city name: [Ime i prezime polaznika]’s city
//new city name: [Ime i prezime polaznika]’s city Edited
//Koraci:
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//U polje za pretragu uneti staro ime grada
//Sacekati da broj redova u tabeli bude 1
//Kliknuti na dugme Edit iz prvog reda
//Uneti novo ime za grad
//Kliknuti na dugme Save
//Sacekati da popu za prikaz poruke bude vidljiv
//Verifikovati da poruka sadrzi tekst Saved successfully
    @Test(priority = 50)
    public void searchCity() {

        navPage.getLinkAdmin().click();
        navPage.getButtonCitis().click();
        citiesPage.getInputSearch().sendKeys(newCityName);
        citiesPage.waitNumberElementsToBe(1);
        Assert.assertTrue
                (citiesPage.getTextFromACell(1, 2).contains(newCityName),
                        "[ERROR] Message not contain: 'Saved successfully'");
    }

    //Test #5: Search city
//Podaci:
//city name: [Ime i prezime polaznika]’s city Edited
//Koraci:
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//U polje za pretragu uneti staro ime grada
//Sacekati da broj redova u tabeli bude 1
//Verifikovati da se u Name koloni prvog reda nalazi tekst iz pretrage
    @Test(priority = 60)
    public void deleteCity() {
        navPage.getLinkAdmin().click();
        navPage.getButtonCitis().click();
        citiesPage.getInputSearch().sendKeys(newCityName);
        citiesPage.waitNumberElementsToBe(1);
        Assert.assertTrue
                (citiesPage.getTextFromACell(1, 2).contains(newCityName),
                        "[ERROR] Message not contain: 'Saved successfully'");
        citiesPage.getButtonDelete(1).click();
        citiesPage.getVisualElementDialogueDelete();
        citiesPage.getButtonDeleteFromDialog().click();
        System.out.println(citiesPage.getTextMesage() + "aaaaaaaaaaaaaaaaaaaaaaaaaa");
        citiesPage.getVisualElementDialogueSaved();
        Assert.assertTrue
                (citiesPage.getTextMesage().contains("Deleted successfully"),
                        "[ERROR] Message not contain: 'Deleted successfully'");


    }
//Test #5: Delete city
//Podaci:
//city name: [Ime i prezime polaznika]’s city Edited
//Koraci:
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//U polje za pretragu uneti staro ime grada
//Sacekati da broj redova u tabeli bude 1
//Verifikovati da se u Name koloni prvog reda nalazi tekst iz pretrage
//Kliknuti na dugme Delete iz prvog reda
//Sacekati da se dijalog za brisanje pojavi
//Kliknuti na dugme Delete iz dijaloga
//Sacekati da popu za prikaz poruke bude vidljiv
//Verifikovati da poruka sadrzi tekst Deleted successfully
}