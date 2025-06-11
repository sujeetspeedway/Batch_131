package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Nevigate {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://agilekey.co.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// 1. navigate() to
		driver.navigate().to("https://www.google.com/");
		
		// 2. navigate().back
		Thread.sleep(2000);
		driver.navigate().back();
		
		// 3. navigate().forword
		Thread.sleep(2000);
		driver.navigate().forward();
		
		// 4. refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		

	}

}
