package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class uploadingFileTest {
  @Test
  public void fileUpload() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.manage().window().maximize();
	  driver.get("https://ui.freecrm.com/companies");

		WebElement Email= driver.findElement(By.name("email"));Email.sendKeys("fouqiazebakhan@gmail.com");
		WebElement password=driver.findElement(By.name("password"));password.sendKeys("rollno545");
		WebElement loginbtn=driver.findElement(By.xpath("//div[text()='Login']"));loginbtn.click();
      //company page
		Actions action=new Actions(driver);
        WebElement company=driver.findElement(By.xpath("//span[text()='Companies']"));
		 action.moveToElement(company).click().build().perform();
		 Thread.sleep(2000);
		WebElement create=driver.findElement(By.linkText("Create"));
		create.click();
	//name and website of company

		WebElement companyname=driver.findElement(By.xpath("//input[@name='name' and @autocomplete='new-password']"));
		companyname.click();
		companyname.sendKeys("Jenpact");
		WebElement companywebsite=driver.findElement(By.name("url"));
		companywebsite.click();
		companywebsite.sendKeys("www.Jenpact.com");
		WebElement address=driver.findElement(By.name("address"));
		address.sendKeys("Gachibowli");
		WebElement city=driver.findElement(By.name("city"));
		address.sendKeys("Hyderabad");
		
		WebElement description=driver.findElement(By.xpath("//textarea[@name='description']"));
		description.sendKeys("Jenpact software solutions welcomes you to the world of technology where we build your dreams to reality");
		 WebElement channel=driver.findElement(By.name("channel_type"));
		 channel.click();
		 WebElement fb=driver.findElement(By.xpath("//span[text()='Facebook']"));
		 fb.click();
		 WebElement numberOfemp=driver.findElement(By.name("num_employees"));numberOfemp.click();
		 numberOfemp.sendKeys("200");
		 WebElement annualRev=driver.findElement(By.name("annual_revenue"));
		 annualRev.click();
		 annualRev.sendKeys("Rs 200Cr");
		 //Vertical scroll – down by 150  pixels
		// js.executeScript(“Window.scrollBy(0,150)”);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement img=driver.findElement(By.name("image"));
		img.click();
		img.sendKeys("C:\\Users\\mdjav\\OneDrive\\Desktop\\company.jpg"+Keys.ENTER);
		Thread.sleep(1000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ALT); //press on cntrl key
		rb.keyPress(KeyEvent.VK_F4);//press on F4
		rb.keyRelease(KeyEvent.VK_ALT);
		rb.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(1000);
		
		WebElement savebutton=driver.findElement(By.xpath("//button[@class='ui linkedin button']"));
		savebutton.click();
		driver.quit();
		
		
  }
}
