package Scripts1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalibrationWorkFlow {

public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrikant.dodamani\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://calibrate.stage.trafxsafe.com/en/users/sign_in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_email")).sendKeys("shrikant.dodamani@transoftsolutions.com");
       
	   // WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	    //Enter pwd     
	    driver.findElement(By.id("user_password")).sendKeys("Shreekupa@24");
	  
	    // Click the sign in butto
	    driver.findElement(By.name("commit")).click();
	    
	    
	   driver.findElement(By.xpath("//i[contains(@class, 'fas fa-plus')]")).click(); 
	   Thread.sleep(20000);
	   js.executeScript("window.scrollBy(0, 500)");
	   WebElement addSite = new WebDriverWait(driver, 30).until(
	           ExpectedConditions.elementToBeClickable(By.id("addSiteButton")));
	   addSite.click();
	 
	   List<WebElement> reGion=driver.findElements(By.id("new-site-region"));
       reGion.get(90).click();
       
       WebElement bm=driver.findElement(By.id("new-site-product"));
       Select Ns=new Select(bm);
       Thread.sleep(2000);
       Ns.selectByValue("0");
       
       driver.findElement(By.id("new-site-street1")).sendKeys("NEWYC11 otree4t164d2");
       driver.findElement(By.id("new-site-street2")).sendKeys("NEW209 Sree4tc616621");
       
       WebElement bm1=driver.findElement(By.id("new-structure-type"));
       Select ns1=new Select(bm1);
       Thread.sleep(2000);
       ns1.selectByValue("0");
       
       driver.findElement(By.id("new-posted-speed-limit")).sendKeys("6");
       
       WebElement bm2=driver.findElement(By.id("new-conflict-threshold"));
       Select ns2=new Select(bm2);
       Thread.sleep(2000);
       ns2.selectByValue("1");
       
       WebElement bm3=driver.findElement(By.id("new-road-type-1"));
       Select ns3=new Select(bm3);
       Thread.sleep(2000);
       ns3.selectByValue("1");
       
       WebElement bm4=driver.findElement(By.id("new-road-type-2"));
       Select ns4=new Select(bm4);
       Thread.sleep(2000);
       ns4.selectByValue("2");
       
       WebElement bm5=driver.findElement(By.id("new-land-use-type"));
       Select ns5=new Select(bm5);
       Thread.sleep(2000);
       ns5.selectByValue("1");
       
       WebElement bm6=driver.findElement(By.id("new-urban-density"));
       Select ns6=new Select(bm6);
       Thread.sleep(2000);
       ns6.selectByValue("1");
       
       WebElement bm7=driver.findElement(By.id("new-school"));
       Select ns7=new Select(bm7);
       Thread.sleep(2000);
       ns7.selectByValue("1");
       
       WebElement bm8=driver.findElement(By.id("alcohol_select"));
       Select ns8=new Select(bm8);
       Thread.sleep(2000);
       ns8.selectByValue("1");
       
       WebElement bm9=driver.findElement(By.id("new-urban-density"));
       Select ns9=new Select(bm9);
       Thread.sleep(2000);
       ns9.selectByValue("1");
       
       driver.findElement(By.id("bus_stop")).sendKeys("6");
       
       js.executeScript("window.scrollBy(0, 500)");
      
       WebElement sign_in= driver.findElement(By.xpath("//a[@id='create_site']"));
       sign_in.click();
       Thread.sleep(2000);
       
	   WebElement allSuggestions=driver.findElement(By.id("search-input"));
	   allSuggestions.sendKeys("128th street");
	   Thread.sleep(3000);
	   allSuggestions.sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(3000);
	   allSuggestions.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	
	   driver.findElement(By.id("new")).click();
	   Thread.sleep(5000);
	   
	   WebElement allSuggestions1=driver.findElement(By.id("search-input"));
	   allSuggestions1.sendKeys("127th street");
	   Thread.sleep(3000);
	   allSuggestions1.sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(3000);
	   allSuggestions1.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	
	   driver.findElement(By.id("new")).click();
	 Thread.sleep(5000); 
	   
	  driver.findElement(By.id("done_btn")).click();
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0, 500)");
	   Thread.sleep(3000);
	   
	   driver.findElement(By.id("nav-mvmt-ctrl-1")).click();
	   Thread.sleep(3000);
	   
	   WebElement addMovement1 = new WebDriverWait(driver, 30).until(
      ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-react-action-value, 'AddNewMovement')]")));
	   addMovement1.click();
	   
	   Thread.sleep(3000);
	   WebElement elementToHover = driver.findElement(By.id("path1303-64-4"));
      Actions actions = new Actions(driver);
      actions.moveToElement(elementToHover).perform();
      
      WebElement optionToClick = driver.findElement(By.id("path1303-64-4"));
      optionToClick.click();
      Thread.sleep(3000);
      
      js.executeScript("window.scrollBy(0, 250)");
      driver.findElement(By.id("add_tempMvmt_button")).click();
      Thread.sleep(4000);
      
     // driver.navigate().back()
     // driver.navigate().refresh()
      
     driver.findElement(By.xpath("//*[text()='Close']")).click();
	  
}
	}
