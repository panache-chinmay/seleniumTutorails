package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInselenium54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The return type of driver.findElement(By.id("login-in")) is Web Element ;
		
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-GB&.intl=gb&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		// Locators 
		
//		// Id -- are unique 
//		WebElement textField = driver.findElement(By.id("login-username"));
//		textField.sendKeys("chinmaydeshpande010@gmail.com");
//		
//		WebElement nextButton = driver.findElement(By.id("login-signin"));
//		nextButton.click();
		// Name  -- are unique 
//		WebElement textField = driver.findElement(By.name("username"));
//		textField.sendKeys("chinmaydeshpande010@gmail.com");
//		
//		WebElement nextButton = driver.findElement(By.name("signin"));
//		nextButton.click();
		
		// By ClassName  -- not recommended , not unique 
//		WebElement textField = driver.findElement(By.className("phone-no "));
//		textField.sendKeys("chinmaydeshpande010@gmail.com");
//		
//		WebElement nextButton = driver.findElement(By.className("orko-button-primary"));
//		nextButton.click();
		
		// By Css selector 
//		WebElement textField = driver.findElement(By.cssSelector("#login-signin"));
//		textField.sendKeys("chinmaydeshpande010@gmail.com");
//		
//		WebElement nextButton = driver.findElement(By.cssSelector("#login-signin"));
//		nextButton.click();
		
		// By Xpath 
//		
//		WebElement textField = driver.findElement(By.xpath("//input[@id='login-username']"));
//		textField.sendKeys("chinmaydeshpande010@gmail.com");
//		
//		WebElement nextButton = driver.findElement(By.xpath("//input[@id='login-signin']"));
//		nextButton.click();
		
		// By linkText
		
//		WebElement DifficultySignOn = driver.findElement(By.linkText("Difficulty signing in?"));
//		DifficultySignOn.click();
		
		// By partialLinkText
		
		
		WebElement DifficultySignOnP = driver.findElement(By.partialLinkText("Difficulty"));
		DifficultySignOnP.click();
		
		// By TagName  remaning
		
		driver.quit();
		
		
		
		
	}

}
