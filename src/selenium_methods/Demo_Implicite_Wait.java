package selenium_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Implicite_Wait {

	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.actitime.com/abc5/login.do");
		
		driver.manage().window().maximize();
		
		// 1. Implicit Wait----> Global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("sujeet.soundale11@gmail.com");
		
		driver.findElement(By.name("pwd")).sendKeys("Sujeet@123");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.id("logoutLink")).click();
		
		driver.close();
		

	}

}
