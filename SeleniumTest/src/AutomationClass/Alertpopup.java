package AutomationClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		WebElement textbox =driver.findElement(By.xpath("//a[@href='#Textbox']"));
		textbox.click();

		WebElement promptbox =driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptbox.click();
		
		Alert alt =driver.switchTo().alert();
		
		alt.sendKeys("aotomation");
		alt.accept();
		//System.out
		//system tanmoy ghosh
		//Interivew will start
		
		

	}

}
