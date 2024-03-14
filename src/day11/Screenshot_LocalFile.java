package day11;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class Screenshot_LocalFile {

	public static void main(String[] args) throws IOException {
		 WebDriver driver= new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
//CREATE ONE LOCAL FOLDER IN LOCAL FILES TO STORE SCREENSHOT IMAGES						
			TakesScreenshot ss=(TakesScreenshot) driver;
			File source=ss.getScreenshotAs(OutputType.FILE);
			File destination=new File("D:\\pictures\\myntra.png");
			Files.copy(source, destination);   

	}

}
