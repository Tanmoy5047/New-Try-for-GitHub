package AutomationClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Information_for_SEBI(LODR).html");
		
		
		List<WebElement> img=driver.findElements(By.xpath("//img"));
		int size=img.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(i+1);
			String src=img.get(i).getAttribute("src");
			System.out.println(src);
		}
		//System.out.Println(tanmoy)
		
	}

}
