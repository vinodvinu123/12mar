package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box {
	public static  void checkBox(WebDriver driver){
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]/span")).click();
		
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	
		checkBox(driver);
	

	}

}
