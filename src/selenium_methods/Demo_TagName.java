package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_TagName {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		String TagName=driver.findElement(By.name("q")).getTagName();
		System.out.println("This is HTML Tag Name : "+TagName);
		driver.close();

	}

}
