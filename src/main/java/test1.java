import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.testfire.net/default.aspx");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("admin");
		driver.findElement(By.id("passw")).sendKeys("admin");
		driver.findElement(By.name("btnSubmit")).click();
		String PageTitle =driver.findElement(By.tagName("h1")).getText();
		//System.out.println(PageTitle);
		

	}

}
