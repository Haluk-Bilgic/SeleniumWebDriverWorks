package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertWindow2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//onaylama uyarýsý
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		//teyit uyarýsý
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".btn-primary")).click();
		Thread.sleep(2000);
        
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		//input bekleyen uyarýlar
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".btn.btn-info")).click();
		Thread.sleep(1000);

		driver.switchTo().alert().sendKeys("haluk");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		String message=driver.findElement(By.cssSelector("div#Textbox>p")).getText();
		System.out.println(message);
		
		Thread.sleep(1000);
        driver.quit();
	}

}
