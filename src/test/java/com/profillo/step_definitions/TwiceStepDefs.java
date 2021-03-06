package com.profillo.step_definitions;

import com.profillo.pages.TwicePage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TwiceStepDefs {
    @When("the user click inactive Borrow Book button")
    public void the_user_click_inactive_Borrow_Book_button() {
        BrowserUtils.waitFor(3);
        TwicePage button = new TwicePage();
        button.inactiveButton.click();
    }

    @Then("the user can not borrowed same book twice")
    public void the_user_can_not_borrowed_same_book_twice() {
        BrowserUtils.waitFor(3);
        Assert.assertEquals("http://library3.cybertekschool.com/#books", Driver.get().getCurrentUrl());

    }

}
