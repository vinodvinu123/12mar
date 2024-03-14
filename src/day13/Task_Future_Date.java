package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Future_Date {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		int day =5;
		String month="May 2025";
		
        driver.findElement(By.id("second_date_picker")).click();
		
		while(true) {
			String currentmonth=driver.findElement(By.className("ui-datepicker-title")).getText();
			
			if(currentmonth.equals(month)) {
				break;
			}else {
				driver.findElement(By.className("ui-datepicker-next")).click();
				
			}
		}
		driver.findElement(By.xpath("//a[text()="+day+"]")).click();
	}

}
