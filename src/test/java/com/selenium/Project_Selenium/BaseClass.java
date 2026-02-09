package com.selenium.Project_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

			public static WebDriver driver;
			
			public static WebDriver browserlaunch(String browser) {
				
				if(browser.equalsIgnoreCase("chrome")) {
					driver = new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("edge")) {
					driver=new EdgeDriver();
				}
				else {
					System.out.println("Invalid Browser");
				}
			return driver;
}
			
			public static void urlname(String url) {
				driver.get("url");
			}
			public static void maxwindow() {
				driver.manage().window().maximize();
			}
			
			
			public static void implicitwait(int value) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));
			}
			
			public static void findbyname(String element) {
				driver.findElement(By.name(element));
			}
			
			public static void findbyid(String element) {
				driver.findElement(By.id(element));
			}
			public static void findbyclassname(String element) {
				driver.findElement(By.className(element));
			}
			
			public static void findbyxpath(String element) {
				driver.findElement(By.xpath(element));
			}
			
			public static void findbypartiallink(String element) {
				driver.findElement(By.partialLinkText(element));
			}
			
			public static void findbylinktext(String element) {
				driver.findElement(By.linkText(element));
			}
			public static void inputvalue(WebElement element,String val)
			{
				element.sendKeys(val);
			}

			public static void clicking(WebElement element) {
				element.click();
			}
			
			
			
			
}
