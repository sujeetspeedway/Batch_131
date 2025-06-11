package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/buttons/");
		
		driver.manage().window().maximize();
		
		// 1. Simple click
		driver.findElement(By.id("pD03d")).click();
		
		Thread.sleep(2000);
		// 2. Right click
		WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
		
		Thread.sleep(2000);
		
		WebElement doubleClik=driver.findElement(By.id("doubleClickBtn"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClick).perform(); //----> context click is nothing but right click
		
		act.doubleClick(doubleClik).perform();
	}

}
