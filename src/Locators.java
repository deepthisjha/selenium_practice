import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/d2s/Documents/deepthi/chromedriver");

	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	      driver.get("https://rahulshettyacademy.com/locatorspractice/");
	      driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	      driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	      driver.findElement(By.className("signInBtn")).click();
	      System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	      driver.findElement(By.linkText("Forgot your password?")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	      driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@ymail.com");
	      driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
	      driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("john@abs.com");
	      driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
	      driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	      System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
	      
	      driver.findElement(By.className("go-to-login-btn")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	      driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	      driver.findElement(By.id("chkboxTwo")).click();
	     // driver.findElement(By.xpath("button[@class='submit signInBtn']")).click();
	     // driver.findElement(By.className("signInBtn")).click();
	      driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	      
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	      driver.close();
	      
	      

	}
	
	

	

}
