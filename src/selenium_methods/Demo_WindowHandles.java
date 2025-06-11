package selenium_methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WindowHandles {

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
		
		Iterator<String>IT=windowIds.iterator();
		
		String parentWId=IT.next();
		String chidWId1=IT.next();
		String chidWId2=IT.next();
		String chidWId3=IT.next();
		
		System.out.println("Parent window Id : "+parentWId);
		System.out.println("Child window Id1 : "+chidWId1);
		System.out.println("Child window Id2 : "+chidWId2);
		System.out.println("Child window Id3 : "+chidWId3);
		
		
		
		driver.quit();
	}

}
