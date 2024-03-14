package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown_WithSelect {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.manage().window().maximize();
        
   /*   Select drpdwn=new Select(driver.findElement(By.xpath("//select[@id=\"first\"]")));
        drpdwn.selectByVisibleText("Google");
        drpdwn.selectByIndex(1);
        drpdwn.selectByValue("Yahoo");  */
        
        Select drpdwn=new Select(driver.findElement(By.xpath("//select[@id=\"animals\"]")));
        drpdwn.selectByVisibleText("Cat");
//      drpdwn.selectByIndex(2);
 //     drpdwn.selectByValue("Big Baby Cat");

	}

}
