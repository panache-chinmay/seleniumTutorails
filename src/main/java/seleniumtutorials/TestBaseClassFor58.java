package seleniumtutorials;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClassFor58 {
	
	static WebDriver driver ;
	
	public static void intializatio() {
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	public static void takeScreenshortFailedTc(String methoName) throws IOException {
		
		TakesScreenshot	 ts =	(TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File ("/Users/chinmaydeshpande/eclipse-workspace/SeleniumTutorials/src/main/java/seleniumtutorials/screenShot/"+methoName+".jpg"));
				
	}
	
	
	

}
