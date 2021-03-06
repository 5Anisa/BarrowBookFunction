package com.profillo.pages;

import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindingBookPage extends BasePage{
    public FindingBookPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(tagName = "input")
    public WebElement searchBox;


    public void BookName(){
        List<WebElement> nameBook = new ShowRecordsDropdownPage().sizeTabe;
        BrowserUtils.waitFor( 3 );

        for (int i = 1; i <= nameBook.size(); i++) {
            String bookName = Driver.get().findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
            BrowserUtils.waitFor(2);
            Assert.assertEquals( "The Farm of Animal", bookName);

        }
    }
    public void Author() {
        List<WebElement> nameBook = new ShowRecordsDropdownPage().sizeTabe;
        BrowserUtils.waitFor(3);

        for (int i = 1; i <= nameBook.size(); i++) {
            String authorName = Driver.get().findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
            BrowserUtils.waitFor(2);
            Assert.assertEquals("Cervantes", authorName);

        }
    }

    }
