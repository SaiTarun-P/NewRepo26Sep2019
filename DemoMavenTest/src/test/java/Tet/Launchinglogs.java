package Tet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Launchinglogs {

	WebDriver driver;
	
	@BeforeTest
	public void InitiatingBrowser() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\driver\\" + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.hotstar.com/");
		driver.get("https://www.amazon.com");

		driver.manage().window().maximize();
		// Actions class
		
		Actions a = new Actions(driver);
		

	}
	
	@AfterTest
	public void ClosingBrowser(){
		driver.quit();
	}

	
}
/*//Polymorphism p = new Polymorphism();
int s = test();
System.out.println(s);	

public static int test(){
	return(2*3);
	
}
*/
