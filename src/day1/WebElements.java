package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("vinod");
		driver.findElement(By.name("lName")).sendKeys("kumar");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.className("bcCheckBox")).click();
		driver.findElement(By.name("email")).sendKeys("vinodvinu1043@gmail.com");
		driver.findElement(By.id("password")).sendKeys("vinod@123");
		driver.findElement(By.id("registerbtn")).click();
		driver.findElement(By.className("bcButton")).click();
		
	

	}

}
