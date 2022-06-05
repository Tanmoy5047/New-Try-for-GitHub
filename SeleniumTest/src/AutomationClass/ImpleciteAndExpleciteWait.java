package AutomationClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpleciteAndExpleciteWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//implicite Waiting time
		//driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/login/");
		
		WebElement emeil =driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement login =driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		emeil.sendKeys("findtanmoy");
		pass.sendKeys("684");
		login.click();
		
		
		//explicit  ->Waiting Time + Conditions
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));		
		WebElement forgotpass=
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forgotten pass?']")));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
