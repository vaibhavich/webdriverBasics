import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class testkeyboard {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		
		
		Alert alert = driver.switchTo().alert();
		
	alert.sendKeys("sandeep");
		Thread.sleep(3000);
		alert.dismiss();
		//alert.accept();
		
	
	
		
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		 alert = driver.switchTo().alert();
		 
		 alert.sendKeys("Pardeep");
		 
		 Robot robot = new Robot();
		 
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyPress(KeyEvent.VK_SPACE);
		 
	

	}

}
