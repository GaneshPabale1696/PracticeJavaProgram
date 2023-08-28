package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);

		driver.get("https://freecrm.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		 WebElement signup=driver.findElement(By.xpath("//a[normalize-space()='Sign Up']"));
		 signup.click();
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		WebElement UserName=driver.findElement(By.xpath("//input[@placeholder='Email']"));
		UserName.sendKeys("pavanoltraining");
		
		WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("xyz");
		
		driver.navigate().refresh();
		
		try {
		UserName.sendKeys("pavanoltraining");
		}
		catch(StaleElementReferenceException e)
		{
			UserName=driver.findElement(By.xpath("//input[@placeholder='Email']"));
			UserName.sendKeys("pavanoltraining");
		}
		
		
	}

}
