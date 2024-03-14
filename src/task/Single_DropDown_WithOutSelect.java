package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_DropDown_WithOutSelect {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.manage().window().maximize();
        
  /*    List<WebElement>options=(List<WebElement>) driver.findElements(By.xpath("//select[@id=\"first\"]//option"));
        for(WebElement values:options) {
     	   if(values.getText().equals("Iphone")) {
     		   values.click();
     		   break;
     	   }
	}*/
        List<WebElement>options=(List<WebElement>) driver.findElements(By.xpath("//select[@id=\"animals\"]//option"));
        for(WebElement values:options) {
     	   if(values.getText().equals("Baby Cat")) {
     		   values.click();
     		   break;
     	   }
	}
	}
}
