package day6;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1Absolute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement f1=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[1]/iframe"));
		driver.switchTo().frame(f1);
	    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("single iframe");

	    Thread.sleep(5000);
	    driver.switchTo().defaultContent();
		
	    driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe")));
     	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("multi iframe");
		

	


	       


	}

}
