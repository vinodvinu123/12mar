package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class AlertsDemo {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();

				
				driver.get("https://demoqa.com/alerts");
				driver.manage().window().maximize();
				//simple alert
				driver.findElement(By.id("alertButton")).click();
				
				//driver.findElement(By.id("timerAlertButton")).click();
			  driver.switchTo().alert().accept();
			    
			  
			    //confirmation alert
			  driver.findElement(By.id("confirmButton")).click();
			  String confmsg=driver.switchTo().alert().getText();
			  System.out.println("confmsg");
			//  driver.switchTo().alert().accept();
			  driver.switchTo().alert().dismiss();
			  
			  //prompt allert
			  driver.findElement(By.id("promtButton")).click();
			  String promptmsg=driver.switchTo().alert().getText();
			  System.out.println("promptmsg");
			  driver.switchTo().alert().sendKeys("vinod");
		 //  driver.switchTo().alert().accept();
		     driver.switchTo().alert().dismiss();
			  
	}

}
