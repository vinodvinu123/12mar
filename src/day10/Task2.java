package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("//div[@class=\"rt-table\"]//div")).size();
		System.out.println("The number of rows:"+rows);
		
		//how many num of columns in table
		int col=driver.findElements(By.xpath("//div[@class=\"rt-tr\"]")).size();
		System.out.println("The number of columns:"+col);
		
		for(int r=0;r<=rows;r++) {
			
	//		String data1=driver.findElement(By.xpath("//div[@class=\"web-tables-wrapper\"]")).getText();
			String data2=driver.findElement(By.xpath("//div[@class=\"rt-tbody\"]")).getText();
				
	//		System.out.print(data1+" ");
			System.out.print(data2+" ");
				
				
			}
			System.out.println();
			
			List<WebElement>tdata=driver.findElements(By.xpath("//div[@class=\\\"rt-tbody\\\"]"));
		/*	for(WebElement options:tdata) {
				String values=options.getText();
				if(values.equals("Cantrell")) {
					driver.findElement(By.xpath("//span[@id=\"edit-record-2\"]//following-sibling::div//svg")).click();
				}
		
		
	}*/

}
}