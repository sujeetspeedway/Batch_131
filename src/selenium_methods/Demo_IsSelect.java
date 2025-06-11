package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_IsSelect {

	public static void main(String[] args) throws InterruptedException {
	
		// Open Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.krninformatix.com/sample");
		
		driver.manage().window().maximize();
		
		boolean checkBox =driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkBox);
		
		Thread.sleep(2000);
		driver.findElement(By.id("rep")).click();
		
		boolean checkBox1 =driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkBox1);
		
		Thread.sleep(2000);
		driver.findElement(By.id("rep")).click();

		boolean checkBox2 =driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkBox2);
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		

	}

}
