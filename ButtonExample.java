package com.Java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "L:\\PrgrmngLang\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		//driver.findElement(By.id("home")).click();
		WebElement getPosition=driver.findElement(By.id("position"));
		Point xyPoint=getPosition.getLocation();
		int xPosition=xyPoint.getX();
		int yPosition=xyPoint.getY();
		System.out.println(xPosition);
		System.out.println(yPosition);
		
		WebElement getColor=driver.findElement(By.id("color"));
		String color=getColor.getCssValue("background-color");
		System.out.println(color);
		
		WebElement size=driver.findElement(By.id("size"));
		/*
		 * Dimension size=getSize.getSize(); 
		 * int height=size.height; 
		 * int width=size.width;
		 */
		int height=size.getSize().getHeight();
		int width=size.getSize().getWidth();
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
		

	}

}
