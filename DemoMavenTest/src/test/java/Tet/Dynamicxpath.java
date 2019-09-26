package Tet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {

	public static void main(String[] args) {
		//Google search using dynamic xpath
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\driver\\" + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("test");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> linkList = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
		for (int i = 0; i <= linkList.size(); i++) {
			System.out.println("Size of the sugested list is:" + linkList.get(i).getText());
			if (linkList.get(i).getText().contains("testbook")) {
				linkList.get(i).click();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Title of the page after selecting the search value" + driver.getTitle());
	}

}
