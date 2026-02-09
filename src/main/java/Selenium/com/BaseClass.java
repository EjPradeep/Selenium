package Selenium.com;

import java.awt.Window;
import java.security.PublicKey;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
private void Launch() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.youtube.com/watch?v=ovImXEsKz1M&list=PL699Xf-_ilW6vI9FHmePi1TvKyzYATgXi&index=18");
	}
	
	
 public static void main(String[] args) {
	 

}
}
