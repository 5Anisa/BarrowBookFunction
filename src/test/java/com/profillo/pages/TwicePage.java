package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwicePage extends BasePage {
    public TwicePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//tbody/tr/td[1]")
    public WebElement inactiveButton;



}
