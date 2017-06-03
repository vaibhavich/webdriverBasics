import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class readObjectProperties {
	
	public static void main(String[] args) throws IOException {
		//FileInputStream fis = new FileInputStream("C:\\WebDriverWorkspace\\MyFirstWebDriverProject\\src\\Object.properties");
		
//// Object property file is a kind of read file, In java if u want to read a data from a file >use> FIS (File input stream)	
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\Object.properties");
//// user.dir = variable, if we shift our code C drive to D drive then if we use this then 
//// we dont need to change our	path of in code	
		
		Properties prop = new Properties();
////properties = Properties class represents a persistent set of properties in java
		
		prop.load(fis);
		
////input file(FIS)  ko as a property file read karana h		
		
		System.out.println(prop.getProperty("password"));
		
//// property of password will retrieve in console		
	}

}
