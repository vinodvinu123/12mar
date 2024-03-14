package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com");
		driver.navigate().to("https://www.flipkart.com/");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	
	}

}
