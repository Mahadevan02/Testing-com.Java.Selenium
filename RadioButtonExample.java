package com.Java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "L:\\PrgrmngLang\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		
		WebElement unchecked=driver.findElement(By.
				xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
		WebElement checked=driver.findElement(By.
				xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		boolean status1=unchecked.isSelected();
		boolean status2=checked.isSelected();
		System.out.println("status1 : "+status1);
		System.out.println("status2 : "+status2);
		
		WebElement below20=driver.findElement(By.name("age"));
		below20.click();
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]")).click();
		 * Thread.sleep(1000); driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]")).click();
		 * Thread.sleep(1000); driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]")).click();
		 * //driver.close(); 
		 * driver.quit();
		 */
	}

}
