package com.profillo.step_definitions;

import com.profillo.pages.BarrowBookPage;
import com.profillo.pages.HistoryBorrowPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HistoryBorrowed_stepDefs {

    @When("the user navigate Borrowing Book module")
    public void the_user_navigate_Borrowing_Book_module() {
        BrowserUtils.waitFor(3);
        HistoryBorrowPage module = new HistoryBorrowPage();
        module.BorrowingBookModule.click();


    }

    @Then("the user should see own borrowed books history")
    public void the_user_should_see_own_borrowed_books_history() {
        BrowserUtils.waitFor(3);
        Assert.assertEquals("http://library3.cybertekschool.com/#borrowing-books", Driver.get().getCurrentUrl());


    }
}
