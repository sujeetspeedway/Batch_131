package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo_Css_Value {

	public static void main(String[] args) {
	
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement searchBtn=driver.findElement(By.name("btnK"));
		
		String btnColor=searchBtn.getCssValue("color");
		System.out.println("This is search Button color = "+btnColor);
		
		String Hex =Color.fromString(btnColor).asHex();
		System.out.println("This is Hex value of search button color = "+Hex);
		
		driver.close();
		

	}

}
