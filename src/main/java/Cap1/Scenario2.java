package Cap1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Scenario2 extends Base {
	@Test
	public void iPhone()
	{
		driver.findElement(By.xpath("//span[@role='button']")).click();
		WebElement ele=driver.findElement(By.xpath("//input[contains(@title, 'Search')]"));
		ele.sendKeys("iPhone 14");
		ele.sendKeys(Keys.ENTER);
		WebElement ele1=driver.findElement(By.xpath("//span[contains(text(), 'Showing')]"));
		String ele2=ele1.getText();
		String ele3="Showing 1 – 24 of 167 results for ";
		if(ele2.contains(ele3))
		{
			System.out.println("Showing 1 – 24 of 167 results for iPhone");
		}
		
		driver.findElement(By.xpath("(//div[contains(text(),'iPhone')])[1]")).click();
		String Title=driver.getTitle();
		if(Title.equalsIgnoreCase("IPhone 14- Buy Products Online at Best Price in India - All Categories | Flipkart.com"))
		{
		System.out.println("Title is Verified");
	}}

}
