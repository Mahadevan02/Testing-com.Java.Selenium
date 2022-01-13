package com.Java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenWebPage {

	public static void main(String[] args) {
		//1. Open Browser
		//2. Google home page
		
		/*WebDriver -Browser, which is an Interface
		 * ChromeDriver, GeckoDriver, IEDriver
		 * JDK - Collections - Set, List,
		 * JDK - Selenium JAR files
		 * Selenium WebDriver - Implementing Classes
		 * Key -unique, Value -duplicate
		 */
		
		//System.setProperty("BrowserName", "Location")
		
		System.setProperty("webdriver.chrome.driver", "L:\\PrgrmngLang\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Dynamic Binding
		
		//driver.close();
		//driver.quit();
		
		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "L:\\PrgrmngLang\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		 * WebDriver driver=new FirefoxDriver(); //Dynamic Binding
		 */
		driver.get("https://www.google.com");

		//enter a search term
		//click the wikipedia link
		
		driver.findElement(By.name("q")).sendKeys("Wikipedia"+Keys.ENTER);
		driver.findElement(By.partialLinkText("Wiki")).click();
		
	}

}
