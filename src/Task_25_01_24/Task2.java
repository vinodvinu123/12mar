package Task_25_01_24;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.manage().window().maximize();
		

//		driver.findElement(By.xpath("//label[@class=\"control-label\"]")).click();
//		driver.findElement(By.xpath("//input[@id=\"input-4\"]")).click();
		
		WebElement ud=driver.findElement(By.xpath("//input[@id='input-4']"));
		Actions act=new Actions(driver);
	    act.moveToElement(ud).click().perform();
	    Robot rb=new Robot();
		Thread.sleep(3000);
		//copy the file from local folder
		StringSelection ss=new StringSelection("C:\\Users\\ADMIN\\Documents");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//press ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		//release the key
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//press enter key to upload
		rb.keyPress(KeyEvent.VK_ENTER);
		
		//release the enter key
		rb.keyRelease(KeyEvent.VK_ENTER);


	}

}
