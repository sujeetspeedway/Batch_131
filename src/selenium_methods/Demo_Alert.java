package selenium_methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Alert {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(2000);
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println("This is Simple Alert : "+simpleAlert.getText());
		simpleAlert.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert confirmationAlert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("This is confirmation Alert : "+confirmationAlert.getText());
		confirmationAlert.dismiss();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println("This is Promt Alert : "+promptAlert.getText());
		promptAlert.sendKeys("sujeet");
		Thread.sleep(2000);
		promptAlert.accept();

	}

}
