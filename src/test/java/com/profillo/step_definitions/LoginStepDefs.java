package com.profillo.step_definitions;

import com.profillo.pages.LoginPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.ConfigurationReader;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("Student logged in the application")
    public void student_logged_in_the_application() {
        String url = ConfigurationReader.get( "url" );
        Driver.get().get( url );
        String mailAddress = ConfigurationReader.get( "student_mailAddress" );
        String password = ConfigurationReader.get( "student_password" );
        LoginPage loginPage = new LoginPage();
        loginPage.login(mailAddress,password);
        BrowserUtils.waitFor( 3 );
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals( "Library", actualTitle );
    }

}