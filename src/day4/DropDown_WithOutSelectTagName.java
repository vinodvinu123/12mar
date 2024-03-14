package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_WithOutSelectTagName {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        
        List<WebElement>options=(List<WebElement>) driver.findElements(By.xpath("//select[@id='course']//option"));
       for(WebElement values:options) {
    	   if(values.getText().equals("Java")) {
    		   values.click();
    		   break;
    	   }
}
	}

}
