package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderFacebook {
WebDriver driver;
	

@DataProvider
public Object[][]facedata(){
	Object[][]info =new Object[3][2];
	info[0][0]="haluk@hotmail.com";
    info[0][1]="1234";
    info[1][0]="ahmet@gmail.com";
	info[1][1]="54332";
	info[2][0]="mehmet@gmail.com";
	info[2][1]="94035";
	return info;
	
}
	@Test(dataProvider="facedata")
	public void test(String email,String password) throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
	
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
}
