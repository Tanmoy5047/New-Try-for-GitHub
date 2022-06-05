package TestNGClassandProject;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DesignModo.HomePage;
import DesignModo.LogInPage;

public class DesignModo {

	
	WebDriver driver;
	HomePage homepage;
	LogInPage loginpage;
	
	@BeforeClass
	private void lounchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	
		private void clockonloginpage()
		{
			driver.get("https://designmodo.com/");
			
			loginpage=new LogInPage(driver);
			loginpage.clickonLoginpage();
			
			homepage=new HomePage(driver);
		}
	
	@Test
	public void createpostcard()
	{
		homepage.clickonproduct();
		homepage.clickonopenapp();
		homepage.draganddrop();
	}
	
	@AfterMethod
	
	private void logout()
	{
		driver.navigate().back();
		loginpage.clickonlogout();
		
	}
	
	@AfterClass
	private void closebrowser()
	{
		driver.close();
	}
	
}
}*/
