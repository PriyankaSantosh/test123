package test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test123 {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://dev.ebloodbanking.com/");
	driver.navigate().to("https://dev.bmtplus.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-submit")).click();
	driver.navigate().forward();
	
}
}