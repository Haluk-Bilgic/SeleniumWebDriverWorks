package selenium;

import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class actionClassWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@class='wt-display-inline-block wt-vertical-align-middle']")).click();	
		
	WebElement element=driver.findElement(By.cssSelector("#locale-overlay-select-language_code"));
    Select slc=new Select(element);
	slc.selectByValue("en-US");
	
	element=driver.findElement(By.cssSelector("#locale-overlay-select-currency_code"));
	slc=new Select(element);
	slc.selectByValue("USD");
	
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector(".wt-btn.wt-btn--filled")).click();
	
	Thread.sleep(500);
	
	Actions action=new Actions(driver);
	
	ArrayList<WebElement> menubars=(ArrayList<WebElement>) driver.findElements(By.xpath("//ul[@role='menubar']//li"));
	
	for(WebElement menubar:menubars){
	  action.moveToElement(menubar).perform();
	  Thread.sleep(1000);
	  
	  if(menubar.getText().equals("Toys & Entertainment")){
		  driver.findElement(By.linkText("Books")).click();
		  break;
	  }
	  
	  System.out.println(menubar.getText());
	}
	driver.quit();
	}

}
