package deneme;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Dell");
		driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor) driver;

		WebElement table=driver.findElement(By.cssSelector(".wikitable.sortable.jquery-tablesorter"));
		
		js.executeScript("arguments[0].scrollIntoView();",table);
		
		List<WebElement> satirlar= driver.findElements(By.cssSelector(".jquery-tablesorter>tbody>tr"));
		
		for(int i=0;i<satirlar.size();i++){
System.out.println(satirlar.get(i).getText()+"\n");

		}
System.out.println("*********************************************************");		
		WebElement specialSatir=driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tbody//tr[5]//td[2]"));
		System.out.println(specialSatir.getText());
		
	Assert.assertTrue(specialSatir.getText().contains("Cloud integration leader"));
System.out.println("successful");		
		
driver.quit();
	}

}
