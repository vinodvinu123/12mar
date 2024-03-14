package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String>windows=driver.getWindowHandles();
		List<String>ids=new ArrayList(windows);
		String parent=ids.get(0);
		String child=ids.get(1);
		
		System.out.println(parent);
		System.out.println(child);
		
		//switch to child
		//String childurl=driver.switchTo().window(child).getCurrentUrl();
		//System.out.println(childurl);
		
		//another method
		for(String id:windows) {
			String childurl=driver.switchTo().window(id).getCurrentUrl();
			System.out.println(childurl);
			if(childurl.equals("https://demoqa.com/sample")) {
				System.out.println(driver.getTitle());
			}
		}
	}

}
