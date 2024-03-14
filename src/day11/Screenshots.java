package day11;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots {
public static void main(String[] args) throws IOException {
		
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	/*	//method 1 store screenshot in project level
		//convert webdriver object to take screenshot
		TakesScreenshot ss=(TakesScreenshot) driver;
		//call getscreenshot method to take screenshot and place it in source
		File source=ss.getScreenshotAs(OutputType.FILE);
		//specify the location to store screenshot
		String destination=System.getProperty("user.dir")+"\\screenshots\\amzn1.png";
		//move screenshot from source to destination
		//FileUtils.copyFile(source,new File(destination));
		Files.copy(source, new File(destination)); */
		
		/*		//method2 store in local folder
		TakesScreenshot ss=(TakesScreenshot) driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\pictures\\amzn.png");
		Files.copy(source, destination);   */
		
		//simplify code based on method2 code
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(source, new File("D:\\pictures\\amzn1.jpeg"));      
		
	}


}
