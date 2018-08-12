package seleniumtutorials;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DowloadFileInchromeAndFirefoxeinSelenium59 {

	WebDriver driver ;
	File folder ;
	
 	@BeforeMethod()
	public void setup() {
		
		folder  = new File(UUID.randomUUID().toString());
		folder.mkdir();
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		
		ChromeOptions  options = new ChromeOptions();
		Map <String,Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_setting.popups",0);
		prefs.put("download.default_directory", folder.getAbsolutePath());
		
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(cap);
	}
 	@Test()
 	public void downLoadFileTest() throws InterruptedException {
 		driver.get("https://the-internet.herokuapp.com/download");
 		driver.findElement(By.linkText("some-file.txt")).click();
 		//wait for 20 secs to download the file 
 		Thread.sleep(2000);
 		File listOfFiles[] = folder.listFiles();
 		Assert.assertTrue(listOfFiles.length > 0);
 		
 		
 		for(File file : listOfFiles) {
 			Assert.assertTrue(file.length()> 0);
 			
 		}
 		
 		
 		
 		
 	}
 	
 	@AfterMethod()
 	public void tearDown() {
 		driver.quit();
 		for(File file : folder.listFiles()) {
 			file.delete();
 		}
 		folder.delete();
 	}
	

}
