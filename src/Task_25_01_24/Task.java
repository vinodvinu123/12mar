package Task_25_01_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		    WebDriver driver= new ChromeDriver();
			driver.get("https://webdriveruniversity.com/Actions/index.html");
			driver.manage().window().maximize();
			
			WebElement from=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
			WebElement to=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
			Actions act=new Actions(driver);
			act.dragAndDrop(from, to).perform();
			
			WebElement dblclik=driver.findElement(By.id("double-click"));
	        act.doubleClick(dblclik).perform();
	       
	        WebElement clck1=driver.findElement(By.xpath("//button[text()=\"Hover Over Me First!\"]"));
			act.moveToElement(clck1).click().perform();			
			Thread.sleep(3000);
			
			WebElement webl1= driver.findElement(By.xpath("//div[@class='dropdown hover']//a[@class='list-alert'][text()='Link 1']"));				
			act.moveToElement(webl1).moveToElement(webl1).click().perform();
			String simplemsg=driver.switchTo().alert().getText();
			System.out.println(simplemsg);
			driver.switchTo().alert().accept();				
			Thread.sleep(3000);
			
		    WebElement clck2=driver.findElement(By.xpath("//button[text()=\"Hover Over Me Second!\"]"));
		    act.moveToElement(clck2).click().perform();
		    Thread.sleep(3000);	
		    
		    WebElement webl2= driver.findElement(By.xpath("//div[@class='dropdown']//a[@class='list-alert'][text()='Link 1']"));				
			act.moveToElement(webl2).moveToElement(webl2).click().perform();
			String simplemsg1=driver.switchTo().alert().getText();
			System.out.println(simplemsg1);
			driver.switchTo().alert().accept();
			Thread.sleep(3000);	
			 
		    WebElement clck3=driver.findElement(By.xpath("//button[text()=\"Hover Over Me Third!\"]"));
	        act.moveToElement(clck3).click().perform();
	        Thread.sleep(3000);	 
	        
	        WebElement webl3= driver.findElement(By.xpath("//div[@class='dropdown']//a[@class='list-alert'][text()='Link 1'][last()-1]"));				
			act.moveToElement(webl3).moveToElement(webl3).click().perform();
			String simplemsg2=driver.switchTo().alert().getText();
			System.out.println(simplemsg2);
			driver.switchTo().alert().accept();
			 Thread.sleep(3000);
			 
			  WebElement webl4= driver.findElement(By.xpath("//div[@class='dropdown']//a[@class='list-alert'][text()='Link 1'][position()=2]"));				
				act.moveToElement(webl4).moveToElement(webl4).click().perform();
				String simplemsg3=driver.switchTo().alert().getText();
				System.out.println(simplemsg3);
				driver.switchTo().alert().accept();
				 Thread.sleep(3000);
	        
	    	WebElement clkhold=driver.findElement(By.id("click-box"));
	        act.clickAndHold(clkhold).perform();

	}

}
