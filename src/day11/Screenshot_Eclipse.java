package day11;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class Screenshot_Eclipse {

	public static void main(String[] args) throws IOException {
		 WebDriver driver= new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
	//PROJECT LEVEL CREATE ONE FOLDER TO STORE THE SCRENSHOT IMAGES					
			TakesScreenshot ss=(TakesScreenshot) driver;			
			File source=ss.getScreenshotAs(OutputType.FILE);			
			String destination=System.getProperty("user.dir")+"\\screenshots\\myntra.png";		
			Files.copy(source, new File(destination)); 

	}

}
