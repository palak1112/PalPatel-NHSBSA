package uk.nhs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.utility.Utility;

public class ScenarioOne extends Utility {



    public ScenarioOne() {
        PageFactory.initElements(driver, this);
    }


    //Accept cookies
    @CacheLookup
    @FindBy(xpath = "//button[@id='nhsuk-cookie-banner__link_accept_analytics']")
    WebElement acceptCookies;

    //Start Now Button
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement clickOnStartButton;


    //Which country do you live in?
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement radioWales;

    // Next Button -----Which country
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement  nextButtonCountry;

   // Is your GP practice in Scotland or Wales?
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement    selectYesButton;

    // Next Button Gp practice

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement  clickOnNextGpPractice;

   //Which country is your dental practice in?
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement  dentalPracticeOption;

    //Next Button ----Dental Practice

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement  clickOnNextDentalPractice;

    //What is your date of birth?---Day

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-day']")
    WebElement  dayOfBirthDate;


    //What is your date of birth?---Month
    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-month']")
    WebElement  monthOfBirthDate;

    // //What is your date of birth?---year

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-year']")
    WebElement    yearOfBirthYear;

    // Next Button Birth Date
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement    clickNextBirthDate;

    //Do You live with your Partner---Yes

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement    clickOnYesForLiveWithPartner;

    //Next Button Living with partner

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement    clickOnNextButtonForLiveWithPartner;

    //Do your partner claim any tax credits or any benefits
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement    clickYesOnTaxCredit;

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement    clickOnNextButtonTaxCredit;

    //Do you or your partner get paid Universal Credit?
    @CacheLookup
    @FindBy(xpath = "//input[@id='yes-universal']")
    WebElement    clickYesReceiveUniversalCredit;

    //Next Button----Universal Credit
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement    clickOnNextButtonUniversalCredit;

    //As part of your joint Universal Credit, do you have any of these?
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement     clickOnYesJointUniversalCredit ;

    //Next Button
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement    clickOnNextButtonJointUniversal;

    //Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement    selectYesForCombinedPay;

    //Next Button---- Combined Pay

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement    clickOnNextButtonCombinedPay;

    //Because you and your partner get Universal Credit and your combined take-home pay was less than £935:
    @CacheLookup
    @FindBy(xpath= "//body/main[@id='content']/div[3]/div[1]/div[1]/h2[1]")
   // @FindBy(xpath = "//h2[@class='heading-large']")
    WebElement    result;


    //Accept cookies
    public void setAcceptCookies(){
        clickOnElement(acceptCookies);
    }

    // Start Now Button
    public void setClickOnStartButton(){
        clickOnElement(clickOnStartButton);
    }
    //select wales
    public void selectRadioWalesButton(){
        clickOnElement(radioWales);
    }
    //Click on next
    public void clickOnNextButtonAfterCountry(){
        clickOnElement(nextButtonCountry);
    }
    //Is your GP practice in Scotland or Wales?
    public void selectGpPracticeRadio(){
        clickOnElement(selectYesButton);
    }
    // // Next Button Gp practice
    public void selectGpPracticeRadioNextbutton(){
        clickOnElement(clickOnNextGpPractice);
    }
    //Which country is your dental practice in?
    public void selectDentalPracticeCountry(){
        clickOnElement(dentalPracticeOption);
    }
    // Next Button ----Dental Practice
    public void clickOnDentalPracticeNextButton(){
        clickOnElement(clickOnNextDentalPractice);
    }
    //What is your date of birth?---day
    public void enterDayOfBirthday(String date){
        sendTextToElement(dayOfBirthDate,date);
    }
    // What is your date of birth?---month
    public void enterMonthOfBirth(String month){
        sendTextToElement(monthOfBirthDate,month);
    }
    //What is your date of birth?---year
    public void enterYearOfBirth(String year){
        sendTextToElement(yearOfBirthYear,year);
    }
    //Next BUtton Birth Date
    public void clcikOnNextButtonBirthDate(){
        clickOnElement(clickNextBirthDate);
    }
    //Do You live with your Partner---Yes
    public void setClickOnYesForLiveWithPartner(){
        clickOnElement(clickOnYesForLiveWithPartner);
    }
    //Click On Next Button
    public void setClickOnNextButtonAfterLiveWithPartner(){
        clickOnElement( clickOnNextButtonForLiveWithPartner);
    }
    //Do your partner claim any tax credits or any benefits
    public void setClickOnYesRadioButtonTaxCredit(){
        clickOnElement(clickYesOnTaxCredit);
    }
    //Click On Next Button---Tax and Benefits
    public void setClickYesOnTaxCredit(){
        clickOnElement(clickOnNextButtonTaxCredit);
    }
    //Do you or your partner get paid Universal Credit?
    public void doYouGetUniversalCredit(){
        clickOnElement(clickYesReceiveUniversalCredit);
    }

    //Next Button ----Universal Credit options
    public void setClickOnNextButtonUniversalCredit(){
       clickOnElement(clickOnNextButtonUniversalCredit);
    }
    //As part of your joint Universal Credit, do you have any of these?
    public void selectYesOnJointUnivrsalCredit(){
        clickOnElement(clickOnYesJointUniversalCredit);
    }
    //Next Button----Joint Universal
    public void clickNextButtonOnJointUnivrsalCredit(){
        clickOnElement(clickOnNextButtonJointUniversal);
    }
    //Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?
    public void  setSelectYesForCombinedPay(){
        clickOnElement(selectYesForCombinedPay);
    }
    //Next Button-----Combined Pay
    public void  clickOnNextButtonAfterCombinedPay(){
        clickOnElement(clickOnNextButtonCombinedPay);
    }
    // result
    public  String setResultYougetHelp(){
        String actual = getTextFromElement(result);
        System.out.println(getTextFromElement(result));
       return actual;

    }
}
