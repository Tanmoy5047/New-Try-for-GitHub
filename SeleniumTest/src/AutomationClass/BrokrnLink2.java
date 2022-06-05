package AutomationClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokrnLink2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Information_for_SEBI(LODR).html");
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		int size=links.size();
		
		for(int i=0;i<size;i++)
		{
			System.out.println(i+1);
			String herf=links.get(i).getAttribute("herf");
			System.out.println(herf);
		}

	}

}














