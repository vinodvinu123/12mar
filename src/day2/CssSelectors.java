package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#username")).sendKeys("vinod");
		driver.findElement(By.cssSelector("input.login_input[id='password']")).sendKeys("Dinesh@7177");
		driver.findElement(By.cssSelector("input.login_button")).click();
	}

}
