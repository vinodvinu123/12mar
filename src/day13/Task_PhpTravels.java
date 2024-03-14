package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_PhpTravels {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net");
		driver.manage().window().maximize();
		int day =28;
		
		driver.findElement(By.xpath("//input[@id=\"departure\"]")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+day+"]")).click();

	}

}
