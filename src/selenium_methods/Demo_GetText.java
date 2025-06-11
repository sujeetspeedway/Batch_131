package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_GetText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.actitime.com/abc/login.do");
		
		driver.manage().window().maximize();
		
		String getText=driver.findElement(By.xpath("//td[text()='Please identify yourself']")).getText();
		System.out.println(getText);
		
		
		String getTitle=driver.getTitle();
		
		System.out.println(getTitle);
	
		driver.close();
		

	}

}
