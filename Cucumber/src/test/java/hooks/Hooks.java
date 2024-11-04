package hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	 WebDriver driver;
	 Properties p;
	 @Before
	    public void setup() throws IOException
	    {
	    	driver=BaseClass.initilizeBrowser();
	    		
	    	p=BaseClass.getProperties();
	        //driver.navigate().to("https://www.amazon.in/"); 
	    	//driver.navigate().to("https://magento.softwaretestingboard.com/");
	    	driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	    	driver.manage().window().maximize();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
    
    @After
    public void tearDown() {
        		
       driver.quit();
       
    }
    

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        
    	// this is for cucumber junit report
        if(scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        	            
        }
      
    }
    
      
    
   
}
