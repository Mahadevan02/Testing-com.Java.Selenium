package com.Java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "L:\\PrgrmngLang\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		WebElement java=driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		java.click();
		WebElement vb=driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input"));
		vb.click();
		WebElement c=driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input"));
		c.click();
		WebElement cpp=driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input"));
		cpp.click();
		
		WebElement selenium=driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean seleniumSelected=selenium.isSelected();
		System.out.println(seleniumSelected);
		
		WebElement firstElement=driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		WebElement secondElement=driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(firstElement.isSelected())
			firstElement.click();
		else
			secondElement.click();
		
	}

}
