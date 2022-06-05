package AutomationClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenimages {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		/*List<WebElement> images=driver.findElements(By.xpath("//img"));
		
		int image=images.size();
		
		for(int i=0;i<image;i++)
		{
			System.out.println(i+1);
			String src=images.get(i).getAttribute("src");
			System.out.println(src);*/
		}

	}




















