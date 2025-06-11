package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Java_Script_Exe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("persistent")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("document.getElementById('persistent').click()");
		
		
		// How to refresh web page
		Thread.sleep(2000);
		// 1. navigate
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		// 2. Action class
		Actions act = new Actions(driver);
		act.sendKeys(Keys.F5).perform();
		
		// 3. javascript exe
		Thread.sleep(2000);
		jse.executeScript("window.location.reload();");
		
		// 4. getcurrent URL
		Thread.sleep(2000);
		driver.get(driver.getCurrentUrl());
		
		// scroll webpage
		
		jse.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,0)");
		
		Thread.sleep(2000);
		
		jse.executeScript("document.body.style.zoom='200%'");
		
		Thread.sleep(2000);
		jse.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2000);
		jse.executeScript("document.body.style.zoom='50%'");
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
