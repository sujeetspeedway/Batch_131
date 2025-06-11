package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Multi_Select {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/sample.html");
		
		driver.manage().window().maximize();
		
		WebElement MultiSelect=driver.findElement(By.name("city-multiple"));
		
		Select dd = new Select(MultiSelect);
		Thread.sleep(3000);
		dd.selectByIndex(0);
		Thread.sleep(3000);
		dd.selectByValue("2");
		Thread.sleep(3000);
		dd.selectByVisibleText("Kolkatta");
		Thread.sleep(3000);
		dd.deselectAll();
		
		
		

	}

}
