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
import org.openqa.selenium.firefox.FirefoxDriver;


public class Day_27May {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
/*		
		//driver.findElement(By.xpath("//*[@id='check3']")).click();
		
		WebElement chk_box = driver.findElement(By.xpath("//*[@id='check3']"));
//// chk_box store in webelement		
		System.out.println(chk_box.isSelected());

//// 3 methods of chk box returns boolean value (isSelected <verifies already selected chk box> 
////isDisplayed< verifies webelement is available on webpage or not, sometimes develpr remove some features,> 
////isEnabled	<verifies enable or not>

		
		if(chk_box.isSelected()){
			System.out.println("Check box is already checked");
		}else{
			chk_box.click();
		}
		
		Day_27May obj = new Day_27May();
		obj.selectCheckBox(chk_box);
		selectCheckBox(chk_box);
		selectCheckBox(chk_box);
		if(chk_box.isSelected()){
			System.out.println("Check box is already checked");
		}else{
			chk_box.click();
		}
		
		System.out.println(chk_box.isDisplayed());
		System.out.println(chk_box.isEnabled());
	
		WebElement radio_btn = driver.findElement(By.xpath("//*[@id='radio1']"));
//// 3 methods same as chk box		
		System.out.println(radio_btn.isSelected());
		
		if(radio_btn.isSelected()){
			System.out.println("Radio btn is already selected");
		}else{
			radio_btn.click();
		}
		
		System.out.println(radio_btn.isDisplayed());
		System.out.println(radio_btn.isEnabled());
		
		// get text of lable
		System.out.println(driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span")).getText());
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/input")).click();
		
		Alert x = driver.switchTo().alert();
//// x=variable, alert(a class in selenium)=data type for x
//// we can not inspect any value in alert
//// methods of alert = accept and dismiss  
		
		System.out.println(x.getText());
		
		x.accept();
		
	
		
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		
		 x = driver.switchTo().alert();
//// if we use x as alert data type again, errors msg shows	Duplicate local variable x	 
		
		//x.sendKeys("sandeep");
		Thread.sleep(3000);
		//x.dismiss();
		x.accept();
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		x = driver.switchTo().alert();
		
		x.sendKeys("abhishek");
		Robot y = new Robot();
////robot is a class of java for performing virtual keyboard task		
		y.keyPress(KeyEvent.VK_TAB);
//// VK = virtual key	
//// if two text box are in alert box then switch to another textbox using tab key event by robot		
		y.keyPress(KeyEvent.VK_SPACE);
	*/	
	
		WebElement table = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
///this is static table example, data of table not changes called static
//// if data of table changes frequently called dynamic table<ex. calendar (31 days/30/28>
		System.out.println(allRows.size());
		
		WebElement row = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[1]"));
		List<WebElement> allColumns = row.findElements(By.tagName("td"));
		
		System.out.println(allColumns.size());
		
		String first_part= "//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[";
		String second_part="]/td[";
		String third_part="]";
		
		for(int i=1;i<=allRows.size();i++){
			for(int j=1;j<=allColumns.size();j++)
////data of table always starts from [1,1]
				{
				System.out.print(driver.findElement(By.xpath(first_part+i+second_part+j+third_part)).getText());
				System.out.print("\t");
			}
			System.out.println();
////last element of this table will not print<see on website> due to timer. So, wait 15 second timer timings
////using thread.sleep()			
		}
		
		//How to maximize the window
		
	/*	driver.manage().window().maximize();
		//Browser Navigation commands
		driver.navigate().to("http://www.google.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
////when we use refresh? bcoz we dont know site is slow or not. >> write code any one element using if condition
////if driver will not be able to search element then page will refresh 		
		
		
		//How to find out whether element exists on page or not
		/*Boolean isElementPresent= driver.findElements(By.xpath("c")).size()!=0;
		System.out.println(isElementPresent);
		
		List<WebElement> allElements = driver.findElements(By.xpath("//*[@id='text200']"));
		allElements.size();*/
		
		//differences between findElement and findElements
		//driver.findElements(By.xpath("//*[@id='text50']"));
		
		//How to capture screenshot of page
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////file= data type, TakesScreenshot<selenium> = object, (TakesScreenshot)driver=driver perform this operation
////getScreenshotAs OutputType FILE ,this file is present as virtual		
		FileUtils.copyFile(srcfile, new File("C:\\TakePicture.png"));
////FileUtils = java class<for virtual to physical conversion, copyFile= driver to system
		
		
		
		
		
		
	}

	
	
	public static void selectCheckBox(WebElement checkbox){
		if(checkbox.isSelected()){
			System.out.println("checkbox is already selected");
		}else{
			checkbox.click();
		}
	

	}
}
