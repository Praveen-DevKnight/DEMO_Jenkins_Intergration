package demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ShopperStack2 {

	@Test
void Sample2() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
options.addArguments("--headless");
options.addArguments("--disable-infobars");
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--remote-allow-origins=*");
options.addArguments("--disable-gpu");
options.addArguments("--window-size=1920,1080");

WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Praveen");
		driver.findElement(By.id("Email")).sendKeys("Praveen@gmail.com");
	}

}
