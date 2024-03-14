package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_WebTable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();
		//how many num of rows in table
		int rows=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("The number of rows:"+rows);
		
		//how many num of columns in table
		int col=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("The number of columns:"+col);
		
		//retrieve banglore value
		String value=driver.findElement(By.xpath("//table[@id='customers']//tr[4]//td[4]")).getText();
		System.out.println("specific value:"+value);
		
		//get entire table
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=col;c++) {
				String data=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		
		//Click on checkbox  and click on knowmore link if the company name is ola
		List<WebElement>tdata=driver.findElements(By.xpath("//table[@id='customers']//td"));
		for(WebElement options:tdata) {
			String values=options.getText();
			if(values.equals("Ola")) {
				driver.findElement(By.xpath("//td[text()='Ola']//preceding-sibling::td//input")).click();
				driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td//a")).click();
			}
		}

	}

}
