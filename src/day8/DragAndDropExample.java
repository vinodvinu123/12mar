package day8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDropExample {
	  public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Open a webpage with a draggable element
	        driver.get("URL_TO_YOUR_WEBPAGE");

	        // Identify the source and target elements for drag-and-drop
	        WebElement sourceElement = driver.findElement(By.id("draggable-item"));
	        WebElement targetElement = driver.findElement(By.id("drag-container"));

	        // Perform the drag-and-drop operation using Actions class
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(sourceElement, targetElement).perform();

	        // Close the browser window
	        driver.quit();
	    }
}
