package Cap1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario1 extends Base{
	@Test
	public void Contact() {
	String currentTitle=driver.getTitle();
	String expectedTitle="Want to practice test automation? Try these demo sites! | Automation Panda";
	if(currentTitle.equals(expectedTitle))
	{
		System.out.println("Title is Verified");
	}
	

    driver.findElement(By.xpath("//a[text()='Contact']")).click();
 	String currentTitle2=driver.getTitle();
 	String expectedTitle2="Contact | Automation Panda";
 	if(currentTitle2.equals(expectedTitle2))
	{
		System.out.println("After clicking on Contact Title is Verified ");
	}
	  
	   
     driver.findElement(By.xpath("//input[@id='g3-name']")).sendKeys("Anusha");
     driver.findElement(By.xpath("//input[@id='g3-email']")).sendKeys("test@gail.com");
     driver.findElement(By.xpath("//textarea[@name='g3-message']")).sendKeys("Message");
     driver.findElement(By.xpath("//strong")).click();
     WebElement ele=driver.findElement(By.xpath("//h4[contains(text(), 'sent')]"));
     String ele1=ele.getText();
     if(ele1.equalsIgnoreCase("Your message has been sent"))
     {
    	 System.out.println("Your message has been sent Message is verified");
     }

}}
