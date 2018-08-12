import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	
	
	@Test()
	public static void  method() {
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
		
		//driver.findElement(By.id("login-username")).sendKeys("chinmay010@gmail.com");
		
		List <WebElement> ll = driver.findElements(By.tagName("a"));
		System.out.println(ll.size());
		
		
		
		//driver.quit();
		// Locators , 1) id , name ,classname , xpath ,css selector , link text , partiallinktest , tagname
		
		// firepath 
		
		// chropath 
		
//		driver.findElement(By.id("login-username")).sendKeys("chinmaydeshpande010@yahoo.com");
//		
//		// name
//		driver.findElement(By.id("login-username")).clear();
//		
//		driver.findElement(By.name("username")).sendKeys("chinmaydespande010@gmail.com");
//		
//		driver.close();
//		
		// className 
//		driver.findElement(By.id("login-username")).clear();
		
		
//		driver.findElement(By.className("phone-no ")).sendKeys("chinmaydeshpande010@yahoo.com");
//		
//		driver.close();
//		
		//Linktext
		
		//driver.findElement(By.linkText("Difficulty signing in?")).click();
		
		
		// PartialLink-- Not recommended to use 
		
		//driver.findElement(By.partialLinkText("Difficulty")).click();
		
		//Css selector
		//driver.findElement(By.cssSelector("#mbr-forgot-link")).click();
		
		//driver.findElement(By.cssSelector(".phone-no ")).sendKeys("chinmaydeshpande010");
		
		
		// xpath 
		
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("chinmaydeshpabe");
		
		
	
	
		
	}
}
		

	


