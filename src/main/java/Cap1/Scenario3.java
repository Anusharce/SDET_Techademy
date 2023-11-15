package Cap1;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		

		// Create a new WebDriver instance.
		WebDriver driver = new ChromeDriver();

		// Navigate to the given URL.
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role='button']")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		// Enter the phone number and click on the "Request OTP" button.
		WebElement phoneNumberElement = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	     phoneNumberElement.sendKeys("9381486670");
	       WebElement requestOTPButtonElement = driver.findElement(By.xpath("//button[contains(text(), 'OTP')]"));
		requestOTPButtonElement.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement phoneNumberElement1 = driver.findElement(By.xpath("//div[contains(text(),'Please')]"));
		String expectedOTPMessage = "Please enter the OTP sent to 9381486670";
		String actualOTPMessage = phoneNumberElement1.getText();
		assertEquals(expectedOTPMessage, actualOTPMessage);

		// Close the browser.
		driver.quit();

	}

}  


