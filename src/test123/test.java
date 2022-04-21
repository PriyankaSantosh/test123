package test123;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		}
public static void main(String[] args) {
WebDriver driver= new ChromeDriver();	
driver.get("https://www.naukri.com/");
Set<String> v = driver.getWindowHandles();
System.out.println(v.size());
System.out.println(v);
}
}

