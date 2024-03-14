package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
			driver.manage().window().maximize();
			//explicitwait declaration
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.findElement(By.xpath("//button[@id='btn1']")).click();
			//explicitwait implimentation
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Show the textboxes here:']//input[@id='txt1']")));
			driver.findElement(By.xpath("//h3[text()='Show the textboxes here:']//input[@id='txt1']")).sendKeys("explicit");	
	}

}
