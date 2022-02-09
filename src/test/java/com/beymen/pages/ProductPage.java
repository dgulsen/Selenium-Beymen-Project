package com.beymen.pages;

import com.beymen.methods.Methods;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    By moreContentLocator = By.id("moreContentButton");

    public ProductPage(){
        methods = new Methods();
    }

    public void scrollPageBottom() {
        methods.waitBySeconds(3);
        methods.scrollWithAction(moreContentLocator);
    }

    public void clickMoreContentButton(){
        methods.waitBySeconds(3);
        methods.click(moreContentLocator);
    }

    public void randomSelectProduct(){
        methods.waitBySeconds(3);
        methods.randomSelect(By.xpath("//div[@class='m-productCard']"));
        methods.waitBySeconds(5);
    }

}
