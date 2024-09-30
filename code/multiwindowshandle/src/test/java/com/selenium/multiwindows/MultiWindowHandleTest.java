package com.selenium.multiwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandleTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
//		driver.get("https://www.blogger.com/about/");

		WebElement textAreaField = driver.findElement(By.id("ta1"));

		textAreaField.sendKeys("Happy Independance Day");

//		parent window handle
		String parentWindowHandle = driver.getWindowHandle();

//		click to open first child pop-up window
		driver.findElement(By.linkText("Open a popup window")).click();

//		switch to first child pop-up window
		String popUpFirstChildWindow = switchToNewWindow(parentWindowHandle, driver);

		WebElement textElement = driver.findElement(By.tagName("h3"));

		String text = textElement.getText();

		System.out.println("MultiWindowHandleTest.main() | textElement.getText() : " + text);

		driver.close();
		
//		back to parent window handle
		driver.switchTo().window(parentWindowHandle);

//		click to open second child new tab window
		driver.findElement(By.linkText("Blogger")).click();

//		switch to second child new tab window
		String newTabSecondChildWindow = switchToNewWindow(parentWindowHandle, driver);

		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.cssSelector("a[class='sign-in ga-header-sign-in'] span")).click();	// Exception in thread "main" org.openqa.selenium.NoSuchElementException

		driver.switchTo().window(parentWindowHandle);
		System.out.println("MultiWindowHandleTest.main()");
		
//		driver.close();

	}

	public static String switchToNewWindow(String currentWindowHandle, WebDriver driver) {

		Set<String> allwindowHandles = driver.getWindowHandles();

		for (String windowHandle : allwindowHandles) {
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				return windowHandle;
			}
		}

		return "No new window found to switch to.";
	}

}
