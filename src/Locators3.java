import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver","/Users/d2s/Documents/deepthi/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();
	

	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	{ 
		
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		 String passwordText =driver.findElement(By.cssSelector("form p")).getText();//parenttagname childtagname  
         // using temporary password 'rahulshettyacademy' 
		 // selecting only the required test from the selected text using split method of strings.
		 String[] passwordArray=passwordText.split("'");
		 //splits at given character where right side of the string is stored in 0th array index and left side of the string is stored in 1st index of the returned array after split.
         String[] passwordArray2=passwordArray[1].split("'");
         String password=passwordArray2[0];
         return password;
       
		 
		 
		 
	}
}
