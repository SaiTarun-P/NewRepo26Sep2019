package Tet;

import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;
//import com.selenium.utils.HtmlLogs;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class Actionsclass {

	
	@Test
	public void Actiondemo() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\driver\\" + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.hotstar.com/");
		driver.get("https://www.amazon.com");

		driver.manage().window().maximize();
		
		driver.switchTo().frame("Test");
		
		// Actions class
		
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		// move cursor over a webelement
		a.moveToElement(move).build().perform();
		
		//click in a search text box
		WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(searchTextBox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//a.click(driver.findElement(By.className("nav-input"))).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		a.doubleClick(searchTextBox).build().perform();
		//String textSelected = searchTextBox.getText();
		//System.out.println(textSelected);
		 

		
	}
	
	@Test
	public void doNotRun(){
		System.out.println("Do not run test case is running.");
	}

}
