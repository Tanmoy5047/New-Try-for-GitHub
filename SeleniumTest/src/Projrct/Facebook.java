package Projrct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement createnewacc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createnewacc.click();
		
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByVisibleText("15");
		
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByValue("10");
		

	}

}
