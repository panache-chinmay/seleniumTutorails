package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassfor50 {
	
	static WebDriver  driver ;
	String Credentials ;
	String CredentialsInfo [];
	
	
	@BeforeMethod
	public static void SetUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
	}
	
	@Test(priority = 1)
	public void LoginWithCutomer() throws InterruptedException {
		Credentials=	HowToUseHashMapInseleniumWebDriver50.getUserLoginInfo().get("customer");
		CredentialsInfo =Credentials.split("_");
		System.out.println(CredentialsInfo[0]);
		driver.findElement(By.name("username")).sendKeys(CredentialsInfo[0]);
		driver.findElement(By.name("password")).sendKeys(CredentialsInfo[1]);
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginButton );
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(HowToUseHashMapInseleniumWebDriver50.getMonthFromUser().get(10));

	}
	

	@Test(priority = 2)
	public void LoginWithadmin() throws InterruptedException {
		Credentials=	HowToUseHashMapInseleniumWebDriver50.getUserLoginInfo().get("customer");
		CredentialsInfo =Credentials.split("_");
		driver.findElement(By.name("username")).sendKeys(CredentialsInfo[0]);
		driver.findElement(By.name("password")).sendKeys(CredentialsInfo[1]);
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginButton );
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(HowToUseHashMapInseleniumWebDriver50.getMonthFromUser().get(10));

	

}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}