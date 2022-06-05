package Projrct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookmyShow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/kolkata");
		

	}

}
