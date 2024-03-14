package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();
		
		//Click on checkbox if the country name is california
				List<WebElement>tdata=driver.findElements(By.xpath("//table[@id='customers']//td"));
				for(WebElement options:tdata) {
					String values=options.getText();
					if(values.equals("California")) {
						driver.findElement(By.xpath("//td[text()='California ']//preceding-sibling::td//input")).click();
					}
	    }
				Thread.sleep(3000);
				//click on knowmore link  if the contact name is Jeff Bezos
				List<WebElement>tbldata=driver.findElements(By.xpath("//table[@id='customers']//td"));
				for(WebElement options:tbldata) {
					String values=options.getText();
					if(values.equals("Jeff Bezos")) {
						driver.findElement(By.xpath("//td[text()='Jeff Bezos']//following-sibling::td//a")).click();
					}
	    }

     }
}
