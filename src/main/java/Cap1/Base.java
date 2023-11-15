package Cap1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Base {
	public RemoteWebDriver driver;
	 @Parameters({"url"})
	@BeforeSuite
	public void preCondition(String url)
	{
		driver = new ChromeDriver(); 

        driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	}
	@AfterSuite
 public void postCondition()
 {
	 driver.close();


}


}
