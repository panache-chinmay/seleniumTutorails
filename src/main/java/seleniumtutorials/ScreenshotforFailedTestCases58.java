package seleniumtutorials;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListerner58.class)
public class ScreenshotforFailedTestCases58 extends TestBaseClassFor58 {
	
	
	
	@BeforeMethod
	public void setUp() {
		intializatio();	
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	@Test
	public void search() {
		Assert.assertEquals(false, true);
		
	}
	@Test
	public void insert() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void delete() {
		Assert.assertEquals(false, true);
		
	}
	

}
