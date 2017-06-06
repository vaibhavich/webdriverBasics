import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ql2_Calendar {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://client.ql2.com");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vaibhavi_chaurasiya");;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("012vcch021");;
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'System')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/sys/qa/')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@id='cp_icon_dmin']")).click();
		
		//WebElement actDate=driver.findElement(By.xpath("//*[@id='cp_div_dmin']/table/tbody/tr/td/center/table[1]/tbody/tr/td[2]/span"));
		
		WebElement datePicker;
    List<WebElement> noOfColumns;
    List<String> monthList = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    // Expected Date, Month and Year
    int expMonth;
    int expYear;
    String expDate = null;
    // Calendar Month and Year
    String calMonth = null;
    String calYear = null;
    boolean dateNotFound;

    dateNotFound = true;

    expDate = "21";
    expMonth= 5;
    expYear = 2018;


    while(dateNotFound)
    {
     //Retrieve current selected month name from date picker popup.
     String actDate = driver.findElement(By.xpath("//*[@id='cp_div_dmin']/table/tbody/tr/td/center/table[1]/tbody/tr/td[2]/span")).getText();
     System.out.println(actDate);
     String[] s = actDate.split(" ");
     calMonth = s[0];
     System.out.println(calMonth);
     //Retrieve current selected year name from date picker popup.
     //calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
     calYear=s[1];
     System.out.println(calYear);
     
     //If current selected month and year are same as expected month and year then go Inside this condition.
     if(monthList.indexOf(calMonth)+1 == expMonth && (expYear == Integer.parseInt(calYear)))
     {
      //Call selectDate function with date to select and set dateNotFound flag to false.
        datePicker = driver.findElement(By.xpath("//*[@id='cp_div_dmin']/table"));
        noOfColumns=datePicker.findElements(By.tagName("td"));
        //datePicker.findElements(By.xpath("//td[text(),'29']"));
        //Loop will rotate till expected date not found.
        for (WebElement cell: noOfColumns){
           System.out.println(cell.getText());
         //Select the date from date picker when condition match.
         if (cell.getText().equals(expDate)){
          cell.findElement(By.linkText(expDate)).click();
          break;
         }
        }
      dateNotFound = false;
     }
     //If current selected month and year are less than expected month and year then go Inside this condition.
     else if(monthList.indexOf(calMonth)+1 < expMonth && (expYear == Integer.parseInt(calYear)) || expYear > Integer.parseInt(calYear))
     {
      //Click on next button of date picker.
      driver.findElement(By.xpath("//*[@id='cp_div_dmin']/table/tbody/tr/td/center/table[1]/tbody/tr/td[3]/a")).click();
     }
     //If current selected month and year are greater than expected month and year then go Inside this condition.
     else if(monthList.indexOf(calMonth)+1 > expMonth && (expYear == Integer.parseInt(calYear)) || expYear < Integer.parseInt(calYear))
     {
      //Click on previous button of date picker.
      driver.findElement(By.xpath("//*[@id='cp_div_dmin']/table/tbody/tr/td/center/table[1]/tbody/tr/td[1]/a")).click();
     }
    }
    Thread.sleep(3000);


}

}
