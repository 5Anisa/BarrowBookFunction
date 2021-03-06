package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnBooksPage extends BasePage{
    public ReturnBooksPage() {
        PageFactory.initElements(Driver.get(), this);}


    @FindBy(xpath = "//table[@id='borrowed_list']/tbody[1]/tr[64]/td[1]/a[1]")
    public WebElement ReturnBookButton;

    @FindBy (className= "toast-message")
    public WebElement message;
}
