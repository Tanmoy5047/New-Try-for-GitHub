package AutomationClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		int size=table.size();
		
		for(int i=0;i<size;i++)
		{
			System.out.println(i+1);
			String text=table.get(i).getText();
			System.out.println(text);
		}
		

	}

}
