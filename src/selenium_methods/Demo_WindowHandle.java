package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WindowHandle {

	public static void main(String[] args) {
	
		System.out.println("This is Beginning");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/Select/");
		
		driver.manage().window().maximize();
		
		// 1. GetWindowHandle
		String windowID=driver.getWindowHandle();
		
		System.out.println(windowID);
		
		driver.close();
		//FA6F674FE3F8F3ACED86667E67A86973
		//44864BA06D99C3FD8295A9B5619AFEF8
		//8A11EB759C9DFEDED1D3B8CBB59B55A3
		

	}

}
