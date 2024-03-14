package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_Dropdown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();
        
        WebElement frm1=driver.findElement(By.xpath("//iframe[@id=\"frm1\"]"));
        driver.switchTo().frame(frm1);
        
        Select drpdwn1=new Select(driver.findElement(By.xpath("//select[@id=\"selectnav1\"]")));
        drpdwn1.selectByVisibleText("- Java");
        
       
	}

}
