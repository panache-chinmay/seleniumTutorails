package seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJsHeadlessBrowser48 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//Phantomjs  internally uses ghost driver 
		
		//ghost driver is used as JSAON wire protocol
		
		//headless browser testing 
		
		//No browser will be launch 
		
		// Testing will be happening behind the scene
		
		// Its very fast.
		
		// It directly  interacts with your app HTML Dom
		
		
		
		

		System.setProperty("phantomjs.binary.path", "/Users/chinmaydeshpande/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("chinmay010");
		driver.findElement(By.name("password")).sendKeys("consultadd");
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		
	   JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginButton );
		//loginButton.click();
		
		Thread.sleep(5000);
		
		
		System.out.println(driver.getTitle());
		
		driver.close();
		

	}

}
