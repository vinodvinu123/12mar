package day7;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		//String parent=driver.getWindowHandle();
		//System.out.println("main window:"+parent);//F961C10D084F82EA2E2F954C57F91C11
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		Set<String>windows=driver.getWindowHandles();
		// iterator method
		Iterator<String>ids=windows.iterator();
		String parent=ids.next();//first id
		String child=ids.next();//second id
		
		System.out.println("Main window:"+parent);
		System.out.println("Child window:"+child);
		
		//switch to child window
		String childurl=driver.switchTo().window(child).getCurrentUrl();
		System.out.println(childurl);
		
		//switch to main window
		String parenturl=driver.switchTo().window(parent).getCurrentUrl();
		System.out.println(parenturl);
	


	}

}
		