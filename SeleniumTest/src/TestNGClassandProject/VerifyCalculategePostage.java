package TestNGClassandProject;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IndianPost.Calculatepostage;
import IndianPost.LogIn;
import IndianPost.Logout;

public class VerifyCalculategePostage {
	

public class VerifyCalculatePostagePage {
	WebDriver driver;
	Calculatepostage calculatepostage;
	LogIn login;
	
	
	
	@BeforeClass
	public void lounchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void logintoapplication()
	{
		driver.get("https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
		
		login=new LogIn(driver);
		login.clickonsignin();
		
		 calculatepostage=new Calculatepostage(driver);
		 //calculatepostage.clickonApplicationHeader();
	}
	//1st TestCase
	@Test
	public void verifyCalculatePostagepage()
	{	calculatepostage.clickonApplicationHeader();
		calculatepostage.clickonclacutrpage();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		Assert.assertEquals("https://www.indiapost.gov.in/VAS/Pages/CalculatePostage.aspx", url);
		Assert.assertEquals("Calculate Postage", title);
	}
	//2nd TestCase
	@Test
	public void clickonsavingsbank()
	{
		//calculatepostage.clickonApplicationHeader();
		calculatepostage.closebuttonclick();
		calculatepostage.clickonsavingbank();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		Assert.assertEquals("https://www.indiapost.gov.in/Financial/Pages/Content/Post-Office-Saving-Schemes.aspx", url);
		Assert.assertEquals("Post Office Saving Schemes",title);*/
		/*if(url.equals("https://www.indiapost.gov.in/Financial/Pages/Content/Post-Office-Saving-Schemes.aspx"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Failed");
		}*/
		
	/*}
	

	@AfterMethod
	public void logoutfromApplication()
	{
		Logout logout=new Logout(driver);
		logout.clickonlogout();
	}
	@AfterClass
	public void closedbrowser()
	{
		driver.close();
	}
}

}*/
