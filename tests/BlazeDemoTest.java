import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {
   WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macstudent/Desktop/chromedriver");
		driver = new ChromeDriver();
		String baseUrl = "http://blazedemo.com/";
		driver.get(baseUrl);
		Thread.sleep(4000);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCase1() throws InterruptedException {
		WebElement check = driver.findElement(By.name("fromPort"));
		check.click();
		driver.close();
		Thread.sleep(4000);
		
		
	}
	@Test
	public void testCase2() throws InterruptedException {
		
		WebElement details = driver.findElement(By.className("btn btn-primary"));
		details.click();
		driver.close();
		Thread.sleep(4000);
	}
	
	@Test
	public void testCase3() throws InterruptedException {
		
		
	}
	

}
