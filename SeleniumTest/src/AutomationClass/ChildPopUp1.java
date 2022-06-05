package AutomationClass;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alertBox=driver.findElement(By.xpath("(//div[@class='w3-example'])[1]//a"));
		WebElement confirmBox=driver.findElement(By.xpath("(//div[@class='w3-example'])[2]//a"));
		WebElement promptBox=driver.findElement(By.xpath("(//div[@class='w3-example'])[3]//a"));
		WebElement linebreak=driver.findElement(By.xpath("(//div[@class='w3-example'])[4]//a"));
		
		alertBox.click();
		confirmBox.click();
		promptBox.click();
		linebreak.click();
		
		String mainpageaddr=driver.getWindowHandle();
		System.out.println(mainpageaddr);
		
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		//it will get the address of all main & child browser popup
		for(int a=0;a<5;a++)
		
		driver.switchTo().window(addr.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(4));
		System.out.println(driver.getCurrentUrl());

	}

}
