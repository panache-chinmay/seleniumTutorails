package seleniumtutorials;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinksandImages29 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		// tutorial 29
		
		// 1how to find broken link and images using selenium webdriver
		
		// 1) get the list of all links and images
		
		//  2)iterate through list and exclude image and link without href attribute and 
		
		// links starts with java script
		
		// Get the size of all active links 
		
		// Check the href url with httpConnecton api .
		
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("chinmay010");
		driver.findElement(By.name("password")).sendKeys("consultadd");
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginButton );
		
		
		//driver.findElement(By.))
		
		driver.switchTo().frame("mainpanel");
		
	
		// 1) get the list of all links and images
		
		List<WebElement> linkList =driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		// Get the size of elements with a and image tag 
		
		System.out.println(linkList.size());
		
		
	//  2)iterate through list and exclude image and link without href attribute and 
		
			// links starts with java script
		
		List<WebElement> activeLinks = new ArrayList();
		
		for(int i = 0 ; i < linkList.size();i++) {
			if(linkList.get(i).getAttribute("href") != null && (!linkList.get(i).getAttribute("href").contains("javascript"))) {;
			activeLinks.add(linkList.get(i));
			}
		}
		
		System.out.println("The total number of active links and images are"+activeLinks.size());
		
		// loop through and check the href url with httpConnecton api .
		
		for(int j = 0 ; j < activeLinks.size();j++) {
			
		 	HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		 	connection.connect();
		 	String response = connection.getResponseMessage();
		 	connection.disconnect();
		 	System.out.println("The url with response ----->"+activeLinks.get(j).getAttribute("href")+" "+response );
		}
		
		driver.quit();
		
		

	}

}
