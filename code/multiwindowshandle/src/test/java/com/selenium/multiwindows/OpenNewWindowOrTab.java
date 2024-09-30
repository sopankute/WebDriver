package com.selenium.multiwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindowOrTab {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("ta1")).sendKeys("Good Morning........");
		
//		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.name("search")).sendKeys("Hp");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
