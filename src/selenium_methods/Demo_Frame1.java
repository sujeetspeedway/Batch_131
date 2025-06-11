package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Frame1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing/frames/frames.html");
		driver.manage().window().maximize();
		
		
		// 1. Switch to frame by using Index
		driver.switchTo().frame(1);
		driver.findElement(By.name("name1")).sendKeys("speedway");
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"frame3.html\"]"));
	    driver.switchTo().frame(frame3);
		driver.findElement(By.name("check")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		driver.findElement(By.name("rep")).click();

	}

}
