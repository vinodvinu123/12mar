package day7;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException  {

        WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
//		Set<String>windows=driver.getWindowHandles();
		
		String mainwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String windowhandle:allwindowhandles) {
			if(!windowhandle.equals(mainwindow)) { 
				driver.switchTo().window(windowhandle);
			}
		}
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
        driver.findElement(By.xpath("//a[text()='Events']")).click();
        Thread.sleep(3000);
        driver.switchTo().window(mainwindow);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
        driver.findElement(By.xpath("//button[text()='click']")).click();
        Thread.sleep(3000);
    	driver.manage().window().maximize();
    	Set<String> windowhandles1=driver.getWindowHandles();
		for(String windowhandle:windowhandles1) {
			if(!windowhandle.equals(mainwindow)) { 
				driver.switchTo().window(windowhandle);
			}
		}
		 Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Documentation']")).click();
        
       }
}

	


