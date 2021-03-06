package com.profillo.pages;

import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookCategoriesPage extends BasePage{
        public BookCategoriesPage() {
            PageFactory.initElements(Driver.get(), this);}

    @FindBy(id="book_categories")
    public WebElement categoryDropdown;

    @FindBy(xpath="//table//tbody//tr/td[5]")
    public List<WebElement> table;

    public void selectCategory() {

        BrowserUtils.waitFor( 2 );
        String category = null;
        for (int i = 1; i <= table.size(); i++) {
            String xpath = "//table[@id='tbl_books']/tbody[1]/tr[" + i + "]/td[5]";
            category = Driver.get().findElement( By.xpath( xpath ) ).getText();
            Assert.assertEquals( "Classic",category );
        }
    }
}
