package day10;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Static_Task {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
	
		WebElement ele=driver.findElement(By.xpath("//div[@class='rt-tr -odd']//div[7]//span[@id='edit-record-1']"));
		List<WebElement> ele1=driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-td']"));
		System.out.println(ele1.size());
		System.out.println("First Name"+" " +"Last Name"+ "Age" + "Email"+ "Salary"+ "Dept");
		for(int i=0;i<ele1.size();i++)
		{
			
			System.out.print(ele1.get(i).getText());
			System.out.println(" ");
		}

		System.out.println(); 
		
		
//		driver.close();

	}
	
}
