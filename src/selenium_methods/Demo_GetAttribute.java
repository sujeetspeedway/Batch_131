package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_GetAttribute {

	public static void main(String[] args) {
		
		   WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			driver.manage().window().maximize();
			
			WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
			String hrefValue=gmailLink.getAttribute("href");
			
			System.out.println(hrefValue);
			driver.close();
		
	}

}
