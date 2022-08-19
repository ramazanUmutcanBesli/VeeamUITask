package com.veeam.step_definitions;

import com.veeam.pages.SearchPage;
import com.veeam.utilities.BrowserUtils;
import com.veeam.utilities.ConfigurationReader;
import com.veeam.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VeeamUIstepdefinitions {
    SearchPage searchPage=new SearchPage();
    public static int countOfJobs;
    public static int expectCountOfJobs;
    @Given("user is on careers page")
    public void user_is_on_careers_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user choose Research & Development in All Departments select button")
    public void user_choose_research_development_in_all_departments_select_button() {
        searchPage.acceptCookies.click();
        searchPage.allDeparmentsSelect.click();
        BrowserUtils.sleep(1);
        searchPage.researchAndDevelopment.click();
    }
    @When("user choose English language in All Languages list")
    public void user_choose_english_language_in_all_languages_list() {
        searchPage.allLanguagesButton.click();
        BrowserUtils.sleep(1);
        searchPage.englishLanguage.click();
        searchPage.allLanguagesButton.click();
    }

    @Then("compare that number of found jobs and number of expected results")
    public void compare_that_number_of_found_jobs_and_number_of_expected_results() {
        countOfJobs=Integer.parseInt(searchPage.countOfExpectedJobs.getText());
        System.out.println("countOfJobs = " + countOfJobs);
        expectCountOfJobs=searchPage.jobs.size();
        System.out.println("expectCountOfJobs = " + expectCountOfJobs);
        Assert.assertEquals("Expected value is not equal actual value",expectCountOfJobs,countOfJobs);
    }
}
