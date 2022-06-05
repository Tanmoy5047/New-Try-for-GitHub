package Projrct;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WBSEDCL {

	private static final String OutputTpye = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\WeDriver Version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Home.html");
		
		
		
		WebElement cunsumercorner=driver.findElement(By.xpath("//a[@id='Consumer']"));
		Actions act=new Actions(driver);
		act.moveToElement(cunsumercorner).build().perform();
		
	/*	WebElement energyconserve=driver.findElement(By.xpath("//li[@id='energyConserve']//a"));
		Actions act1=new Actions (driver);
		act1.moveToElement(energyconserve).build().perform();*/
		
		
		WebElement connectionmanagement=driver.findElement(By.xpath("//li[@id='connMgmt']"));
		Actions act1=new Actions (driver);
		act1.moveToElement(connectionmanagement).build().perform();
		
		WebElement quatationcalculator=driver.findElement(By.xpath("(//a[text()='Quotation Calculator'])[1]"));
		Actions act2=new Actions(driver);
		act2.moveToElement(quatationcalculator).click().build().perform();
		
		String mainpageadd=driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());
		
		ArrayList<String> childbrowaddr=new ArrayList<String>(driver.getWindowHandles());
		String addrs=childbrowaddr.get(1);
		driver.switchTo().window(addrs);
		
		WebElement appliences=driver.findElement(By.xpath("//select[@id='applianceDetail']"));
		Select s=new Select(appliences);
		s.selectByVisibleText("Split AC");
		
		WebElement add=driver.findElement(By.xpath("//button[@type='button']"));
		add.click();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		
		Thread.sleep(2000);
		
		
		WebElement noOfequipments=driver.findElement(By.xpath("//select[@id='noOfequiDetail']"));
		Select s1=new Select(noOfequipments);
		s1.selectByIndex(4);
		
		WebElement add1=driver.findElement(By.xpath("//button[@type='button']"));
		add1.click();
		
		WebElement typeofconsumer=driver.findElement(By.xpath("//select[@id='CLASS']"));
		Select s2=new Select(typeofconsumer);
		s2.selectByVisibleText("AGRICULTURE");
		
		WebElement typeofcatagory=driver.findElement(By.xpath("//select[@id='CAT']"));
		Select s3=new Select(typeofcatagory);
		s3.selectByVisibleText("Rural");
		
		WebElement typeofphase=driver.findElement(By.xpath("//select[@id='PHASE']"));
		Select s4=new Select(typeofphase);
		s4.selectByVisibleText("Three Phase");
		
		WebElement metercost=driver.findElement(By.xpath("//select[@id='MTCOSTCON']"));
		Select s5=new Select(metercost);
		s5.selectByVisibleText("No");
		
		WebElement submit=driver.findElement(By.xpath("//a[text()='Please submit below details to show Quotaion Amount']"));
		submit.click();
		
		ArrayList<String> ahildbrowseradd=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ahildbrowseradd.get(2));
		
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dist=new File("F:\\Velocity Class\\Selenium\\ScreenShot\\sc01.jpeg");
		FileHandler.copy(source, dist);
		
		
		ArrayList<String> childbrowaddress=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(childbrowaddress.get(1));
		
		File source1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File distnation=new File("F:\\Velocity Class\\Selenium\\ScreenShot\\sc2.jpeg");
		FileHandler.copy(source1, distnation);
		
		WebElement cunsumercorner1=driver.findElement(By.xpath("//a[@id='Consumer']"));
		Actions acts=new Actions(driver);
		act.moveToElement(cunsumercorner1).build().perform();
		
		WebElement complaint=driver.findElement(By.xpath("//a[text()='Complaint & Grievance']"));
		acts.moveToElement(complaint).build().perform();
		
		WebElement reportaprobelm=driver.findElement(By.xpath("//a[text()='Report any Problem']"));
		act.moveToElement(reportaprobelm).click().build().perform();
		
		ArrayList<String> childbaddr =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(childbaddr.get(3));
		
		File source2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dist1=new File("F:\\Velocity Class\\Selenium\\ScreenShot\\reportacomp.jpeg");
		FileHandler.copy(source2, dist1);
		
		WebElement text=driver.findElement(By.xpath("//img[@src='images/text-2.png']"));
		
		String result=text.getText();
		if(result.equals("Lighting up lives in the land of light"))
		{
			System.out.println("result is verified");
		}
		else
		{
			System.out.println("text is wrong");
		}
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argument[0].scroolIntoView(true);",text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
