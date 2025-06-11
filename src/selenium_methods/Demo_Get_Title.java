package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Get_Title {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://agilekey.co.in/");
		
		driver.manage().window().maximize();
		
		String getTitle=driver.getTitle();
		System.out.println(getTitle);
		
		String expectedTitle = "AgileKey";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
	
		

	}

}
