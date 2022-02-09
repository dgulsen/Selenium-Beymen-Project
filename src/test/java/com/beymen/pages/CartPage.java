package com.beymen.pages;

import com.beymen.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

    Methods methods;
    Logger logger = LogManager.getLogger(CartPage.class);

    public CartPage() {
        methods = new Methods();
    }

    public void goToCart() {
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[contains(text(),'Sepetim')]"));
    }

    public void comparePrices() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        methods.waitBySeconds(3);
        String salePrice = methods.getText(By.cssSelector(".m-productPrice__salePrice"));
        logger.info(salePrice);
        Assert.assertEquals(productDetailsPage.price, salePrice);
    }

    public void addQuantity() {
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//select[@class='a-selectControl -small']"), "2 adet");
    }

    public void checkAddQuantity() {
        methods.waitBySeconds(3);
        String quantity = methods.getSelect(By.id("quantitySelect0")).getFirstSelectedOption().getText();
        logger.info(quantity);
        Assert.assertEquals("2 adet", quantity);
    }

    public void removeCart() {
        methods.waitBySeconds(3);
        methods.click(By.id("removeCartItemBtn0"));
    }

    public void checkRemove() {
        methods.waitBySeconds(3);
        String text = methods.getText(By.xpath("//strong[text()='Sepetinizde Ürün Bulunmamaktadır']"));
        logger.info(text);
        Assert.assertEquals("SEPETINIZDE ÜRÜN BULUNMAMAKTADIR", text);
        methods.waitBySeconds(5);
    }

}
