package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminCitiesTests extends BasicTest {
    private String email;
    private String password;

    private String city;

    private String newCityName = "xxxdx";

    private String oldCityName = "Marko Milosevic /nis";

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
//@Test(priority = 20)
//public void checksInputTypesForCreateEditNewCity()  {
//        navPage.getLinkAdmin().click();
//        navPage.getButtonCitis().click();
//        citiesPage.getButtonNewItem().click();
//        citiesPage.getVisualElementDialogueNewItem();
//    Assert.assertEquals
//            (citiesPage.getInputCities().getAttribute("type"),"text",
//                    "[ERROR] Input type for name cities is not good");
//
//}
//Test #2: Checks input types for create/edit new city
//Koraci:
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//Kliknuti na New Item dugme
//Sacekati da se dijalog za kreiranje i editovanje grada pojavi
//Verifikovati da polje za unos grada za atribut type ima tekst text
//    @Test(priority = 30)
//    public void createNewCity()  {
//
//        navPage.getLinkAdmin().click();
//        navPage.getButtonCitis().click();
//        citiesPage.getButtonNewItem().click();
//        citiesPage.getVisualElementDialogueNewItem();
//        citiesPage.getInputCities().sendKeys(oldCityName);
//        citiesPage.getButtonSave().click();
//        citiesPage.getVisualElementDialogueSaved();
//        Assert.assertTrue
//                (citiesPage.getTextMesage().contains("Saved successfully"),
//                        "[ERROR] Message not contain: 'Saved successfully'");
//}

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

}