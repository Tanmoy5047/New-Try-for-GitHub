package AutomationClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePrint {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		for(int i=2;i<7;i++)
		{
			List<WebElement> table=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]//td"));
			int s=table.size();
			for(int j=0;j<s;j++)
			{
				String data=table.get(j).getText();
				System.out.print(data+", ");
			}
			System.out.println();
			
			
		}
		

	}

}
