package deneme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tag2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.flypgs.com/?ds_rl=1256634&ds_rl=1263092&ds_rl=1263092&gclid=EAIaIQobChMIwOak56iK7gIVCQd7Ch1LVglUEAAYASAAEgK7SPD_BwE&gclsrc=aw.ds");
	Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='nxm2CookieSubmitButton']")).click();
		
driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[2]")).click();

WebElement element=driver.findElement(By.cssSelector(".select2-results__options"));

List<WebElement> list=element.findElements(By.xpath("//li"));

for(WebElement w:list){
	String name=w.getText();
	System.out.println(name);
}	
	}

}
