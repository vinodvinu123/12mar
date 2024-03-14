package day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		WebDriver driver= new ChromeDriver();
driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		//upload file using sendkeys method	//driver.findElement(By.className("upload_txt")).sendKeys("C:\\Users\\ADMIN\\Desktop\\TestData.xlsx");	
		//upload file usng robot class
		WebElement uplod=driver.findElement(By.className("upload_txt"));	
		Actions act=new Actions(driver);
	act.moveToElement(uplod).click().perform();
		Robot RB=new Robot();
		Thread.sleep(3000);
		//copy the file from local folder
		StringSelection ss=new StringSelection("C:\\Users\\ADMIN\\Documents");//select the file	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//copy the file
		//press ctrl+v
		RB.keyPress(KeyEvent.VK_CONTROL);
		RB.keyPress(KeyEvent.VK_V);
		//release the key
		RB.keyRelease(KeyEvent.VK_CONTROL);
		RB.keyRelease(KeyEvent.VK_V);
		//press enter key to upload
		RB.keyPress(KeyEvent.VK_ENTER);
		//release the enter key
		RB.keyRelease(KeyEvent.VK_ENTER);	
	}

}
