package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//switch to frame1
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.name("mytext1")).sendKeys("this is frame1");
		//switch to main window
		        driver.switchTo().defaultContent();
		//switch to frame2
		        WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		        driver.switchTo().frame(frm2);
		        driver.findElement(By.name("mytext2")).sendKeys("this is frame2");
		//switch to main window
		        driver.switchTo().defaultContent();
	    //switch to frame3       
		        WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		        driver.switchTo().frame(frm3);
		        driver.findElement(By.name("mytext3")).sendKeys("this is frame3");
		//when a frame is inscribed in another frame //switch the inside the frame to parent frame        
		        driver.switchTo().frame(0);
		        driver.findElement(By.xpath("//a[text()='Sign in to Google']")).click();
		//switch to main window
				driver.switchTo().defaultContent();
	    //switch to frame4		
				WebElement frm4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
				driver.switchTo().frame(frm4);
				driver.findElement(By.name("mytext4")).sendKeys("this is frame4");
		
	}

}
