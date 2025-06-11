package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Radio {

	public static void main(String[] args) throws InterruptedException {
	
		// Open Browser
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.krninformatix.com/sample");
				
				driver.manage().window().maximize();
				
	     boolean raiodBtn= driver.findElement(By.id("male")).isSelected();	
	     System.out.println(raiodBtn);
	     
	     Thread.sleep(2000);
	     driver.findElement(By.id("male")).click();
	     
	     boolean raiodBtn1= driver.findElement(By.id("male")).isSelected();	
	     System.out.println(raiodBtn1);
	     
	     
	     driver.findElement(By.id("male")).click();
	     boolean raiodBtn2= driver.findElement(By.id("male")).isSelected();	
	     System.out.println(raiodBtn2);
	     
	     
	     Thread.sleep(2000);
	     driver.close();

	}

}
