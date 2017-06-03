import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class apr08wd {

	public static void main(String[] args) throws IOException {
		
	
		//Properties File
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\Object.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("pass"));
		System.out.println(prop.getProperty("signin"));
		
		/*WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name(prop.getProperty("user"))).sendKeys("tutorial");
		driver.findElement(By.name(prop.getProperty("pass"))).sendKeys("tutorial");
		driver.findElement(By.name(prop.getProperty("signin"))).click();


		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		//How to maximize the window
	
		driver.manage().window().maximize();
		
		//Browser Navigation commands
		
		driver.navigate().to("http://google.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();


		/*
		//Selenium Waits - Implicit Wait , Explicit wait
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password1")).sendKeys("tutorial");
		
		//Explicit Wait
		
	     WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password1")));
	//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("password")));
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
		} catch (FileNotFoundException e) {
			fis = new FileInputStream("C:\\Book2.xlsx");
			e.printStackTrace();
		}
	
		
		//Thread.sleep(5000);
		
		//int x = 4/0;
		
		try{
			int x = 4/0;
		}catch(Throwable e){
			System.out.println("Exception occured :- Divide by zero");
			e.printStackTrace();
		}
		
		//int x =4/0;
		System.out.println("Test passed");
		
		*/
	}
	}
