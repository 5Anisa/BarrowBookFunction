package com.profillo.step_definitions;

import com.profillo.pages.FindingBookPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindingBook_stepDefs {
    @When("the user in search box should type the name of the book")
    public void the_user_in_search_box_should_type_the_name_of_the_book() {
        BrowserUtils.waitFor(3);
        FindingBookPage searchBox = new FindingBookPage();
        searchBox.searchBox.sendKeys("The Farm of Animal");

    }

    @Then("the user will see all books according to search")
    public void the_user_will_see_all_books_according_to_search() {
        BrowserUtils.waitFor(3);
        new FindingBookPage().BookName();
    }

    @When("the user in search box should type the name of author")
    public void the_user_in_search_box_should_type_the_name_of_author() {
        BrowserUtils.waitFor(3);
        FindingBookPage searchBox = new FindingBookPage();
        BrowserUtils.waitFor(2);
        searchBox.searchBox.clear();
        BrowserUtils.waitFor(1);
        searchBox.searchBox.sendKeys("Cervantes");
    }

    @Then("the user can see all books written by author that he searched")
    public void the_user_can_see_all_books_written_by_author_that_he_searched() {
        BrowserUtils.waitFor(3);
        new FindingBookPage().Author();
    }

}
