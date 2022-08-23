package uk.nhs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.utility.Utility;

public class ScenarioThree extends Utility {

    public ScenarioThree() {
        PageFactory.initElements(driver, this);
    }

    //What is your date of birth?---Day

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-day']")
    WebElement dayOfBirthDate3;


    //What is your date of birth?---Month
    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-month']")
    WebElement monthOfBirthDate3;

    // //What is your date of birth?---year

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-year']")
    WebElement yearOfBirthYear3;

    // Next Button Birth Date
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement clickNextBirthDate3;

    //Result
    @CacheLookup
    @FindBy(xpath = "//body/main[@id='content']/div[2]/div[1]/div[2]/h2[1]")
    WebElement resultScenario3;

    //What is your date of birth?---day
    public void enterDayOfBirthday(String date) {
        sendTextToElement(dayOfBirthDate3, date);
    }

    // What is your date of birth?---month
    public void enterMonthOfBirth(String month) {
        sendTextToElement(monthOfBirthDate3, month);
    }

    //What is your date of birth?---year
    public void enterYearOfBirth(String year) {
        sendTextToElement(yearOfBirthYear3, year);
    }

    //Next Button Birth Date
    public void clickOnNextButtonBirthDate() {
        clickOnElement(clickNextBirthDate3);
    }
  // Result
     public String setResultScenario3(){
         String actual = getTextFromElement(resultScenario3);
         System.out.println(getTextFromElement(resultScenario3));
         return actual;
     }
}
