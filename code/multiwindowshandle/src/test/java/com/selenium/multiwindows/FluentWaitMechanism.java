package com.selenium.multiwindows;

import java.time.Duration;
//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitMechanism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.className("dropbtn")).click();

//		In Java to overcome the waiting problems
//		Thread.sleep(10);

		// Waiting 30 seconds for an element to be present on the page, 
		// checking for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class); // till 30 seconds ignore the NoSuchElementException

		WebElement gmailElement = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
				return driver.findElement(By.linkText("Gmail"));
			}
		});

//		driver.findElement(By.linkText("Gmail")).click();

		gmailElement.click();

		driver.quit();

	}
}
