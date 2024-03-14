package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_DropDown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.manage().window().maximize();
        
        Select drpdwn=new Select(driver.findElement(By.xpath("//select[@id=\"second\"]")));
        if(drpdwn.isMultiple()) {
        	drpdwn.selectByIndex(0);
        	drpdwn.selectByValue("burger");

	}

}
}