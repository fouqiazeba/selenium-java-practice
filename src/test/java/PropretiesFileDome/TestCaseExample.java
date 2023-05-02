package PropretiesFileDome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCaseExample {

	public static void main(String[] args) {
		     
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
	    WebDriver driver=new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//creating object of properties file to fetch valuse from properties file into this TestcaseExample.
		ReadConfigFile ConfigFile=new ReadConfigFile();
		
		//open url
	   //driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get(ConfigFile.getURL());
		
	   // driver.findElement(By.name("username")).sendKeys("Admin");
		//to get username key from properties file we are giving configfileObj.getUsernameMethod
		driver.findElement(By.name("username")).sendKeys(ConfigFile.getUsername());
		
	   // driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys(ConfigFile.getPassword());
		
	    driver.findElement(By.tagName("button")).click();
	}

}
