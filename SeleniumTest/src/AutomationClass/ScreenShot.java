package AutomationClass;



import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException  {
		

		System.setProperty("webdriver.chrome.driver","F:\\Velocity Class\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		
		Date date= new Date();
		DateFormat dt= new SimpleDateFormat("dd-mm-yyyy HH mm SS");
		String a=dt.format(date);
		System.out.println(a);
		
		
		
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		File path=new File("F:\\Velocity Class\\Selenium\\New folder"+a+".jpeg");
		FileHandler.copy(source, path);
		
		

				
	}

}
