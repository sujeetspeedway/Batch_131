package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_FindElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		
		WebElement Ele=driver.findElement(By.xpath("//div[@class='footer content']//a"));
		
		System.out.println(Ele.getText());
		
		driver.findElement(By.linkText("Subscribe")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
