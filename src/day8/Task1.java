package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			driver.manage().window().maximize();
			
//			driver.findElement(By.xpath("//div[@rel-title=\"Photo Manager\"]"));
			
			WebElement from=driver.findElement(By.xpath("//h5[text()=\"High Tatras\"]"));
			WebElement to=driver.findElement(By.xpath("//div[@id=\"trash\" ]"));
			Actions act=new Actions(driver);
			act.dragAndDrop(from, to).perform();

	}

}
