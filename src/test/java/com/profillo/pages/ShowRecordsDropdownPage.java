package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShowRecordsDropdownPage extends BasePage {
    public ShowRecordsDropdownPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(name = "tbl_books_length")
    public WebElement recordBox;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> sizeTabe;

    @FindBy(name = "//tr[@role='row']//a")
    public WebElement columnNumber;
}