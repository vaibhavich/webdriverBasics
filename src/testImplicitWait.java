import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		//Thread.sleep(20000);
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
//// WebDriverWait = class, wait=object, 30=time(in secs only)		
		driver.findElement(By.name("userName")).sendKeys("tutotrial");
		
		
		//Explicit wait 
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("tutorial");
////explicit wait is used for different conditions like finding element/ finding alert/finding Form 		
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("login12")));
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("login")));
////Invisibility of an element: if any element was exist but not developer deleted that  		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
