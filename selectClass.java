package selenium;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("Ahmet Haluk");
		
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("Bilgiç");
		
		WebElement gender=driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		
		ArrayList<WebElement>list=(ArrayList<WebElement>) driver.findElements(By.cssSelector("div[dir=ltr]>:nth-child(24)>input"));
		
		for(int i=0;i<list.size();i++){
			list.get(i).click();
			Thread.sleep(500);
		}
		
		WebElement date=driver.findElement(By.cssSelector("#datepicker"));
		date.sendKeys("30/12/2020");
	
	WebElement profession=driver.findElement(By.xpath("//input[@value='Automation Tester']"));
	profession.click();
	
	ArrayList<WebElement> tools=(ArrayList<WebElement>) driver.findElements(By.xpath("(//div[@class='control-group'])[7]//input"));
	
	for(WebElement tool:tools){
		tool.click();Thread.sleep(500);
	}
	
	WebElement element=driver.findElement(By.cssSelector("#continents"));
	Select slc=new Select(element);
	slc.selectByVisibleText("Australia");
	
	 element=driver.findElement(By.cssSelector("#selenium_commands"));
	 slc=new Select(element);
    slc.selectByIndex(0);
	slc.selectByIndex(1);
	
	driver.quit();
	}
}
