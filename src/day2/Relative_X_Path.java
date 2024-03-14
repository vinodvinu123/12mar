package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_X_Path {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinod");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("vinu@123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
	//	driver.close();
	}

}
