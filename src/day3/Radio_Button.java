package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void radioButton(WebDriver driver) {
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]")).click();
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
	
//    	driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
	}

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		radioButton(driver);
	}

}
