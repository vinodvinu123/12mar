package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		
		    WebElement frm1=driver.findElement(By.xpath("//iframe[@src='frames1.html']"));
	        driver.switchTo().frame(frm1);
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("first frame");
	        
	        driver.switchTo().frame(0);
	        driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	        
	        driver.switchTo().defaultContent();
	        
	        WebElement frm2=driver.findElement(By.xpath("//iframe[@src='dropdown-frame.html']"));
	        driver.switchTo().frame(frm2);
	        Select drpdwn=new Select(driver.findElement(By.xpath("//select[@id=\"animals\"]")));
	        drpdwn.selectByVisibleText("Avatar");
	 //     drpdwn.selectByIndex(2);
	 //     drpdwn.selectByValue("Big Baby Cat");
	       
	}

}
