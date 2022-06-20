package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTests extends BasicTest{

    @Test(priority = 10)
    public void visitsTheLoginPage() throws InterruptedException {


    }
}
//Test #1: Visits the login page
//Koraci:
//Postaviti EN jezik stranice
//Klik na login dugme iz navigacije
//Verifikovati da se u url-u stranice javlja ruta /login
//
//
//
//Test #2: Checks input types
//Koraci:
//Klik na login dugme iz navigacije
//Verifikovati da polje za unos emaila za atribut type ima vrednost email
//Verifikovati da polje za unos lozinke za atribut type ima vrednost password
//
//
//
//Test #3: Displays errors when user does not exist
//Podaci:
//email: non-existing-user@gmal.com
//password: password123
//Koraci:
//Klik na login dugme iz navigacije
//Popuniti login formu podacima za logovanje
//Klik na login dugme
//Sacekati da popu za prikaz greske bude vidljiv
//Verifikovati da greska sadrzi poruku User does not exists
//Verifikovati da se u url-u stranice javlja /login ruta
//
//
//
//
//
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
//
//Test #5: Login
//Podaci:
//email: admin@admin.com
//password: 12345
//Koraci:
//Klik na login dugme iz navigacije
//Popuniti login formu podacima za logovanje
//Verifikovati da se u url-u stranice javlja /home ruta
//
//
//Test #6: Logout
//Koraci:
//Verifikovati da je dugme logout vidljivo na stranici
//Kliknuti na logout dugme