package com.profillo.step_definitions;

import com.profillo.pages.BarrowBookPage;
import com.profillo.pages.ReturnBooksPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReturnBooks_stepDefs {



    @Then("the user click the active Return Book button")
    public void the_user_click_the_active_Return_Book_button() {
        BrowserUtils.waitFor(3);
        ReturnBooksPage button = new ReturnBooksPage();
        button.ReturnBookButton.click();
    }

    @Then("the user see green pop up after return the book")
    public void the_user_see_green_pop_up_after_return_the_book() {
        BrowserUtils.waitFor(3);
        ReturnBooksPage button = new ReturnBooksPage();
        Assert.assertTrue(button.message.isDisplayed());
    }

}
