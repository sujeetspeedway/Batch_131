package selenium_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Without_Select {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/sample.html");
		
		driver.manage().window().maximize();
		
		WebElement singleSelect=driver.findElement(By.name("city"));
		
		Select dd = new Select(singleSelect);
		
		List<WebElement>city=dd.getOptions();
		
		for(WebElement c : city) {
			
			if(c.getText().equals("Kolkatta")) {
				
				c.click();
				break;
			}
			
		}
		Thread.sleep(3000);
		driver.close();
	}
}
