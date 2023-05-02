package test;



import java.io.File;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class loginTest {
@Test
	public  void main() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\Chromedriver.exe" );
	ChromeOptions options=new ChromeOptions();
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.nopcommerce.com/en");
  //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement action= driver.findElement(By.xpath("//span[text()='My account ']"));
	action.click();
	WebElement register=driver.findElement(By.xpath("//span[text()='Log in']"));
	register.click();


	WebElement username=driver.findElement(By.className("username"));
	username.sendKeys("xxx");
	WebElement password=driver.findElement(By.name("Password"));
	password.sendKeys("xxx");
	WebElement submit=driver.findElement(By.cssSelector("input[type=submit]"));
	submit.click();
	WebElement errormessage=driver.findElement(By.xpath("(//div//parent::form//following-sibling::div)[2]"));
	String message=driver.getTitle();
	System.out.println(message);
	System.out.println("test pass");
	
	
	TakesScreenshot scrshot=(TakesScreenshot)driver;
	File strFile=scrshot.getScreenshotAs(OutputType.FILE);
	String path=strFile.getPath();
	System.out.println(path);
	
	Thread.sleep(2000);


	driver.quit();

}



}
