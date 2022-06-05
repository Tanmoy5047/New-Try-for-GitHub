package AutomationClass;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alertBox=driver.findElement(By.xpath("(//div[@class='w3-example'])[1]//a"));
		WebElement confirmBox=driver.findElement(By.xpath("(//div[@class='w3-example'])[2]//a"));
		WebElement promptBox=driver.findElement(By.xpath("(//div[@class='w3-example'])[3]//a"));
		WebElement linebreak=driver.findElement(By.xpath("(//div[@class='w3-example'])[4]//a"));
		
		alertBox.click();
		/*confirmBox.click();
		promptBox.click();
		linebreak.click();*/
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String mainpage=driver.getWindowHandle();	//address of main page
		System.out.println(mainpage);
		//driver.getWindowHandles();	//address of main page & all the child browser
		
		ArrayList<String> childarddrs=new ArrayList<String>(driver.getWindowHandles());
		String addrs=childarddrs.get(0);
		driver.switchTo().window(addrs);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(childarddrs.get(1));
		System.out.println(driver.getCurrentUrl());
		
		/*driver.switchTo().window(childarddrs.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(childarddrs.get(3));
		System.out.println(driver.getCurrentUrl());*/
		
		
		
		
		
		

	}

}
