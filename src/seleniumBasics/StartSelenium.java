package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartSelenium {
	
	public WebDriver driver;
	
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//remove the comment
	}

}
