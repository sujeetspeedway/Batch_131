package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Frame2 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("moneyiframe");
		
		String BseIndex=driver.findElement(By.id("bseindex")).getText();
		System.out.println(BseIndex);
		
	  driver.close();
		

	}

}
