package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gramiyaa_Project {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://gramiyaa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"mg-menus\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Ghee\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Combo\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Accessory\"]")).click();
		
		
	}

}
