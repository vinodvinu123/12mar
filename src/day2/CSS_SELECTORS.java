package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_SELECTORS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		int imgs=driver.findElements(By.tagName("img")).size();
		System.out.println(imgs);
		Thread.sleep(2000);
	//	driver.findElement(By.cssSelector("input#firstName")).sendKeys("dinesh");
		driver.findElement(By.cssSelector("input[placeholder=\"Enter First Name\"]")).sendKeys("vinod");
      //  driver.findElement(By.name("lName")).sendKeys("test");  

  }
}