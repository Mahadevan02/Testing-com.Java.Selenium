package com.Java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxEditExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "L:\\PrgrmngLang\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("test@gmail.com");
		
		WebElement appendBox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		//appendBox.clear();
		appendBox.sendKeys(" Text");
		
		WebElement getTextBoxValue=driver.findElement(By.name("username"));
		String value=getTextBoxValue.getAttribute("value");
		System.out.println("Value: "+value);
		
		WebElement clearBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement disabledBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		
		 boolean enabled=disabledBox.isEnabled();
		 System.out.println("Enabled: "+enabled);
			/*
			 * String disabled=disabledBox.getAttribute("disabled");
			 * System.out.println("Disabled: "+disabled);
			 */
	}

}
