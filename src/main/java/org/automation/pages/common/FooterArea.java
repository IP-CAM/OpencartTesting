package org.automation.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 12/14/16.
 * todo, all element locators
 */
public class FooterArea extends PageBase {

    public FooterArea(WebDriver aDriver) {
        super(aDriver);
    }

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=4']")
    @CacheLookup
    public WebElement aboutUsLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=6']")
    @CacheLookup
    public WebElement deliveryInfoLink;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=3']")
    @CacheLookup
    public WebElement privacyPolicyLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=5']")
    @CacheLookup
    public WebElement termsAndConditionLink;
    @FindBy(css = ".account-login footer div.container div.row div:nth-of-type(2) ul.list-unstyled li:nth-of-type(1) a")
    @CacheLookup
    public WebElement contactUsLink;
    public WebElement returnsLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/sitemap']")
    @CacheLookup
    public WebElement siteMapLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/manufacturer']")
    @CacheLookup
    public WebElement brandsLink;
    public WebElement giftVoucersLink;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=affiliate/account']")
    @CacheLookup
    public WebElement affiliatesLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/special']")
    @CacheLookup
    public WebElement specialsLink;

    public WebElement myAccountLink;
    @FindBy(css = "#column-right div.list-group a:nth-of-type(7)")
    @CacheLookup
    public WebElement orderHistoryLink;
    public WebElement wishListLink;
    public WebElement newsLetterLink;

    public WebElement copyright;

    //this

}
