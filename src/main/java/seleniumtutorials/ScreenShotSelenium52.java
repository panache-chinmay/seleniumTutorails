package seleniumtutorials;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSelenium52 {
	static WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1 . take Screenshot and store it in file format 
		
		//2. copy the screen shot to desired location using copyfile method .
		
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("chinmay010");
		driver.findElement(By.name("password")).sendKeys("consultadd");
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginButton );
		
		try {
			takeScreenShot("HomePage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().frame("mainpanel");
		
	}
	
	public static void takeScreenShot(String filename) throws IOException {
		TakesScreenshot	 ts =	(TakesScreenshot)driver;
			File file = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File ("/Users/chinmaydeshpande/eclipse-workspace/SeleniumTutorials/src/main/java/ScreenShort/"+filename+".jpg"));
		
		
	}

}
