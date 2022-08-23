package uk.nhs.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.nhs.pages.ScenarioOne;
import uk.nhs.pages.ScenarioThree;
import uk.nhs.pages.ScenarioTwo;

public class MyStepdefs {
    @When("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
        new ScenarioOne().setAcceptCookies();
    }

    @And("^I click on start  now button$")
    public void iClickOnStartNowButton() {
        new ScenarioOne().setClickOnStartButton();
    }

    @And("^I select wales as my live in country$")
    public void iSelectWalesAsMyLiveInCountry() {
        new ScenarioOne().selectRadioWalesButton();
    }

    @And("^I click on next button$")
    public void iClickOnNextButton() {
        new ScenarioOne().clickOnNextButtonAfterCountry();
    }

    @And("^I select yes radio button for question is your gp practice in scotland or wales$")
    public void iSelectYesRadioButtonForQuestionIsYourGpPracticeInScotlandOrWales() {
        new ScenarioOne().selectGpPracticeRadio();
    }

    @And("^I click on next button after selecting gp practice question$")
    public void iClickOnNextButtonAfterSelectingGpPracticeQuestion() {
        new ScenarioOne().selectGpPracticeRadioNextbutton();
    }

    @And("^I select wales as my dental practice$")
    public void iSelectWalesAsMyDentalPractice() {
        new ScenarioOne().selectDentalPracticeCountry();
    }

    @And("^I click on next button after dental practice question$")
    public void iClickOnNextButtonAfterDentalPracticeQuestion() {
        new ScenarioOne().clickOnDentalPracticeNextButton();
    }

    @When("^I enter \"([^\"]*)\" birth day in birthdate field$")
    public void iEnterBirthDayInBirthdateField(String date) {
        new ScenarioOne().enterDayOfBirthday(date);

    }

    @And("^I enter \"([^\"]*)\" as birth month in birthdate field$")
    public void iEnterAsBirthMonthInBirthdateField(String month) {
        new ScenarioOne().enterMonthOfBirth(month);

    }

    @And("^I enter \"([^\"]*)\" as my birth year in birthdate field$")
    public void iEnterAsMyBirthYearInBirthdateField(String year) {
        new ScenarioOne().enterYearOfBirth(year);

    }

    @And("^I click next button on radio button after birth date field$")
    public void iClickYesOnRadioButtonAfterBirthDateField() {
        new ScenarioOne().clcikOnNextButtonBirthDate();
    }

    @And("^I click on yes radio button for do you live with your partner question$")
    public void iClickOnYesRadioButtonforDoYouLiveWithYourPartnerQuestion() {
        new ScenarioOne().setClickOnYesForLiveWithPartner();
    }

    @And("^I click on next button after partner question$")
    public void iClickOnNextButtonAfterPartnerQuestion() {
        new ScenarioOne().setClickOnNextButtonAfterLiveWithPartner();
    }

    @And("^I click on yes radio button for tax credit and benefits question$")
    public void iClickOnYesRadioButtonForTaxCreditAndBenefitsQuestion() {
        new ScenarioOne().setClickOnYesRadioButtonTaxCredit();
    }

    @And("^I click on next button after tax credit question$")
    public void iClickOnNextButtonAfterTaxCreditQuestion() {
        new ScenarioOne().setClickYesOnTaxCredit();
    }

    @And("^I click on yes radio button for you and your partner get paid universal credit$")
    public void iClickOnYesRadioButtonForYouAndYourPartnerGetPaidUniversalCredit() {
        new ScenarioOne().doYouGetUniversalCredit();
    }

    @And("^I click on next buttton after paid universal credit question$")
    public void iClickOnNextButttonAfterPaidUniversalCreditQuestion() {
        new ScenarioOne().setClickOnNextButtonUniversalCredit();
    }

    @And("^I select yes radio button as a part of the universal credit$")
    public void iSelectYesRadioButtonAsAPartOfTheUniversalCredit() {
        new ScenarioOne().selectYesOnJointUnivrsalCredit();
    }

    @And("^I click on next button after part of the universal credit question$")
    public void iClickOnNextButtonAfterPartOfTheUniversalCreditQuestion() {
        new ScenarioOne().clickNextButtonOnJointUnivrsalCredit();
    }

    @And("^I select yes radio button for getting paid £(\\d+) or less on last universal credit$")
    public void iSelectYesRadioButtonForGettingPaid£OrLessOnLastUniversalCredit(int arg0) {
        new ScenarioOne().setSelectYesForCombinedPay();

    }

    @And("^I click  on next button after getting paid £(\\d+)$")
    public void iClickOnNextButtonAfterGettingPaid£(int arg0) {
        new ScenarioOne().clickOnNextButtonAfterCombinedPay();
    }

//    @Then("^I see the result page and see the \"([^\"]*)\"$")
//    public void iSeeTheResultPageAndSeeThe(String message) {
//        Assert.assertEquals(message,new ScenarioOne().setResultYougetHelp());
//    }



    @Then("^I see the result$")
    public void iSeeTheResult() {

       // Assert.assertT(new ScenarioOne().setResultYougetHelp());
        String expected ="Based on what you've told us\n" +
                "You get help with NHS costs";
        Assert.assertEquals(expected,new ScenarioOne().setResultYougetHelp());
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    @And("^I select no radio button for do you live with your partner question$")
    public void iSelectNoRadioButtonForDoYouLiveWithYourPartnerQuestion() {
        new ScenarioTwo().setClickOnNoForLiveWithPartner();
    }

    @And("^I select no radio button for tax credit and benefits question$")
    public void iSelectNoRadioButtonForTaxCreditAndBenefitsQuestion() {
        new ScenarioTwo().setClickOnNoForTaxCredit();   }

    @And("^I select no for injury and illness caused by serving in the armed forces$")
    public void iSelectNoForInjuryAndIllnessCausedByServingInTheArmedForces() {
        new ScenarioTwo().setClickOnNoForInjury();
    }

    @And("^I click on next button after injury and illness question$")
    public void iClickOnNextButtonAfterInjuryAndIllnessQuestion() {
        new ScenarioTwo().setClickOnNextAfterInjury();
    }

    @And("^I select no for do you live permanently in care home question$")
    public void iSelectNoForDoYouLivePermanentlyInCareHomeQuestion() {
        new ScenarioTwo().setClickOnNoForCareHome();
    }

    @And("^I click on next button after living in care home questions$")
    public void iClickOnNextButtonAfterLivingInCareHomeQuestions() {
        new ScenarioTwo().setClickOnNextAfterCareHome();
    }

    @And("^I select no for savings investment or property question$")
    public void iSelectNoForSavingsInvestmentOrPropertyQuestion() {
        new ScenarioTwo().setSelectNoForSaving();
    }

    @And("^I click on next button after saving investment or property question$")
    public void iClickOnNextButtonAfterSavingInvestmentOrPropertyQuestion() {
        new ScenarioTwo().setClickOnNextAfterSavings();
    }

    @Then("^I see the result you get help with nhs$")
    public void iSeeTheResultYouGetHelpWithNhs() {
       String expectedresult ="Based on what you've told us\n" +
               "You get help with NHS costs";
        Assert.assertEquals(expectedresult,new ScenarioTwo().resultForHelp2());

    }


    ///////////////////////////////////////////

    @Then("^I see the result you get help with nhs for under age$")
    public void iSeeTheResultYouGetHelpWithNhsForUnderAge() {
        String expectedresult1 ="Based on what you've told us\n" +
                "You get help with NHS costs";
        Assert.assertEquals(expectedresult1,new ScenarioThree().setResultScenario3());

    }


}
