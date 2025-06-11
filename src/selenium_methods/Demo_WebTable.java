package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		driver.manage().window().maximize();
		
		// 1. How many rows in table
        int rows=driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")).size();
        System.out.println("This is row count of table = "+rows);
        // 2. How many colums in a table
        
		int colm=driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th")).size();
		System.out.println("This is Column count of table "+colm);
		// 3. Retrive date form row / col 
		
	   String value=driver.findElement(By.xpath("//table[@id='table1']//tr[1]/td[1]")).getText();
	   System.out.println("This is first value : "+value);
	   
	   // 4. 
	   for(int r = 1 ; r<=rows ; r++) {
		 
	   for(int c = 1 ; c<=colm ; c++) {
	 String data=driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]/td["+c+"]")).getText();
	 System.out.print(data+"    ");   
	   }
	  System.out.println(); 
	   }
	   driver.close();
	 
	}

}
