package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryBorrowPage extends BasePage {
    public HistoryBorrowPage() {
        PageFactory.initElements(Driver.get(), this);}


        @FindBy(xpath = "//span[text()='Borrowing Books']")
    public WebElement BorrowingBookModule;

    @FindBy(xpath = "//span[text()='Test Student 46']")
    public WebElement UsersBorrowedBookHistory;

    @FindBy(xpath = "user_list")
    public WebElement UserBox;







}