package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gramiyaa {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://gramiyaa.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
