package deneme;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addDeleteProductToCard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.tutorialsninja.com/demo/index.php?route=common%2Fhome");
		driver.manage().window().maximize();
		
		WebElement textArea=driver.findElement(By.cssSelector("[name=search]"));
		textArea.sendKeys("Iphone");
		textArea.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector(".fa.fa-th-list")).click();
		
	WebElement addtocart=driver.findElement(By.cssSelector("button[onclick*=cart]"));
	addtocart.click();
	Thread.sleep(2000);
	
	WebElement message=driver.findElement(By.cssSelector(".alert-dismissible"));
	
	Assert.assertTrue(message.getText().contains("Success:"));
	
	System.out.println("First Test Successful");
	
	driver.findElement(By.cssSelector("#cart-total")).click();
	
	WebElement totalprice=driver.findElement(By.cssSelector(".table-bordered>tbody>:last-of-type>:last-of-type"));
	
	Assert.assertTrue(totalprice.getText().contains("123"));
	System.out.println("Second Test Successful");
	Thread.sleep(2000);

	WebElement remove=driver.findElement(By.cssSelector(".btn-danger.btn-xs"));
	remove.click();
	Thread.sleep(2000);

	driver.findElement(By.cssSelector("#cart-total")).click();

	WebElement Actualmessage=driver.findElement(By.cssSelector(".text-center"));
	
	String expectedMessage="Your shopping cart is empty!";
	
	Assert.assertEquals(Actualmessage.getText(),expectedMessage);
	System.out.println("Third Test Successful");
	
	driver.quit();
	}

}
