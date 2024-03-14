package day6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task1Relative {	

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Frames.html");
			driver.manage().window().maximize();
	        
			 
	        WebElement frm1 = driver.findElement(By.id("singleframe"));
	        driver.switchTo().frame(frm1);
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("singleframe");
			Thread.sleep(3000);
			
	        driver.switchTo().defaultContent();	    
	       
	    	WebElement frm2=driver.findElement(By.xpath("//div[@id='Multiple']/iframe")); 
	    	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	    	driver.switchTo().frame(frm2);
	    	driver.switchTo().frame(0);
	    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iframe with in an Iframe");
	    	    
	    
		}
}
