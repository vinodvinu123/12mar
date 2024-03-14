package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SauceDemoTask {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver =new ChromeDriver();		
		 driver.get("https://www.saucedemo.com");		
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");		
		 driver.findElement(By.xpath("//input[@id='login-button']")).click();
		 Thread.sleep(3000);
		 Select drpdwn=new Select(driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")));
		 Thread.sleep(3000);
	     drpdwn.selectByVisibleText("Price (low to high)");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-onesie\"] ")).click();
	     Thread.sleep(3000);
	     List<WebElement>options=(List<WebElement>) driver.findElements(By.xpath("//select[@id=\"animals\"]//option"));
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	     Thread.sleep(3000);
	 	 driver.findElement(By.xpath("//button[@id='checkout']")).click();
	 	 Thread.sleep(3000);
	 	 driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Vinod");
	 	 Thread.sleep(3000);
	 	 driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Kumar");
	 	 Thread.sleep(3000);
	 	 driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("517247");
	 	 Thread.sleep(3000);
	 	 driver.findElement(By.xpath("//input[@id='continue']")).click();
	 	 Thread.sleep(3000);
	 	 driver.findElement(By.xpath("//button[@id='finish']")).click();
	}

}
