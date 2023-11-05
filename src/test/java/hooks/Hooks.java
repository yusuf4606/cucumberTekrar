package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp() throws Exception {
        System.out.println("hooks calisti");
    }
    @Before("@b")
    public void setUp1() throws Exception {
        System.out.println("hooks2 calisti");
    }
    @Before("@c")
    public void setUp3() throws Exception {
        System.out.println("hooks3 calisti");
    }
    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/jpeg/png","scenario_"+scenario.getName());
            Driver.closeDriver();
        }
    }

}
