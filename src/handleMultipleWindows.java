import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class handleMultipleWindows {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/a/b")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		//Iterator
		
		Iterator<String> iterate = allWindowHandles.iterator();
		
		String first_window = iterate.next();
		String second_window = iterate.next();
		
		
		System.out.println(first_window);
		System.out.println(second_window);
		
		
		driver.switchTo().window(second_window);
		
		driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/form[1]/input[5]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
