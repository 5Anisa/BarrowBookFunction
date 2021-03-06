package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BarrowBookPage extends BasePage {
    public BarrowBookPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//tr[@role='row']//td")
    public WebElement BarrowBookbuton;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement Messsage;




//    @FindBy(xpath = "//span[text()='Borrowing Books']")
 //   public WebElement BorrowingBooksModule;

}
