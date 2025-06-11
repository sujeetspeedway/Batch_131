package selenium_methods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Broken_img {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		driver.manage().window().maximize();
		
		List<WebElement> imgs=driver.findElements(By.tagName("img"));
		System.out.println("Total images : "+imgs.size());
		
		// check each img url
		for(WebElement img : imgs) {
			String imageUrl=img.getAttribute("src");
			
			if(imageUrl == null || imageUrl.isEmpty()) {
				System.out.println("Image URL is Missing");
				continue;
			}
			//we need to validate the image URL response
			if(isImageBroken(imageUrl)) {
				System.out.println("Broekn Image found : "+imageUrl);
			}else {
				System.out.println("Vaild Image : "+imageUrl);
			}
		}
	driver.close();
	}
	public static boolean isImageBroken(String imageUrl) throws IOException {
		
		try {
			URL url = new URL(imageUrl);
			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			
			int responseCode=connection.getResponseCode();
			return(responseCode>=400);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
			System.out.println("This is Error in Image : "+imageUrl);
			return true;
		}
	}

}
