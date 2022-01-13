package com.Java.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "L:\\PrgrmngLang\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropDown1=driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropDown1);
		select.selectByIndex(0);
		select.selectByValue("2");
		select.selectByVisibleText("Loadrunner");
		
		List<WebElement> listOfOptions= select.getOptions();
		int size=listOfOptions.size();
		System.out.println("Number of Elements : "+size);
		
		WebElement dropDown=driver.findElement(By.className("dropdown"));
		dropDown.sendKeys("Selenium");
		
		WebElement multiSelect=driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiSelectBox=new Select(multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		/*
		 * multiSelectBox.selectByValue("1"); 
		 * multiSelectBox.selectByValue("2");
		 */
		/*
		 * multiSelectBox.selectByVisibleText("Selenium"); 
		 * multiSelectBox.selectByVisibleText("Appium");
		 */
		
	}
}
