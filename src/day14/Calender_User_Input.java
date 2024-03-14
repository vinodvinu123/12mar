package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_User_Input {
	public static void main(String[] args) throws Throwable {
		 WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();	
		WebElement ele=driver.findElement(By.id("sixth_date_picker"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",ele);
		String targetdate="32/Mar/2024";
		//22/03/2024, 22/March/2024, 22/Mar/2024
		//dd/MM/yyyy, dd/MMM/yyyy, dd/MMM/yyyy
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/MMM/yyyy");
		try {
			dateformat.setLenient(false);//this validate the date
	Date formatteddate=dateformat.parse(targetdate);
			calendar.setTime(formatteddate);
			int targetday=calendar.get(calendar.DAY_OF_MONTH);
			int targetMonth=calendar.get(Calendar.MONTH);
			int targetYear=calendar.get(Calendar.YEAR);
			driver.findElement(By.id("first_date_picker")).click();
			String currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMMyyyy").parse(currentdate));
			int currentMonth=calendar.get(calendar.MONTH);
			int currentYear=calendar.get(calendar.YEAR);
			//select future date
			//March>feb || 2024>2024
			//March>March || 2024>2024
			while(targetMonth>currentMonth||targetYear>currentYear) {
				driver.findElement(By.className("ui-datepicker-next")).click();
				 currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();
				calendar.setTime(new SimpleDateFormat("MMMyyyy").parse(currentdate));
				 currentMonth=calendar.get(calendar.MONTH);
				 currentYear=calendar.get(calendar.YEAR);		 	
			}
			driver.findElement(By.xpath("//a[text()="+targetday+"]")).click();
		}catch(ParseException e) {
			throw new Exception("The targetdate is Invalid Please check");
		}
	}

}
