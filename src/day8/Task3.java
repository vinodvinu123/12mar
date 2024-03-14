package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://practice.expandtesting.com/context-menu");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement rhtclk=driver.findElement(By.id("hot-spot"));//right click action
		act.contextClick(rhtclk).perform();
		

	}

}
