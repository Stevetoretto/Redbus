package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void BrowserLaunch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public static void departureField() throws InterruptedException {
		Thread.sleep(3);
		WebElement departure = driver.findElement(By.xpath("//input[@id='src']"));
		departure.sendKeys("Chennai");
	}

}
