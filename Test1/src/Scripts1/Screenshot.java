package Scripts1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class Screenshot 
{

	WebDriver driver;
	JavascriptExecutor js;

	@BeforeMethod
	public void Openpage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrikant.dodamani\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
	}
	
	@Test
	public void OpenCalibrat() throws Exception 
	{
        driver.get("https://calibrate.stage.trafxsafe.com/en/users/sign_in");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_email")).sendKeys("shrikant.dodamani@transoftsolutions.com");
	   // WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
	    
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);   
	    driver.findElement(By.id("user_password")).sendKeys("Shreekupa@24");
	    
	    driver.findElement(By.name("commit")).click();
	    
	   driver.findElement(By.xpath("//i[contains(@class, 'fas fa-plus')]")).click();
	   driver.findElement(By.id("region-site1563-container")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("region-site1563-configure-link")).click();
	   Thread.sleep(7000);
	   js = (JavascriptExecutor) driver;
	   js.executeScript("scroll(0, 250);");
	}
	   @AfterMethod
	    public void takeScreenshot(ITestResult result) {
	        if (ITestResult.FAILURE == result.getStatus()) {
	            try {
	                TakesScreenshot ts = (TakesScreenshot) driver;
	                File source = ts.getScreenshotAs(OutputType.FILE);
	                FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
	                System.out.println("Screenshot taken");
	            } catch (Exception e) {
	                System.out.println("Exception while taking screenshot " + e.getMessage());
	            }
	        }
	    
	   
	
	}
	
	
	
	
	
	
}
