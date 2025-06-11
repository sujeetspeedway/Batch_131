package selenium_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_Explicit_Wait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// Explicit Wait
		WebDriverWait wa = new WebDriverWait(driver,Duration.ofSeconds(20));
			
		driver.get("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		
		driver.findElement(By.className("dropbtn")).click();
		
		WebElement flipkart = wa.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
         flipkart.click();

	}

}
