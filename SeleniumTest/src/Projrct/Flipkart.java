package Projrct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		WebElement men=driver.findElement(By.xpath("(//a[@href='/shop/men'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(men).build().perform();
		
		WebElement tshirt=driver.findElement(By.xpath("//a[text()='Casual Shirts']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(tshirt).click().build().perform();
		
		WebElement roadstar=driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[5]"));
		roadstar.click();
		
		WebElement price=driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]"));
		price.click();
		
		
		
		
		
		

	}

}
