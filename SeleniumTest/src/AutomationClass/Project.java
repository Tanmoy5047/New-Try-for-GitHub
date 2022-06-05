package AutomationClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-500)");
		
		js.executeScript("window.scrollBy(500,0)");
		js.executeScript("window.scrollBy(-500,0)");*/
		
		WebElement tryit=driver.findElement(By.xpath("(//div[@class='w3-example'])[1]//a"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",tryit);
		
		
		
		
		
		
		
		
	}

}
