package com.beymen.pages;

import com.beymen.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class ProductDetailsPage {

    Methods methods;
    static String price;
    Logger logger = LogManager.getLogger(ProductDetailsPage.class);

    public ProductDetailsPage() {
        methods = new Methods();
    }

    public void getPrice() {
        methods.waitBySeconds(3);
        price = methods.getText(By.xpath("//ins[@id='priceNew']"));
        logger.info(price);
    }

    public void randomSelectSize() {
        methods.waitBySeconds(3);
        methods.randomSelect(By.xpath("//span[@class='m-variation__item' or @class='m-variation__item -criticalStock']"));
    }

    public void addBasket() {
        methods.waitBySeconds(3);
        methods.click(By.xpath("//button[@id='addBasket']"));
        methods.waitBySeconds(3);
    }

}
