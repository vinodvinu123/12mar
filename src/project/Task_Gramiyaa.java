package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task_Gramiyaa {

	public static void main(String[] args)  {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://gramiyaa.com/");
		driver.manage().window().maximize();
	
		Actions act = new Actions(driver);
		WebElement webl= driver.findElement(By.xpath("//details[@id=\"Details-HeaderMenu-1\"]"));
	    WebElement webl1= driver.findElement(By.xpath("//div[@id=\"MegaMenu-Content-1\"]//li[1]"));
		act.moveToElement(webl).moveToElement(webl1).click().perform();
		
		WebElement webl2=driver.findElement(By.xpath("//div[@id='MegaMenu-Content-1']//li[2]"));
		act.moveToElement(webl).moveToElement(webl2).click().perform();
		
		WebElement webl3=driver.findElement(By.xpath("//div[@id='MegaMenu-Content-1']//li[3]"));
		act.moveToElement(webl).moveToElement(webl3).click().perform();

		WebElement webl4=driver.findElement(By.xpath("//div[@id='MegaMenu-Content-1']//li[4]"));
		act.moveToElement(webl).moveToElement(webl4).click().perform();
		
		 Select dropdown =new Select(driver.findElement(By.xpath("//select[@name=\"ids-2213585518721\"]")));
		 dropdown.selectByIndex(3);
		

	}

}
