package selenium_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_FindElements {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> Ele=driver.findElements(By.xpath("//div[@class='footer content']//a"));
		
		System.out.println(Ele.size());
		
		List<WebElement>Ele2=driver.findElements(By.linkText("Subscribe"));
		System.out.println(Ele2.size());
		
		List<WebElement>Ele3=driver.findElements(By.linkText("Search Term"));
		System.out.println("The size of element : "+Ele3.size());
		
		for(WebElement e :Ele) {
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		driver.close();
	}

}
