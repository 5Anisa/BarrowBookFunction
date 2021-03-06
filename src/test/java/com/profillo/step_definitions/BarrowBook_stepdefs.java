package com.profillo.step_definitions;

import com.profillo.pages.BarrowBookPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BarrowBook_stepdefs {
    @When("the user click the active Barrow Book button")
    public void the_user_click_the_active_Barrow_Book_button() {
        BrowserUtils.waitFor(6);
        BarrowBookPage button = new BarrowBookPage();
        button.BarrowBookbuton.click();



    }


    @Then("the user can see green pop up and borrow the book")
    public void the_user_can_see_green_pop_up_and_borrow_the_book() {
        BrowserUtils.waitFor(2);
        BarrowBookPage barrowBookPage = new BarrowBookPage();
        Assert.assertTrue(barrowBookPage.Messsage.isDisplayed());

    }



}
