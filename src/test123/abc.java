package test123;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class abc {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.google.com/");  
		RemoteWebDriver e= (RemoteWebDriver) driver;  
		File srcFile = e.getScreenshotAs(OutputType.FILE); 
		File destFile = new File("./c/a.png");  
		FileUtils.copyFile(srcFile, destFile);  
		driver.close(); 
	
	}
}
