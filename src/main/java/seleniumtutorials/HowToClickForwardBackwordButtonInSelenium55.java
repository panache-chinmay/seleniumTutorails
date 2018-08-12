package seleniumtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToClickForwardBackwordButtonInSelenium55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		// Both the driver.get() and driver.navigate().to is used to  launch the browser
		// driver.navigate is used to again get different "url" from existing "url".
		driver.close();
		
		
		



	}

}


