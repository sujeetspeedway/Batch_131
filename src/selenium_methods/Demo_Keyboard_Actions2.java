package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Keyboard_Actions2 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		WebElement Fname = driver.findElement(By.id("input-firstname"));
		
		Fname.sendKeys("speedwaytech");
		
		WebElement Lname = driver.findElement(By.id("input-lastname"));
		
		// Create Object of Actions
		
		Actions act = new Actions(driver);
		
		// CLTR+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		// CLTR+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// --- TAB
		act.sendKeys(Keys.TAB).perform();
		
		// CLTR + V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if(Fname.getAttribute("value").equals(Lname.getAttribute("value"))) {
			
			System.out.println("Both words are same Test Case Pass");
			
		}else {
			System.out.println("Both words are not same Test Case Fail");
		}

	}

}
