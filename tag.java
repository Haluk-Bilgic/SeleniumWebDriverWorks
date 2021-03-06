package deneme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.haberturk.com");
		driver.manage().window().maximize();
		
		WebElement element =driver.findElement(By.xpath("//*"));
		
		List<WebElement> list=element.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for(WebElement webelement:list){
			
			String url=webelement.getAttribute("href");
			String urls []=new String[]{url};
			
			for(int i=0;i<urls.length;i++){
			
				if(urls[i].contains("yasam")){
				System.out.println(urls[i]);
			}
			}
		}
		driver.quit();
			
		
	}

}
