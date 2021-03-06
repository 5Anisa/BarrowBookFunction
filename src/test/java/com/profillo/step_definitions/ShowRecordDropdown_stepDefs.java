package com.profillo.step_definitions;

import com.profillo.pages.ShowRecordsDropdownPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ShowRecordDropdown_stepDefs {

    @Then("the user should be able to click to show records dropdown box")
    public void the_user_should_be_able_to_click_to_show_records_dropdown_box() {
        BrowserUtils.waitFor(3);
        ShowRecordsDropdownPage recordsBox = new ShowRecordsDropdownPage();
        recordsBox.recordBox.click();
    }

    @When("the user select one option in show records dropdown")
    public void the_user_select_one_option_in_show_records_dropdown() {
        BrowserUtils.waitFor(3);
        Select select = new Select(new ShowRecordsDropdownPage().recordBox);
        select.selectByVisibleText("10");


    }

    @Then("the user should be able to see the exact number of books that he selected")
    public void the_user_should_be_able_to_see_the_exact_number_of_books_that_he_selected() {
        BrowserUtils.waitFor( 2 );
        List<WebElement> columnEditBook = new ShowRecordsDropdownPage().sizeTabe;
        BrowserUtils.waitFor( 3 );
        Assert.assertEquals( 10, columnEditBook.size() );
    }


}
