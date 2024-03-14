package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_WithSelectTagName {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        
        
        Select drpdwn=new Select(driver.findElement(By.xpath("//select[@id='course']")));
        
        drpdwn.selectByVisibleText("Python");
        drpdwn.selectByIndex(1);
        drpdwn.selectByValue("js");
	}

}
