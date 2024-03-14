package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Alerts {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
	//simple alert
	  driver.findElement(By.id("alertButton")).click();	
	  Thread.sleep(3000);
	  driver.findElement(By.id("timerAlertButton")).click();
	  System.out.println("simple alert");
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000); 
	   
	  //confirmation alert
	  driver.findElement(By.id("confirmButton")).click();
	  Thread.sleep(3000);
	  String confmsg=driver.switchTo().alert().getText();
	  Thread.sleep(3000);
	  System.out.println("confmsg");
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
//	  driver.switchTo().alert().dismiss();
	  Thread.sleep(3000); 
	  
	  //prompt alert
	  driver.findElement(By.id("promtButton")).click();
	  Thread.sleep(3000);
	  String promptmsg=driver.switchTo().alert().getText();
	  Thread.sleep(3000);
	  System.out.println("promptmsg");
	  Thread.sleep(3000);
	  driver.switchTo().alert().sendKeys("vinod");
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
//	  driver.switchTo().alert().dismiss();

	
	}

}
