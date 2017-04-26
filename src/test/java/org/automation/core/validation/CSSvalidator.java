package org.automation.core.validation;

import org.openqa.selenium.WebElement;

/**
 * Created by shantonu on 12/10/16.
 */
//this will validate all CSS from driver source.
    //TODO , see all CSS tags & create methods => http://www.w3schools.com/css/default.asp
public class CSSvalidator {

    private WebElement aWebElement;
    public CSSvalidator(WebElement element){
        aWebElement = element;
    }
    private CSSvalidator(){}
    public boolean isTagPresent(String tag){return false;}
    public boolean isClassPresent(String aClass){return false;}
    public boolean isIDPresent(String id){return false;}
    public boolean isFontPresent(String font){return false;}
    public boolean isColorPresent(String color){return false;}
}
