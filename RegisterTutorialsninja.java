package deneme;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTutorialsninja {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium/chromeDriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			driver.get("http://www.tutorialsninja.com/demo/index.php?route=common%2Fhome");
driver.manage().window().maximize();

WebElement account=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
	account.click();
	Thread.sleep(1000);
	WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
	register.click();
	
	WebElement firstname=driver.findElement(By.cssSelector("input[name=firstname]"));
	String name="Haluk";
	firstname.sendKeys(name);
	
	WebElement lastname=driver.findElement(By.cssSelector("#input-lastname"));
	String surname="Bilgiç";
	lastname.sendKeys(surname);
	
	WebElement mail=driver.findElement(By.xpath("//input[@type='email']"));
	String email="ahbilgic0554@hotmail.com";
	mail.sendKeys(email);
	
	WebElement phone=driver.findElement(By.id("input-telephone"));
	String cell="0534262724";
	phone.sendKeys(cell);
	
	WebElement password=driver.findElement(By.xpath("//input[@type='password' and @name='password']"));
	String code="23456";
	password.sendKeys(code);
	
	WebElement confirm=driver.findElement(By.xpath("//input[@type='password' and @name='confirm']"));
	confirm.sendKeys(code);
	
	WebElement ok=driver.findElement(By.name("agree"));
	ok.click();
	
	WebElement Continue=driver.findElement(By.cssSelector(".btn.btn-primary"));
	Continue.click();
		
	Assert.assertEquals("Your Account Has Been Created!",driver.getTitle());
	
	System.out.println("Successful");
	}

}
