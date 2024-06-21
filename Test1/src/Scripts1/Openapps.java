package Scripts1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openapps {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrikant.dodamani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://calibrate.stage.trafxsafe.com/en/users/sign_in");
		
		Thread.sleep(3000);
		driver1.manage().window().maximize();

		Thread.sleep(2000);
		driver1.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		driver1.navigate().refresh();
		
		Thread.sleep(2000);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.navigate().forward();
		
		Thread.sleep(2000);
		System.out.println(driver1.getCurrentUrl());
		
		Thread.sleep(2000);
		System.out.println(driver1.getTitle());
		
		driver1.close();
	}

}
