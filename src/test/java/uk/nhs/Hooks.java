package uk.nhs;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.nhs.propertyreader.PropertyReader;
import uk.nhs.utility.Utility;

import java.io.IOException;


public class Hooks extends Utility {


    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Deena");
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
          String screenShotPath =  Utility.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
