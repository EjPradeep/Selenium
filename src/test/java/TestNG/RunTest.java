package TestNG;

import org.testng.annotations.Test;

import Selenium.com.BaseClass;

public class RunTest extends BaseClass{

	@Test
	public void Test1() {
		
		System.out.println("Hey");
	}
	@Test
	private void Test2() {
	driver.get("https://www.youtube.com/watch?v=ovImXEsKz1M&list=PL699Xf-_ilW6vI9FHmePi1TvKyzYATgXi&index=18");
	}
	public static void main(String[] args) {

	}

}
