package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Practice {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement dblclik=driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
        act.doubleClick(dblclik).perform();//doubleclick action
		
		WebElement rhtclk=driver.findElement(By.id("rightClickBtn"));//right click action
		act.contextClick(rhtclk).perform();
		
		WebElement clck=driver.findElement(By.xpath("//button[text()='Click Me']"));// single click action
		act.moveToElement(clck).click().perform();
	}

}
