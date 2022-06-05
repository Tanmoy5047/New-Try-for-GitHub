package Projrct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InsuranceProject {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.farmers.com/");
		
		WebElement insurance=driver.findElement(By.xpath("//div[@class='navigation__mobile-bar-wrapper d-lg-none']"));
		Actions act=new Actions(driver);
		act.moveToElement(insurance).build().perform();
		
		
		WebElement lifeinsurance=driver.findElement(By.xpath("//div[@class='navigation__mobile-bar-wrapper d-lg-none']"));
		act.moveToElement(lifeinsurance).click().build().perform();
		
		WebElement getaquate=driver.findElement(By.xpath("//*[@id=\"farmers-product-2-0\"]/div/div/div/div[2]/header/div/div[1]/div[1]/div[2]/div/form/div/div[3]/div/button[2]/span"));
		getaquate.click();
		
		
		
		
		
		
		

		
	}

}
