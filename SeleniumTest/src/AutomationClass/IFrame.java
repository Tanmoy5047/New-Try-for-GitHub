package AutomationClass;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement tryityourself=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		tryityourself.click();
		
		ArrayList<String> childbrowadd=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(childbrowadd.get(1));
		
		//WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		//tryit.click();
		
		WebElement frame123=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(frame123);
		//driver.switchTo().frame("iframeResult");
		WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		driver.switchTo().parentFrame();
		
		WebElement button=driver.findElement(By.xpath("//a[@id='menuButton']"));
		button.click();
		
		ArrayList<String> mainpageaddr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(mainpageaddr.get(0));
		
				
		
	}

}
