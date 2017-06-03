import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class testUpload {

	public static void main(String[] args) throws FindFailed {	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[1]/input[10]")).click();
		
		Pattern img1 = new Pattern("C:\\@selenium\\sikuli\\filename.PNG");
		Pattern img2 = new Pattern("C:\\@selenium\\sikuli\\open.PNG");

		
		Screen screen = new Screen();
		
		screen.type("C:\\@selenium\\CaptureImage.png");
		
		screen.click(img2);
		
		
		
		
		
		
		
		
		
	}

}
