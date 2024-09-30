package com.selenium.multiwindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingMechanism {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
//		Implicit wait----------------
//		this timeout applicable for all elements dynamically on web page (i.e. Global wait)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	// not recommended
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.className("dropbtn")).click();
		
//		In Java to overcome the waiting problems
//		Thread.sleep(10);
		
		
//		Explicit wait-----------------
//		Explicit wait will wait only for the specific web element here [By.linkText("Gmail")]
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
//		driver.findElement(By.linkText("Gmail")).click();
		
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		e.click();

		driver.quit();
		
	}

}
