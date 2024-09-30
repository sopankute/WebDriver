package webdriverdemoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
//		 Launch Browser - (Chrome)
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
//		Open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
//		Validate title "Your Store"
		String act_title = driver.getTitle();
		
		if(act_title.equals("Your Store"))
			System.out.println("FirstDemo.main() | Test Passed");
		else 
			System.out.println("FirstDemo.main() | Test Failed...." );
		
		Thread.sleep(3000);
//		Close Browser
//		driver.close();
		driver.quit();
		
	}
}
