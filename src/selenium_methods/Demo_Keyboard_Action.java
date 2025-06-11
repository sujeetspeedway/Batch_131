package selenium_methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Keyboard_Action {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/KeyPresses/?");
		
		driver.manage().window().maximize();
		
		// Keyboard
		// Action -----> Interface
		// Actions ---> class
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_LEFT).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_RIGHT).perform();
		act.sendKeys(Keys.TAB).perform();
	
	}

}
