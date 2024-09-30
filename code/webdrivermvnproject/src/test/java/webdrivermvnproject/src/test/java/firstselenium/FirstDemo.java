package webdrivermvnproject.src.test.java.firstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {

	public static void main(String[] args) throws InterruptedException {
		
//		 Launch Browser - (Chrome)
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
//		maximize size of page
//		driver.manage().window().maximize();
		
//		Open URL https://demo.opencart.com/
		driver.get("https://tutorialsninja.com/demo/");
		
//		Validate title "Your Store"
		String act_title = driver.getTitle();
		
		if(act_title.equals("Your Store"))
			System.out.println("FirstDemo.main() | Test Passed");
		else 
			System.out.println("FirstDemo.main() | Test Failed...." );
		
		Thread.sleep(2000);
		
//		return web element
		WebElement element = driver.findElement(By.id("search"));
		
		element.sendKeys("HP");
		driver.findElement(By.className("input-group-btn")).click();
		Thread.sleep(2000);
		
//		Close Browser
//		driver.close();
		driver.quit();
		
	}
}
