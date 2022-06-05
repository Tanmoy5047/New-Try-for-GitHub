package Projrct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DesignModo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://designmodo.com/");
		
		WebElement hiddenpopup=driver.findElement(By.xpath("//div[@class='button small passive hover-green wide cropSides']"));
		hiddenpopup.click();
		
		
		WebElement login=driver.findElement(By.xpath("//a[@class='menu-link p phone-small semiBold middle inlineBlock  padding-right-2 shift-left-5 phone-hide']"));
		login.click();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='username']"));
		email.sendKeys("findtanmoyghosh@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("T@nmoy123");
		
		WebElement agreechechbox=driver.findElement(By.xpath("(//span[@class='element'])[2]"));
		agreechechbox.click();
		
		WebElement loginbutton=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		loginbutton.click();
		
		WebElement products=driver.findElement(By.xpath("(//a[@class='menu-link'])[1]"));
		products.click();
		
		WebElement openapp=driver.findElement(By.xpath("//a[@class='button product-button rounded small green']"));
		openapp.click();
		
		WebElement menu=driver.findElement(By.xpath("(//li[@class='modules-panel__category'])[1]"));
		WebElement module=driver.findElement(By.xpath("//ul[@id='modules-list']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(menu, module).build().perform();
		
		
		WebElement profile=driver.findElement(By.xpath("//a[@class='menu-link middle dropdownTrigger shift-up-2']//img"));
		profile.click();
		
		WebElement logout=driver.findElement(By.xpath("(//a[text()='Sign Out'])[1]"));
		logout.click();
		
		
		
		
		
		
		

	}

}
