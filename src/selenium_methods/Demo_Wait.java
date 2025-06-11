package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Wait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.actitime.com/abc5/login.do");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("sujeet.soundale11@gmail.com");
		
		driver.findElement(By.name("pwd")).sendKeys("Sujeet@123");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(4000);
		// thread.sleep is java wait . it is used to pause the execution of test script for fixed amount of time.
		
		driver.findElement(By.id("logoutLink")).click();
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
