package com.Java.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "L:\\PrgrmngLang\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement alertBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmtButton=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmtButton.click();
		Alert confirmAlert=driver.switchTo().alert();
		confirmAlert.dismiss(); //canceling the pop-up
		
		WebElement promptButton=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptButton.click();
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("Duckling");
		promptAlert.accept();
		
		WebElement lineBreak=driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
		lineBreak.click();
		Alert lineBreakAlert=driver.switchTo().alert();
		System.out.println(lineBreakAlert.getText());
		lineBreakAlert.accept();
		
		WebElement sweetAlert=driver.findElement(By.xpath("//*[@id=\"btn\"]"));
		sweetAlert.click();
		Thread.sleep(1000);
		WebElement happyCode=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button"));
		happyCode.click();
	}

}
