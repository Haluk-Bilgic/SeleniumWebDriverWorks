package selenium;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertWindow {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.demo.guru99.com/test/delete_customer.php");
		
		WebElement id=driver.findElement(By.xpath("//input[@name='cusid']"));
		id.sendKeys("haluk123");
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();  
		String actualResult=driver.switchTo().alert().getText();
   
		Assert.assertEquals("Customer Successfully Delete!",actualResult);		
	Thread.sleep(1000);
	
	System.out.println(actualResult);
     driver.switchTo().alert().accept();

	Thread.sleep(1000);

	driver.quit();
	}

}
