package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest extends BasicTest {

    @Test(priority = 10)
    public void checksLinkHeader() throws InterruptedException {

        home.getButtonProductsHeader().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/products"),
                "[ERROR] Not on a good page(products)");

        Assert.assertTrue
                (home.getTextFromHeader().contains("Credit Repair Products"),
                        "[ERROR] Not on a good page(products)");



        home.getButtonAboutUsHeader().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/about-us"),
                "[ERROR] Not on a good page(Products)");
        Assert.assertTrue
                (home.getTextFromHeader().contains("About us"),
                        "[ERROR] Not on a good page(About us)");


        home.getButtonBlogHeader().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/blog"),
                "[ERROR] Not on a good page(blog)");
        Assert.assertTrue
                (home.getTextFromHeader().contains("Blog"),
                        "[ERROR] Not on a good page(Blog));");



        home.getButtonContactHeader().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/contact-us"),
                "[ERROR] Not on a good page(contact-us)");
        Assert.assertTrue
                (home.getTextFromHeader().contains("Get in touch"),
                        "[ERROR] Not on a good page(Contact));");


        home.getButtonNet30getHeader().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/get-net-30-vendor-account-fast"),
                "[ERROR] Not on a good page(get-net-30-vendor-account-fast)");
        Assert.assertTrue
                (home.getTextFromHeader().contains("How to Open a Net"),
                        "[ERROR] Not on a good page(Net 30));");




        home.getButtonCreditProHeader().click();
        Assert.assertTrue(
                driver.getCurrentUrl().equals("https://crediitpro.com/"),
                "[ERROR] Not on a good page(home)");



        home.getButtonLoginHeader().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/my-account"),
                "[ERROR] Not on a good page(my-account)");
        Assert.assertTrue
                (home.getTextFromHeader().contains("Login"),
                        "[ERROR] Not on a good page(my-account));");

    }

    @Test(priority = 20)
    public void checksLinkFooter() throws InterruptedException {

        home.getButtonNet30getFooter().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/get-net-30-vendor"),
                "[ERROR] Not on a good page(net-30)");
        Assert.assertTrue
                (home.getTextFromHeader().contains("How to Open a Net"),
                        "[ERROR] Not on a good page(net-30));");


        home.getButtonBecomeAnAffFooter().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/become-an-affiliate"),
                "[ERROR] Not on a good page(become-an-affiliate)");
        Assert.assertTrue
                (home.getTextFromHeader().contains("Join our Affiliate Program."),
                        "[ERROR] Not on a good page(become-an-affiliate));");


        home.getButtonTermsConditionsFooter().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/terms-and-conditions")
                        & home.getTextFromHeader().contains("Terms And Conditions"),
                "[ERROR] Not on a good page(terms-and-conditions)");

        home.getButtonContactFooter().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/contact-us")
                        & home.getTextFromHeader().contains("Get in touch"),
                "[ERROR] Not on a good page(contact-us)");

        home.getButtonPrivacyPolicyFooter().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/privacy-policy")
                        & home.getTextFromHeader().contains("Privacy Policy"),
                "[ERROR] Not on a good page(privacy-policy)");

        home.getButtonBlogFooter().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/blog")
                & home.getTextFromHeader().contains("Blog"),
                "[ERROR] Not on a good page(blog)");

        home.getButtonFAQ().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/faq")
                        & home.getTextFromHeader().contains("Frequently Asked Questions"),
                "[ERROR] Not on a good page(faq)");

    }



    @Test(priority = 30)
    public void searchFunction() throws InterruptedException {
        home.getButtonSearchHeader().click();
        Thread.sleep(1000);
        Assert.assertTrue(
                home.getSearchWindowsHeader().isDisplayed(),
                "[ERROR] Windows cearch not display");
        Thread.sleep(1000);
        home.getInputSearch().sendKeys("Section");
        home.getButttonSearchInWindows().click();
        Assert.assertTrue(home.getNumberElementInSearch()>=3);
       //proverava jel ima minimum tri rezultata pretrage
    }

    @Test(priority = 40)
    public void subscribeFunction() throws InterruptedException {
        home.getInputSubscribe().sendKeys(email);
        home.getButtonSubscribe().click();

    }
    @Test(priority = 40)
    public void subscribeFunction1() throws InterruptedException {
        WebElement i = driver.findElement
                (By.xpath("//img[@title='Tutorialspoint']"));
        // Javascript executor to check image
        Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

        //verify if status is true
        if (p) {
            System.out.println("Logo present");
        } else {
            System.out.println("Logo not present");
        }
    }

}
