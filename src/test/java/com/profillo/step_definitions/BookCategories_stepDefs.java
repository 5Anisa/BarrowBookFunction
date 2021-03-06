package com.profillo.step_definitions;

import com.profillo.pages.BookCategoriesPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookCategories_stepDefs {

    @When("the user click Book Categories dropdown box")
    public void the_user_click_Book_Categories_dropdown_box() {
        BrowserUtils.waitFor(3);
        BookCategoriesPage box = new BookCategoriesPage();
        box.categoryDropdown.click();


    }

    @Then("the user see all book categories")
    public void the_user_see_all_book_categories(List<String> bookOptions) {
        BrowserUtils.waitFor(3);
        Select select = new Select( new BookCategoriesPage().categoryDropdown );
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        List<String> actualOptions = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(bookOptions,actualOptions);


        }

    @When("the user select and click one category")
    public void the_user_select_and_click_one_category() {
        BrowserUtils.waitFor(3);
        Select select = new Select( new BookCategoriesPage().categoryDropdown );
        select.selectByVisibleText( "Humor");

    }

    @Then("the user see books related to that category")
    public void the_user_see_books_related_to_that_category() {
        BrowserUtils.waitFor(3);
        new BookCategoriesPage().selectCategory();
    }


}
