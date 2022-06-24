package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthRoutesTests extends BasicTest{
    @Test(priority = 10)
    public void forbidsVisitsToHomeUrlIfNotAuthenticated()  {
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/login"),
                "[ERROR] Forbids visits to home url if not authenticated   ");


    }
    @Test(priority = 20)
    public void forbidsVisitsToHomeUrlIfNotAuthenticated()  {
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/login"),
                "[ERROR] Forbids visits to home url if not authenticated  : '/login' ");


    }
    @Test(priority = 30)
    public void forbidsVisitsToHomeUrlIfNotAuthenticated()  {
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/login"),
                "[ERROR] Forbids visits to home url if not authenticated  : '/login' ");


    }
    @Test(priority = 40)
    public void forbidsVisitsToHomeUrlIfNotAuthenticated()  {
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/login"),
                "[ERROR] Forbids visits to home url if not authenticated  : '/login' ");


    }

//Test #1: Forbids visits to home url if not authenticated
//Koraci:
//Ucitati /home stranu
//Verifikovati da se u url-u stranice javlja ruta /login
//
//Test #2: Forbids visits to profile url if not authenticated
//Koraci:
//Ucitati /profile stranu
//Verifikovati da se u url-u stranice javlja ruta /login
//
//Test #3: Forbids visits to admin cities url if not authenticated
//Koraci:
//Ucitati /admin/cities stranu
//Verifikovati da se u url-u stranice javlja ruta /login
//
//
//
//Test #4: Forbids visits to admin users url if not authenticated
//Koraci:
//Ucitati /admin/users stranu
//Verifikovati da se u url-u stranice javlja ruta /login
}