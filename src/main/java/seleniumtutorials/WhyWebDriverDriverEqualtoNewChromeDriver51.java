package seleniumtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhyWebDriverDriverEqualtoNewChromeDriver51 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		
		if(title.equals("Facebook")) {
			System.out.println("TestCase Passed ");
		}
		else {
			System.out.println("TestCase failed");
		}
		Thread.sleep(2000);
		
		String CurrentUrl =  driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.close();
		
	}
	
	

}
