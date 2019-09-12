import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BlazeDemoTest {
 //  WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macstudent/Desktop/chromedriver");
	//	driver = new ChromeDriver();
		String baseUrl = "http://blazedemo.com/";
	//	driver.get(baseUrl);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
