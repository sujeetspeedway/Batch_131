package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Frame3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/Frames/");
		
		driver.switchTo().frame("frame1");// parent frame
		driver.switchTo().frame("frame3"); // child frame
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).sendKeys("speedwaytech");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		WebElement dd = driver.findElement(By.id("animals"));
		
		
		Select dropdown = new Select(dd);
		dropdown.selectByIndex(3);
		
		
		

	}

}
