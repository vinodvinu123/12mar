package day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Set<String>windows=driver.getWindowHandles();
		
		List<String>ids=new ArrayList(windows);
		String parent=ids.get(0);
		String child=ids.get(1);
		
		System.out.println(parent);
		System.out.println(child);
		
		Thread.sleep(3000);
		
		//switch to main window
		String parenturl=driver.switchTo().window(parent).getCurrentUrl();
		System.out.println(parenturl);
		
		driver.findElement(By.xpath("//a[@aria-expanded=\"true\"]")).click();
		Set<String>windows1=driver.getWindowHandles();
		
     	   
        
	}

}
