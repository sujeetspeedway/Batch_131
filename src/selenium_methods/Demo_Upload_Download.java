package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Upload_Download {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/upload-and-download/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("downloadButton")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\ssuje\\OneDrive\\Desktop\\AMRUTA_SANKHE_6+EXP_Software_Test_Engineer.pdf");
	}

}
