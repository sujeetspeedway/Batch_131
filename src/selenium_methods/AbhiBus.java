package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		
		driver.manage().window().maximize();
		
		
		// find element
		
		WebElement sourceDropdown=driver.findElement(By.xpath("//input[@placeholder='Leaving From']"));

		sourceDropdown.sendKeys("Latur");
		
		WebElement targetDropdown = driver.findElement(By.xpath("//input[@placeholder='Going To']"));
		targetDropdown.sendKeys("Nashik");
		
		// Select Date
		
		WebElement dateinput=driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']"));
		dateinput.click();
		
		driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
		
		//driver.close();
        
		
		
	}

}
