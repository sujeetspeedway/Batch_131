package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Close_Quit {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		//driver.close();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
