package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AuthRoutesTests extends BasicTest{

    @Test(priority = 10)
    public void forbidsVisitsToHomeUrlIfNotAuthenticated() throws InterruptedException {
        driver.get(baseUrl + "home");
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/login"),
                "[ERROR] Page url does not contains : '/login' ");
    }
    //Test #1: Forbids visits to home url if not authenticated
//Koraci:
//Ucitati /home stranu
//Verifikovati da se u url-u stranice javlja ruta /login

    @Test(priority = 20)
    public void forbidsVisitsToProfileUrlIfNotAuthenticated()  {
        driver.get(baseUrl + "profile");
        Assert.assertTrue(
                driver.getCurrentUrl().contains("login"),
                "[ERROR] Forbids visits to home url if not authenticated  : '/login' ");
    }
    //Test #2: Forbids visits to profile url if not authenticated
//Koraci:
//Ucitati /profile stranu
//Verifikovati da se u url-u stranice javlja ruta /login

    @Test(priority = 30)
    public void forbidsVisitsToAdminCitiesUrlIfNotAuthenticated()  {
        driver.get(baseUrl + "admin/cities");
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/login"),
                "[ERROR] Forbids visits to home url if not authenticated  : '/login' ");
    }
    //Test #3: Forbids visits to admin cities url if not authenticated
//Koraci:
//Ucitati /admin/cities stranu
//Verifikovati da se u url-u stranice javlja ruta /login

    @Test(priority = 40)
    public void forbidsVisitsToAdminUsersUrlIfNotAuthenticated()  {
        driver.get(baseUrl + "admin/cities");
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/login"),
                "[ERROR] Forbids visits to home url if not authenticated  : '/login' ");
    }

//Test #4: Forbids visits to admin users url if not authenticated
//Koraci:
//Ucitati /admin/users stranu
//Verifikovati da se u url-u stranice javlja ruta /login
}