package commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumCommands {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
//		driver.manage().window().maximize();
		
//		Thread.sleep(2000);
		
//		WebElement
//		WebElement textfield = driver.findElement(By.id("textbox1"));
//		
//		textfield.clear();
//		textfield.sendKeys("Sopan Kute");
//
//		Thread.sleep(2000);
//
//		textfield.clear();
//		textfield.sendKeys("selenium 456");
		
//		getText()
//		WebElement text = driver.findElement(By.cssSelector("#pah"));
//		String str = text.getText();
//		System.out.println("SeleniumCommands.main() | text.getText() : " +str );
		
//		getTitle()
//		System.out.println("SeleniumCommands.main() | driver.getTitle(): "+driver.getTitle());
//		Thread.sleep(2000);
		
//		getCurrentUrl()
//		System.out.println("SeleniumCommands.main() | driver.getCurrentUrl() : "+driver.getCurrentUrl());
		
//		getAttribute()
		WebElement searchAttr = driver.findElement(By.cssSelector("input[title='search'][value='Search']"));
	    System.out.println("SeleniumCommands.main() | searchAttr.getAttribute(\"value\") : "+searchAttr.getAttribute("value") );
	    System.out.println("SeleniumCommands.main() | searchAttr.getAttribute(\"class\") : "+searchAttr.getAttribute("class") );
	    System.out.println("SeleniumCommands.main() | searchAttr.getAttribute(\"title\") : "+searchAttr.getAttribute("title") );
		
		
		
		driver.quit();
	
	}
}
