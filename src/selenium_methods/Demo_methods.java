package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_methods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// 1. Get
		driver.get("https://agilekey.co.in/");
		
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).click();
		
		// 2. Get Current Url
		
		String expectedUrl="https://agilekey.co.in/about-us-3/";
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		

	}

}
