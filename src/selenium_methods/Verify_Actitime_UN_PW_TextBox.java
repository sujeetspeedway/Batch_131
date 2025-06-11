package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Actitime_UN_PW_TextBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.actitime.com/abc/login.do");
		
		WebElement unTB=driver.findElement(By.id("username"));
		
		int username_height=unTB.getSize().getHeight();
		int ussername_width=unTB.getSize().getWidth();
		
		System.out.println(username_height);
		System.out.println(ussername_width);
		
		WebElement pwdTB = driver.findElement(By.name("pwd"));
		int pass_height=pwdTB.getSize().getHeight();
		int pass_width=pwdTB.getSize().getWidth();
		
		System.out.println(pass_height);
		System.out.println(pass_width);
		
		if(username_height==pass_height && ussername_width==pass_width) {
			System.out.println("test case pass");
		}else {
			System.out.println("Test Case Fail");
		}
		driver.close();

	}

}
