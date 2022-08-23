package uk.nhs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.utility.Utility;

public class ScenarioTwo extends Utility {


    public ScenarioTwo() {
        PageFactory.initElements(driver, this);
    }

    //What is your date of birth?---Day

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-day']")
    WebElement  dayOfBirthDate2;


    //What is your date of birth?---Month
    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-month']")
    WebElement  monthOfBirthDate2;

    // //What is your date of birth?---year

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-year']")
    WebElement    yearOfBirthYear2;

    // Next Button Birth Date
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement    clickNextBirthDate2;

    //Do You live with your Partner---No

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement    clickOnNoForLiveWithPartner;

    //Do you claim any benefits or tax credits?----No

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement    clickOnNoFortaxCredit;


    //Do you have an injury or illness caused by serving in the armed forces?

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement    clickOnNoForInjury;

    //Next Button-----After Injury or Illness
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement    clickOnNextAfterInjury;

    //Do you live permanently in a care home?

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement    clickOnNoForCareHome;


    //Next Button---Care Home
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement   nextButtonCareHome;

   // Do you have more than £16,000 in savings, investments or property?

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement   selectNoForSaving;

    //Next Button---savings
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement   clickOnNextAfterSavings;

    //Result for 1956 birth year
    @CacheLookup
    @FindBy(xpath = "//h1[@id='result-heading']")
    WebElement   resultForHelp2;



    //What is your date of birth?---day
    public void enterDayOfBirthday(){
        sendTextToElement(dayOfBirthDate2,"18");
    }
    // What is your date of birth?---month
    public void enterMonthOfBirth(){
        sendTextToElement(monthOfBirthDate2,"01");
    }
    //What is your date of birth?---year
    public void enterYearOfBirth(){
        sendTextToElement(yearOfBirthYear2,"1956");
    }
    //Next Button Birth Date
    public void clickOnNextButtonBirthDate(){
        clickOnElement(clickNextBirthDate2);
    }
    //Do You live with your Partner---No
    public void setClickOnNoForLiveWithPartner(){
        clickOnElement(clickOnNoForLiveWithPartner);
    }
    //Do you claim any benefits or tax credits?----No
    public void setClickOnNoForTaxCredit(){
        clickOnElement(clickOnNoFortaxCredit);
    }
    //Do you have an injury or illness caused by serving in the armed forces?
    public void setClickOnNoForInjury(){
        clickOnElement(clickOnNoForInjury);
    }

     //Next Button-----After Injury or Illness
    public void setClickOnNextAfterInjury(){
        clickOnElement(clickOnNextAfterInjury);
    }
   //Do you live permanently in a care home?
    public void setClickOnNoForCareHome(){
        clickOnElement(clickOnNoForCareHome);
    }
    //Next Button After Care Home
    public void setClickOnNextAfterCareHome(){
        clickOnElement(nextButtonCareHome);
    }
    //Do you have more than £16,000 in savings, investments or property?
    public void setSelectNoForSaving(){
        clickOnElement(selectNoForSaving);
    }

    //Next Button ----for saving
    public void setClickOnNextAfterSavings(){
        clickOnElement(clickOnNextAfterSavings);
    }
    //Result Heading
    public String resultForHelp2(){
        String actual = getTextFromElement(resultForHelp2);
        System.out.println(getTextFromElement(resultForHelp2));
        return actual;

    }

}
