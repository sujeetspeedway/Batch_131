package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Drag_Drop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/Drag-n-Drop/");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("box3"));
		
		WebElement target = driver.findElement(By.id("box103"));
		
		WebElement source2 = driver.findElement(By.id("box6"));
		
		WebElement target2 = driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
		act.dragAndDrop(source2, target2).perform();
		

	}

}
