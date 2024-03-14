package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroolings_Practice {
	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
	     driver.get("https://www.hyrtutorials.com/");
		 driver.manage().window().maximize();
		
		 WebElement ele=driver.findElement(By.xpath("//span[text()='Buy me a coffee']"));		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("window.scrollBy(0,300)", "");//scroll by pixel size		
	     js.executeScript("arguments[0].scrollIntoView();",ele);//scroll by element location
         js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scroll to bottom of page	
	}

}
