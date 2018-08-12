package seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitAndImplictWaitInSelenium56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Implicit wait is always applied globally  and is available for all elements 
		//Implicit wait and explicit wait should not be applied together on element a
		// Implicit and explicit wait define for a particular element adds to calculate total wait  for same element
		// we can override the implicit wait and can be changed anywhere any time
		// dynamic in nature 
		
		// if two waits are added together total sync time will increase
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement Surname = driver.findElement(By.name("lastname"));
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement MobileNumber = driver.findElement(By.name("reg_email__"));
		WebElement ForgotPassword = driver.findElement(By.linkText("Forgotten account?"));
		
		
		//Explicit wait : no explicit keyword , specific to element , dynamic in nature,
		// available with WebDriver wait some ExpectedConditions 
		//Specific to element 
		//dynamic in nature 
		
		Sendkeys(driver, firstName, 5, "firstname");
		Sendkeys(driver, Surname, 10, "lastname");
		Sendkeys(driver, MobileNumber, 2, "7709192441");
		ClickTo(driver, ForgotPassword, 2);
		
		
		// Create to separate method for send keys  and elements to click for explicit wait 
	}
	
	public static void Sendkeys(WebDriver driver,WebElement element,int timeout ,String value ) {
		
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void ClickTo(WebDriver driver,WebElement element,int timeout) {
		
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	
	
	
	
	

}
