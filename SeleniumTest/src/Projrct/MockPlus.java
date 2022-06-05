package Projrct;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockPlus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mockplus.com/");
		
		WebElement login=driver.findElement(By.xpath("//a[@href='/signin?source=']"));
		login.click();

		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("findtanmoyghosh@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("T@nmoy123");
		
		WebElement signup=driver.findElement(By.xpath("//button[text()='Sign in']"));
		signup.click();
		
		
		WebElement hiddenpopup=driver.findElement(By.xpath("//div[@class='dsm-c-comp-dialog']//i"));
		hiddenpopup.click();
		
		
		//WebElement newkey=driver.findElement(By.xpath("//div[@id='create-app']//span"));
		//newkey.click();
	}

}
