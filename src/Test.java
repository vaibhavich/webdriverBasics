import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		//For firefox Browser
		/*System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\SW\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();*/
		
		
//// webdriver=interface, driver= new object of firefoxdriver class, firefoxdriver() = class 
//// bike b = new makehonda(); ==> here bike can be Interface/ class(not chlild class of makehonda) or parent class   
		
//		//For chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		//For IE Browser
		/*System.setProperty("webdriver.ie.driver", "C:\\Softwares\\SW\\seleniumserver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();*/
		
		//driver.get("http://newtours.demoaut.com");
		/*String expValue="Welcome: Mercury Tours1";
		String actValue = driver.getTitle();
		
		if(expValue.contentEquals(actValue)){
			System.out.println("Test passed");
		}else{
			System.out.println("Test Failed");
		}*/
		
//// 	contentEquals = method in java for comparing content that are equal or not	
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		/*driver.findElement(By.name("userName")).sendKeys("tutorial");	
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();*/
		
		/*WebElement username = driver.findElement(By.name("userName"));
		 
//// WebElement = data type, username (it can be any thing, this is good programming practice, we should give any logical name of variable) = variable , driver.findelement = action perform by variable. 
//// for declaring any variable in java, variable should have a datatype
 
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("login"));
		username.sendKeys("tutorial");
		Thread.sleep(2000);
//// 2000 mili sec means 2 seconds slow performance, 

		username.clear();
		Thread.sleep(2000);
		password.sendKeys("tutorial");
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		//login.click();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
//// A link type webelement (REGISTER) property value also same (as register). It starts with tag < a >
//// URL will also change because it is link type and it will redirect to another page, In properties of link text "href" attribute always shown with changed URL		
		
		driver.findElement(By.partialLinkText("STER")).click();*/
////when values are dynamic, means value of element changes but some common words available in text 		
		
	/*	
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//// List = datatype, <webelement> = type of List(webelement type ki banegi), allLinks = variable, driver.findelement = action perform by variable 		
//// (IMP) how many links present in webpage? use findElementS by tag name <a>		
//// we cant use simple variable for findelementS because variable can store only one value. In this case we will use List
  
		System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++){
			System.out.println(allLinks.get(i).getText() + "->" +allLinks.get(i).getAttribute("href"));
		}
//// getText() = method use to fetch value of text which is present after attribute 		
//// "href" for finding URL		
		System.out.println(driver.findElement(By.name("userName")).getAttribute("size"));*/
		
		/*
		driver.findElement(By.linkText("REGISTER")).click();
		
		
		Select drpdown = new Select(driver.findElement(By.name("country")));
//// select = constructor (this select class is made by selenium for using dropdown, developer should use select class for making dropdown 
//// Some times developer is not used select class, then we will directly choose that perticular name for selection and will click on that name
//// selenium made select class for passing 1 argument(go to selenium document> select class for more info),if we will not pass any argument the compiler throws an error "The constructor Select() is undefined"// add argument to match select(webelement)		
//// how many ways to to find dropdown==3
					
		drpdown.selectByVisibleText("GREECE");
///ByVisibleText > first priority, ByValue> 2nd ,ByIndex > 3rd (bcoz if developer delete 1 value from dropdown then index will be change)	
		
		
		driver.findElement(By.name("Country")).sendKeys("INDIA");
		driver.findElement(By.name("Country")).sendKeys(Keys.DOWN);
		driver.findElement(By.name("Country")).sendKeys(Keys.DOWN);
		
		
		List<WebElement> allOptions =  drpdown.getOptions();

////getOptions() method used in dropdown bcoz values of dropdown called options and it uses option tag <option />
		System.out.println(allOptions.size());	
		for(int i=0;i<allOptions.size();i++){
			System.out.println(allOptions.get(i).getText());
		}
////select by default selected option in dropdown
		System.out.println(drpdown.getFirstSelectedOption());
		*/
        
        
        
        
        
//select by default multiple selected option in dropdown	
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		Select drpdown = new Select(driver.findElement(By.name("FromLB")));
		drpdown.selectByVisibleText("Greece");
		drpdown.selectByVisibleText("India");
		drpdown.selectByVisibleText("Japan");

		
        List<WebElement> allselected = drpdown.getAllSelectedOptions();
        System.out.println(allselected.size());	
        for(int i=0;i<allselected.size();i++){
        System.out.println(allselected.get(i).getText());
		}		
		
///using <option  /> tag, we can retrieve values without using getOptions()
		
		
		
		
		
		
		
		//driver.close();
	}
}


