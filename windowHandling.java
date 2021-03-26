package selenium;

import java.time.Year;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.demo.guru99.com/popup.php");
		
		String firstwindow=driver.getWindowHandle();
		String firstWindowUrl=driver.getCurrentUrl();
		
		System.out.println("Baþlangýç pencerem:"+firstWindowUrl);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	
	Set<String> windowAllWindows=driver.getWindowHandles(); 
		for(String windowlar:windowAllWindows){
			driver.switchTo().window(windowlar);
		}
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=emailid]")).sendKeys("haluk@gmail.com");	
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		System.out.println("Ýkinci pencere url:"+driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(firstwindow);
		
		System.out.println("Þuanki syfanýn url:"+driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.quit();
		

		
	}

}
