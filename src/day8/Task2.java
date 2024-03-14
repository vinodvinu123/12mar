package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/selenium-click-command");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement clck=driver.findElement(By.xpath("//button[text()='Products']"));// single click action
		act.moveToElement(clck).click().perform();
	

	}

}
