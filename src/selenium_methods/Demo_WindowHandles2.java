package selenium_methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WindowHandles2 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://speedwaytech.co.in/testing-02/Select/");
			
			driver.manage().window().maximize();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Browser Windows']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.id("tabButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("windowButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("messageWindowButton")).click();
			
			Set<String>windowIds=driver.getWindowHandles();
			
			List<String>windowIDList = new ArrayList(windowIds);
			
			String parentWID=windowIDList.get(0);
			String childWID1=windowIDList.get(1);
			String childWID2=windowIDList.get(2);
			
			
			driver.switchTo().window(parentWID);
			System.out.println("This is Parent window Title : "+driver.getTitle());
			driver.quit();

	}

}
