package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='userName']")).click();
		Actions act=new Actions(driver);
		//shift+enter data=capital data
		act.keyDown(Keys.SHIFT);//press shift key
		act.sendKeys("testuser");//enter the data
		act.keyUp(Keys.SHIFT);//release the shift key
		act.perform();
		//select the data ctrl+a
		act.keyDown(Keys.CONTROL);//press ctrl key
		act.sendKeys("a");//press a key
		act.keyUp(Keys.CONTROL);// release ctrl key
		act.perform();
		//copy the data ctrl+c
		act.keyDown(Keys.CONTROL);//press ctrl key
		act.sendKeys("c");//press c key
		act.keyUp(Keys.CONTROL);//release the key		
		act.perform();
		//move to next field
		act.sendKeys(Keys.TAB);// press tab
		act.perform();
		//paste the data ctrl+v
		act.keyDown(Keys.CONTROL);//press ctrl key
		act.sendKeys("v");//press v key
		act.keyUp(Keys.CONTROL);// release ctrl key
		act.perform();
	}

}
