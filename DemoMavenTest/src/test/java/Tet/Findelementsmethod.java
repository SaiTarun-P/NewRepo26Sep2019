package Tet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Findelementsmethod {

	@Test
	public void testDemo() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\driver\\" + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.hotstar.com/");
		driver.get("https://www.amazon.com");
		List <WebElement> listLink = driver.findElements(By.tagName("a"));
		
		System.out.println(listLink.size());
		
		for(int i=0;i<listLink.size();i++){
			System.out.println(listLink.get(i).getText());
		}
	}
}
