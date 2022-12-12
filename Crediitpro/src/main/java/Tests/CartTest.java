package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.util.List;

public class CartTest extends BasicTest {
    List<WebElement> products;
    WebElement a;

    @Test(priority = 10)
    public void byOneProduct() throws InterruptedException {
        List<WebElement> products;
        home.getButtonCartHeader().click();
        products = product.getProducts();
        a = products.get(0);
        a.findElement(By.className("add-to-cart-container")).click();
        Assert.assertTrue(home.getNumberInCart() == 1,
                "[ERROR] The number of products in the basket is incorrect");
        home.getButtonProductsHeader().click();

        products = product.getProducts();
        a = products.get(0);
        a.findElement(By.className("add-to-cart-container")).click();
        Assert.assertTrue(home.getNumberInCart() == 2,
                "[ERROR] The number of products in the basket is incorrect");
    }
//    Inicijalizuje listu elemenata clik na korpu vodi na listu proizvoda klik by na prvom proizvodu validira da li je broj proizvoda u korpi jedan
//    klik na button product u hederu klik na by prvi proizvod proverava da li je u korpi broj proizvoda dva


    @Test(priority = 20)
    public void remuveFirstProductsInList() throws InterruptedException {
        List<WebElement> listAllProductsInList;
        home.getButtonCartHeader().click();
        Thread.sleep(2000);
        listAllProductsInList = checkout.getAllNameProductsInList();
        String firstElementInList = checkout.getAllNameProductsInList().get(listAllProductsInList.size()/2).getText();
        List<WebElement> listRemuveElement = checkout.getProductsInList();
        listRemuveElement.get(0).click();

        listAllProductsInList = checkout.getAllNameProductsInList();

        boolean notCrimp = true;
        for (int i = 0; i < listAllProductsInList.size(); i++) {
         if(listAllProductsInList.get(i).getText().contains(firstElementInList)){
             notCrimp =false;
         }
            Assert.assertTrue(notCrimp,
                    "[ERROR] The first product in the list has not been deleted");
        }


    }
    //klik na button cart u hederu vraca listu svih elemenata sa textom remuv brise prvi element na listi

    @Test(priority = 30)
    public void byAllProducts() throws InterruptedException {
        int numberProduct = 0;
        double totalPrice = 0;

        home.getButtonProductsHeader().click();
        List<WebElement> listPrice = product.getPrice();
        products = product.getProducts();
        for (int i = 1; i <= products.size(); i++) {
            double price = Double.parseDouble(product.getPrice().get(i * 2 - 2).getText().substring(1));
            double priceForMount = Double.parseDouble(product.getPrice().get(i * 2 - 1).getText().substring(1));
            totalPrice = totalPrice + price + priceForMount;
            product.getProducts().get(i - 1).findElement(By.className("add-to-cart-container")).click();//uzimalistu elemenata vadi element i uzima podelement na kog klikce
            numberProduct++;
            home.getButtonProductsHeader().click();
            Assert.assertTrue(home.getNumberInCart() == numberProduct,
                    "[ERROR] The number of products in the basket is incorrect");

        }
        DecimalFormat df = new DecimalFormat("#.##");
        double totalPriceTwoDigits = Double.parseDouble(df.format(totalPrice));
        home.getButtonCartHeader().click();
        Thread.sleep(2000);
        Assert.assertTrue(Double.parseDouble(checkout.getTotalPriceInCheckout().getText().substring(1).replaceAll(",", "")) == totalPriceTwoDigits,
                "[ERROR] The sum of all product prices and the total in the cart are not the same");

    }
    //klikce na button product klikce na prvi prizvod proverava da li se broj proizvoda povecao u korpi  i racuna ukupnu cenu klice na proizvode sve dok sve ne doda u korpu
    //zasto svali put poziva listu kako da izbegnem osmu decimalu
    //jel bilo lakse resenje nego da povucem sve cene

    @Test(priority = 40)
    public void remuveAllProducts() throws InterruptedException {
        home.getButtonCartHeader().click();
        Thread.sleep(500);
        List<WebElement> listRemuveElement = checkout.getProductsInList();
        for (int i = 0; i < listRemuveElement.size(); i++) {
            remuveFirstProductsInList();
        }
        Assert.assertTrue(driver.findElement(By.className("cart-content")).getText().isEmpty(),
                "[ERROR] The function for emptying the entire basket did not completely empty it");

    }
    //klik na korpu na hederu klikce na brisi sve dok ima elemenata u korpi proverava jer vise nema znacku za broj proizvoda u korpi


}
