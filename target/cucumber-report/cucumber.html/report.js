$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/features/walestest.feature");
formatter.feature({
  "line": 3,
  "name": "Nhs help costs test",
  "description": "\r\nAs a user I want to check if I  get help from Nhs or not",
  "id": "nhs-help-costs-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "duration": 2799330300,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "I am on start page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I click on accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on start  now button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select wales as my live in country",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select yes radio button for question is your gp practice in scotland or wales",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on next button after selecting gp practice question",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select wales as my dental practice",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on next button after dental practice question",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iClickOnAcceptCookies()"
});
formatter.result({
  "duration": 137194800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnStartNowButton()"
});
formatter.result({
  "duration": 287780700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectWalesAsMyLiveInCountry()"
});
formatter.result({
  "duration": 62633000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 283446900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectYesRadioButtonForQuestionIsYourGpPracticeInScotlandOrWales()"
});
formatter.result({
  "duration": 56764500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterSelectingGpPracticeQuestion()"
});
formatter.result({
  "duration": 267820200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectWalesAsMyDentalPractice()"
});
formatter.result({
  "duration": 50127800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterDentalPracticeQuestion()"
});
formatter.result({
  "duration": 268161400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "As a User I want to check if I get help with nhs costs for age 18 over",
  "description": "",
  "id": "nhs-help-costs-test;as-a-user-i-want-to-check-if-i-get-help-with-nhs-costs-for-age-18-over",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I enter \"18\" birth day in birthdate field",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I enter \"01\" as birth month in birthdate field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter \"1985\" as my birth year in birthdate field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click next button on radio button after birth date field",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on yes radio button for do you live with your partner question",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click on next button after partner question",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on yes radio button for tax credit and benefits question",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on next button after tax credit question",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on yes radio button for you and your partner get paid universal credit",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on next buttton after paid universal credit question",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I select yes radio button as a part of the universal credit",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on next button after part of the universal credit question",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I select yes radio button for getting paid £935 or less on last universal credit",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click  on next button after getting paid £935",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I see the result",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterBirthDayInBirthdateField(String)"
});
formatter.result({
  "duration": 84909300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterAsBirthMonthInBirthdateField(String)"
});
formatter.result({
  "duration": 54425700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1985",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterAsMyBirthYearInBirthdateField(String)"
});
formatter.result({
  "duration": 47378800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickYesOnRadioButtonAfterBirthDateField()"
});
formatter.result({
  "duration": 319213900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnYesRadioButtonforDoYouLiveWithYourPartnerQuestion()"
});
formatter.result({
  "duration": 52435400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterPartnerQuestion()"
});
formatter.result({
  "duration": 283250000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnYesRadioButtonForTaxCreditAndBenefitsQuestion()"
});
formatter.result({
  "duration": 40122100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterTaxCreditQuestion()"
});
formatter.result({
  "duration": 280974800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnYesRadioButtonForYouAndYourPartnerGetPaidUniversalCredit()"
});
formatter.result({
  "duration": 54842800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButttonAfterPaidUniversalCreditQuestion()"
});
formatter.result({
  "duration": 264599500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectYesRadioButtonAsAPartOfTheUniversalCredit()"
});
formatter.result({
  "duration": 48459500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterPartOfTheUniversalCreditQuestion()"
});
formatter.result({
  "duration": 299993000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "935",
      "offset": 44
    }
  ],
  "location": "MyStepdefs.iSelectYesRadioButtonForGettingPaid£OrLessOnLastUniversalCredit(int)"
});
formatter.result({
  "duration": 55811300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "935",
      "offset": 44
    }
  ],
  "location": "MyStepdefs.iClickOnNextButtonAfterGettingPaid£(int)"
});
formatter.result({
  "duration": 279273000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSeeTheResult()"
});
formatter.result({
  "duration": 30994400,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c... help with NHS costs[?]\u003e but was:\u003c... help with NHS costs[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat uk.nhs.steps.MyStepdefs.iSeeTheResult(MyStepdefs.java:139)\r\n\tat ✽.Then I see the result(src/test/java/resources/features/walestest.feature:38)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 787883900,
  "status": "passed"
});
formatter.before({
  "duration": 2137442900,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "I am on start page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I click on accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on start  now button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select wales as my live in country",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select yes radio button for question is your gp practice in scotland or wales",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on next button after selecting gp practice question",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select wales as my dental practice",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on next button after dental practice question",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iClickOnAcceptCookies()"
});
formatter.result({
  "duration": 56224500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnStartNowButton()"
});
formatter.result({
  "duration": 381758200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectWalesAsMyLiveInCountry()"
});
formatter.result({
  "duration": 68073300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 534712500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectYesRadioButtonForQuestionIsYourGpPracticeInScotlandOrWales()"
});
formatter.result({
  "duration": 59377200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterSelectingGpPracticeQuestion()"
});
formatter.result({
  "duration": 284559800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectWalesAsMyDentalPractice()"
});
formatter.result({
  "duration": 45637800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterDentalPracticeQuestion()"
});
formatter.result({
  "duration": 301783300,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "As a User I want to check if I get help with nhs costs for age over 65",
  "description": "",
  "id": "nhs-help-costs-test;as-a-user-i-want-to-check-if-i-get-help-with-nhs-costs-for-age-over-65",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "I enter \"18\" birth day in birthdate field",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "I enter \"01\" as birth month in birthdate field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I enter \"1956\" as my birth year in birthdate field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I click next button on radio button after birth date field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I select no radio button for do you live with your partner question",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I click on next button after partner question",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I select no radio button for tax credit and benefits question",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I click on next button after tax credit question",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I select no for injury and illness caused by serving in the armed forces",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I click on next button after injury and illness question",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I select no for do you live permanently in care home question",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I click on next button after living in care home questions",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I select no for savings investment or property question",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I click on next button after saving investment or property question",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I see the result you get help with nhs",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterBirthDayInBirthdateField(String)"
});
formatter.result({
  "duration": 70979900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterAsBirthMonthInBirthdateField(String)"
});
formatter.result({
  "duration": 47592900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1956",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterAsMyBirthYearInBirthdateField(String)"
});
formatter.result({
  "duration": 48338400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickYesOnRadioButtonAfterBirthDateField()"
});
formatter.result({
  "duration": 286804400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectNoRadioButtonForDoYouLiveWithYourPartnerQuestion()"
});
formatter.result({
  "duration": 55118300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterPartnerQuestion()"
});
formatter.result({
  "duration": 248703200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectNoRadioButtonForTaxCreditAndBenefitsQuestion()"
});
formatter.result({
  "duration": 49839900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterTaxCreditQuestion()"
});
formatter.result({
  "duration": 277751500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectNoForInjuryAndIllnessCausedByServingInTheArmedForces()"
});
formatter.result({
  "duration": 45721400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterInjuryAndIllnessQuestion()"
});
formatter.result({
  "duration": 262592300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectNoForDoYouLivePermanentlyInCareHomeQuestion()"
});
formatter.result({
  "duration": 47557200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterLivingInCareHomeQuestions()"
});
formatter.result({
  "duration": 365786900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectNoForSavingsInvestmentOrPropertyQuestion()"
});
formatter.result({
  "duration": 54968400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterSavingInvestmentOrPropertyQuestion()"
});
formatter.result({
  "duration": 297818500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSeeTheResultYouGetHelpWithNhs()"
});
formatter.result({
  "duration": 32166100,
  "status": "passed"
});
formatter.after({
  "duration": 605672700,
  "status": "passed"
});
formatter.before({
  "duration": 1512558200,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "I am on start page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I click on accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on start  now button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select wales as my live in country",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select yes radio button for question is your gp practice in scotland or wales",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on next button after selecting gp practice question",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select wales as my dental practice",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on next button after dental practice question",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iClickOnAcceptCookies()"
});
formatter.result({
  "duration": 60692200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnStartNowButton()"
});
formatter.result({
  "duration": 333125600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectWalesAsMyLiveInCountry()"
});
formatter.result({
  "duration": 66665000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 303991100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectYesRadioButtonForQuestionIsYourGpPracticeInScotlandOrWales()"
});
formatter.result({
  "duration": 55742200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterSelectingGpPracticeQuestion()"
});
formatter.result({
  "duration": 286237700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectWalesAsMyDentalPractice()"
});
formatter.result({
  "duration": 42525400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButtonAfterDentalPracticeQuestion()"
});
formatter.result({
  "duration": 284511000,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "As a User I want to check if I get help with nhs costs for age under 18",
  "description": "",
  "id": "nhs-help-costs-test;as-a-user-i-want-to-check-if-i-get-help-with-nhs-costs-for-age-under-18",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 60,
  "name": "I enter \"18\" birth day in birthdate field",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "I enter \"01\" as birth month in birthdate field",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I enter \"2015\" as my birth year in birthdate field",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "I click next button on radio button after birth date field",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "I see the result you get help with nhs for under age",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterBirthDayInBirthdateField(String)"
});
formatter.result({
  "duration": 70488400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterAsBirthMonthInBirthdateField(String)"
});
formatter.result({
  "duration": 57044300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2015",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterAsMyBirthYearInBirthdateField(String)"
});
formatter.result({
  "duration": 48879000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickYesOnRadioButtonAfterBirthDateField()"
});
formatter.result({
  "duration": 303423700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSeeTheResultYouGetHelpWithNhsForUnderAge()"
});
formatter.result({
  "duration": 45175900,
  "status": "passed"
});
formatter.after({
  "duration": 634643400,
  "status": "passed"
});
});