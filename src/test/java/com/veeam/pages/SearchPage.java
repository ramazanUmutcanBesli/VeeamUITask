package com.veeam.pages;

import com.veeam.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public static Integer countOfJobs;
    public static Integer actualCountofJobs;
    //div/div[1]/div/div/div/button[@id='sl']
    @FindBy(xpath = "//div[@id='cookiescript_accept']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//div[1]/div/div/div[1]/div/div[2]/div/div/button")
    public WebElement allDeparmentsSelect;

    @FindBy(xpath = "//a[.='Research & Development']")
    public WebElement researchAndDevelopment;

    @FindBy(xpath = "//div[1]/div/div/div[1]/div/div[3]/div/div/button")
    public WebElement allLanguagesButton;

    @FindBy(xpath = "//label[@for='lang-option-0']")
    public WebElement englishLanguage;

    @FindBy(xpath = "//div[@class='card-header pb-2']")
    public List<WebElement> jobs;

    @FindBy(xpath = "//span[@class='text-secondary pl-2']")
    public WebElement countOfExpectedJobs;


    public Integer convertingofcountofJobs(){
        return countOfJobs=Integer.parseInt(countOfExpectedJobs.getText());
    }
    public Integer countOfActualJobs(){
        return actualCountofJobs=jobs.size();
    }


}
