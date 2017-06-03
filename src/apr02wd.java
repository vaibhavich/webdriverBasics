import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;




public class apr02wd 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException, ATUTestRecorderException {
	{
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}}
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com");
	}}
	*/
		WebDriver driver = new FirefoxDriver();
		
		//ATUTestRecorder recorder = new ATUTestRecorder("C:\\Selenium", "TestExecution", false);
		//recorder.start(); 
	
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		/*
		driver.findElement(By.xpath("//*[@id='check3']")).click();
		
		WebElement checkbox = driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[1]/input[7]"));
			     		  		
		
		if(checkbox.isSelected()){
			System.out.println("Checkbox is already selected");
		}else{
			checkbox.click();
		}
		
		if(checkbox.isSelected()){
			System.out.println("Checkbox is already selected");
		}else{
			checkbox.click();
		}
		
		
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
	
		
		WebElement radio_btn = driver.findElement(By.xpath("//*[@id='radio1']"));
		
		System.out.println(radio_btn.isSelected());
		System.out.println(radio_btn.isDisplayed());
		System.out.println(radio_btn.isEnabled());
		
		if(radio_btn.isSelected()){
			System.out.println("It is already selected");
		}else{
			radio_btn.click();
		} 
		
		Select multiselectbox = new Select(driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[1]/select")));
		multiselectbox.selectByVisibleText("Russia");
		
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[2]/table/tbody/tr/td[2]/input[1]")).click();		
		
		
		
		
		multiselectbox.selectByValue("India");
		multiselectbox.selectByIndex(5);
		
		Thread.sleep(3000);
		
		multiselectbox.deselectByValue("Russia");
		multiselectbox.deselectByVisibleText("India");
		multiselectbox.deselectByIndex(5);
		
		Thread.sleep(3000);
		
		multiselectbox.selectByVisibleText("Russia");
		multiselectbox.selectByValue("India");
		multiselectbox.selectByIndex(5);
		
		Thread.sleep(3000);
		
		multiselectbox.deselectAll();
		
		}} 
		
		
	
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/input")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(3000);
		
		alert.accept(); 
		
		
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		
		
		Alert alert = driver.switchTo().alert();
		
	alert.sendKeys("sandeep");
		Thread.sleep(3000);
		alert.dismiss();
		//alert.accept();
		
	}}
	
		
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		 Alert alert = driver.switchTo().alert();
		 
		 alert.sendKeys("Pardeep");
		 
		 Robot robot = new Robot();
		 
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyPress(KeyEvent.VK_SPACE);
		 
	*/
		 WebElement table = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody"));
		  
		
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		
		System.out.println(allrows.size());
		
		
		WebElement row = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[1]"));
		
		List<WebElement> allcols = row.findElements(By.tagName("td"));
		
		System.out.println(allcols.size());
		
		for(int i=1;i<=allrows.size();i++){
			for(int j=1;j<=allcols.size();j++){
			
				System.out.print(driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
				System.out.print("\t");
			}}
			System.out.println();
		
	}

	
		/*
		//Take Screenshot
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcfile, new File("E:\\CaptureImage1.png"));
		
		
		
		//recorder.stop();
	
	*/
	
	
	}
	}
