package seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserTesting10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//htmlunitdriver is not available in Selenium 3.x version
		// html unit driver -- to use this concept , we have to download htmlunitdriver JAR file
		
		// advantage 
		
		// Testing is happening behind the scene and hence  no browser is launch
		
		// Very fast execution of test cases , hence performance of the script is improved
		
		// Limitations 
		
		// Not suitable for Action class -- user actions ,-- mouse movement , double click , drag and drop
		
		//Ghost Driver -- Headless Browser
		
		//Html - unit driver -->  Java 
		
		// Phantom js ---> Javascript 
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("chinmay010");
		driver.findElement(By.name("password")).sendKeys("consultadd");
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();",loginButton );
		loginButton.click();
		
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		

	}

}
