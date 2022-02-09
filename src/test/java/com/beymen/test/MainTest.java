package com.beymen.test;

import com.beymen.driver.BaseTest;
import com.beymen.pages.CartPage;
import com.beymen.pages.HomePage;
import com.beymen.pages.ProductDetailsPage;
import com.beymen.pages.ProductPage;
import org.junit.Test;

public class MainTest extends BaseTest {

    @Test
    public void mainTest(){
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        CartPage cartPage = new CartPage();
        homePage.home();
        homePage.goToMyAccount();
        homePage.goToFavourites();
        homePage.goToCart();
        homePage.goToHomePage();
        homePage.search();
        productPage.scrollPageBottom();
        productPage.clickMoreContentButton();
        productPage.randomSelectProduct();
        productDetailsPage.getPrice();
        productDetailsPage.randomSelectSize();
        productDetailsPage.addBasket();
        cartPage.goToCart();
        cartPage.comparePrices();
        cartPage.addQuantity();
        cartPage.checkAddQuantity();
        cartPage.removeCart();
        cartPage.checkRemove();
    }

}
