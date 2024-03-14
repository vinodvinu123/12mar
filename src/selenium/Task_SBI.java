package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Task_SBI {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
			driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class='continue_btn']//a[text()='CONTINUE TO LOGIN']")).click();
			driver.findElement(By.xpath("//a[text()='New User ? Register here/Activate ']")).click();
			String confmsg=driver.switchTo().alert().getText();
			System.out.println(confmsg);
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class='Next']//input[@class='btn btn-default']")).click();
	}

}
