package com.beymen.pages;

import com.beymen.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;


public class HomePage {

    Methods methods;
    By searchBoxLocator = By.xpath("//input[@class='default-input o-header__search--input']");

    public HomePage() {
        methods = new Methods();
    }

    public void home() {
        methods.waitBySeconds(3);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//img[@class='o-header__logo--img']")));
    }

    public void goToMyAccount() {
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[text()='Hesabım']"));
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div/h3[contains(text(),'GİRİŞ YAP')]")));
    }

    public void goToFavourites() {
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[contains(text(),'Favorilerim')]"));
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//h1")));
    }

    public void goToCart() {
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[contains(text(),'Sepetim')]"));
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//a[@title='Alışverişe Devam Et']")));
    }

    public void goToHomePage(){
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@class='o-header__logo']"));
    }

    public void search(){
        methods.waitBySeconds(3);
        methods.sendKeys(searchBoxLocator,"pantolon");
        methods.waitBySeconds(2);
        methods.enter(searchBoxLocator);
    }
}
