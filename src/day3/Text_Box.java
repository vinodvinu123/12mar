package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Box {
	public static  void textBox(WebDriver driver) {
		driver.findElement(By.id("userName")).sendKeys("vinod");
		driver.findElement(By.id("userEmail")).sendKeys("vinodvinu1043@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("bangalore");
	    driver.findElement(By.xpath("//textarea[@ID='permanentAddress']")).sendKeys("punganur");
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		textBox(driver);

	}

}
