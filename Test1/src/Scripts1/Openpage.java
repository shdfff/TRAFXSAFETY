package Scripts1;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Openpage {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrikant.dodamani\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		 try 
		{
	            
	            driver.get("https://calibrate.stage.trafxsafe.com/");
	            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cookies.data")))
	            {
	                Set<Cookie> cookies = (Set<Cookie>) ois.readObject();
	                for (Cookie cookie : cookies)
	                {
	                    driver.manage().addCookie(cookie);
	                }
	            }
	            driver.navigate().refresh();
	            driver.get("https://calibrate.stage.trafxsafe.com/en/sites/1604/cameras");
	            driver.findElement(By.xpath("//*[text()='Add a camera view']")).click();
	            driver.findElement(By.id("camera_name")).sendKeys("Cam01");
	            WebElement toggleButton = driver.findElement(By.id("is_drone"));
	            toggleButton.click();
	            WebElement bm=driver.findElement(By.id("camera_privacy_level"));
	            Select Ns=new Select(bm);
	            Thread.sleep(2000);
	            Ns.selectByValue("0");
	            //WebElement dropdownElement = driver.findElement(By.id("react-select-4-input"));
	            //Select dropdown = new Select(dropdownElement);
	            WebElement bm1=driver.findElement(By.id("camera_movement_set"));
	            Select Ns1=new Select(bm1);
	            Thread.sleep(2000);
	            Ns1.selectByValue("1670");
	            driver.findElement(By.xpath("//i[contains(@class, 'fas fa-upload')]")).click();
	            Thread.sleep(2000);
	           
	            driver.findElement(By.xpath("//input[contains(@type, 'file')]")).sendKeys("C:\\Users\\shrikant.dodamani\\Downloads\\2022-09-40T10-00-00_xmfksfkmsf.m4v");
	            Thread.sleep(2000);
	            
	            driver.findElement(By.xpath("//*[text()='Capture Screenshot']")).click();
	            Thread.sleep(2000);
	            js.executeScript("window.scrollBy(0, -250)");
	            driver.findElement(By.xpath("//*[text()='Done']")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[text()='Create']")).click();
                Thread.sleep(2000);
                WebElement canvas1 = driver.findElement(By.id("canvas_image")); 
                canvas1.click();
                Thread.sleep(2000);
                driver.findElement(By.id("location_submit_button")).click();
                Thread.sleep(2000);
                WebElement canvas = driver.findElement(By.id("canvas_image")); 
                canvas.click();
                Actions actions = new Actions(driver);
                actions.moveToElement(canvas, 100, 0).click().build().perform();
                actions.dragAndDropBy(canvas, 200, 0).click().build().perform();
                actions.dragAndDropBy(canvas, 200, 0).click().build().perform();
                actions.moveToElement(canvas, 100, 0).click().build().perform();
                actions.moveToElement(canvas, 100, 0).click().build().perform();

                Thread.sleep(2000);
                actions.sendKeys(Keys.ENTER).perform();
                
                
                driver.findElement(By.id("submit_undistortion")).click();
                Thread.sleep(60000);
                
	            
	        } 
		 catch (Exception e)
		 {
	            e.printStackTrace();
	        } 
		 finally 
		 {
	           
	        }
		 
	}

}
