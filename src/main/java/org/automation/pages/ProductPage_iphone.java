package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by shantonu on 12/14/16.
 * Contributors will add all items
 * todo :
 * See http://demo.opencart.com/index.php?route=product/product&product_id=40
 * Fillup all findby in all web elements
 * parse the source and get those links
 * complete the write a review function.
 */
public class ProductPage_iphone extends PageBase {
    public ProductPage_iphone(WebDriver aDriver) {
        super(aDriver);
    }

    @FindBy(how=How.LINK_TEXT, linkText = "Description")
    public WebElement description_link;

    public WebElement description_body;

    public WebElement review_link;

    public WebElement wishList_link;
    public WebElement compare_link;
    public WebElement brand_link;
    public WebElement avaiability_text;
    public WebElement productCode_text;
    public WebElement productTitle_text;
    public WebElement productPrice;
    public WebElement productTax;
    public WebElement addToCart_button;
    public WebElement quantity_textbox;
    public WebElement continue_review_button;

    public boolean writeAReview(String name, String review, int rating){

        return false;
    }

    /**
     * This will get all image links from a loaded product which has thumbnail.
     * @return
     * todo
     */
    public String[] getAllImageLinks(){
        final String source = driver.getPageSource();
        String pattern = "class=\"thumbnail\"\\shref=\"(.+?jpg)";
        return null;
    }

}
