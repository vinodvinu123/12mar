package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns_Calender {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		int day=10;
		 driver.findElement(By.id("third_date_picker")).click();
		 Select drpdwn=new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]")));  
	  // drpdwn.selectByVisibleText("Apr");
	  // drpdwn.selectByIndex(8);
	     drpdwn.selectByValue("1");
	     
	     Select drpdwn1=new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]")));  
	   //drpdwn1.selectByVisibleText("2020");
	   //drpdwn1.selectByIndex(10);
	     drpdwn1.selectByValue("2018");
	     driver.findElement(By.xpath("//a[text()="+day+"]")).click();
	}

}
