package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class freeCRM {
  @Test
  public void lognTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  WebElement googletextbox=driver.findElement(By.name("q"));
	  googletextbox.sendKeys("freeCRM"+Keys.ENTER);
	  // driver.switchTo().alert().dismiss();
	  //  driver.findElement(By.linkText("Free CRM with Free calling and auto dialing features")).click();
	  WebElement link= driver.findElement(By.partialLinkText("Free CRM with Free calling"));link.click();
	  WebElement login= driver.findElement(By.xpath("//li//a[text()='Login']"));login.click();
	  WebElement Email= driver.findElement(By.name("email"));Email.sendKeys("fouqiazebakhan@gmail.com");
	  WebElement password=driver.findElement(By.name("password"));password.sendKeys("rollno545");
	  WebElement loginbtn=driver.findElement(By.xpath("//div[text()='Login']"));loginbtn.click();

	  Actions action=new Actions(driver);

	  WebElement companies=driver.findElement(By.xpath("//span[text()='Companies']"));
	  action.moveToElement(companies).build().perform();
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='plus inverted icon'])[3]\"")));
	  WebElement addcompanies=driver.findElement(By.xpath("(//i[@class='plus inverted icon'])[3]"));
	  action.click().perform();


	  action.moveToElement(addcompanies).click().build().perform();
	 WebElement name= driver.findElement(By.xpath("//div[@class='ui right corner labeled input']//input[@name='name']"));
	  action.moveByOffset(300,0).perform();
	   Thread.sleep(2000);
	 action.moveToElement(name).perform(); name.sendKeys("FZ_Solutions");
	  Thread.sleep(2000);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	//  js.executeScript("arguments[0].click()", name);
	 WebElement url= driver.findElement(By.xpath("//input[@name='url']"));
	  url.sendKeys("www.softwareTesting.com");
	  WebElement phone=driver.findElement(By.xpath("//div[@name='hint']//input[@type='text' and @class='search']"));
	 // Select slt=new Select(phone);
	 // slt.selectByVisibleText("India");
	  phone.sendKeys("India");
	 WebElement india= driver.findElement(By.xpath("(//div//span[text()='India'])[1]"));
	 // india.click();
	 action.click().perform();
	 WebElement number=driver.findElement(By.xpath("//div[@class='ui input']//input[@name='value' and @placeholder='Number']"));
	 number.sendKeys("1234567890");
	 WebElement othernumber=driver.findElement(By.xpath("//input[@placeholder='Home, Work, Mobile...']"));
	 othernumber.sendKeys("9849098490");
	 WebElement textarea=driver.findElement(By.xpath("//textarea[@name='description']"));
	 textarea.sendKeys("abcd");
	 WebElement industry=driver.findElement(By.xpath("//input[@name='industry']"));
	 industry.sendKeys("SwTesting");
	 WebElement stocksymbol=driver.findElement(By.xpath("//input[@name='symbol']"));
	 stocksymbol.sendKeys("$$$");
	 WebElement priority=driver.findElement(By.xpath("//div[@name='priority' and @tabindex='0' ]"));
	// Select slt=new Select(priority);
	// slt.deselectByVisibleText("Medium");
	 priority.click();
	 driver.findElement(By.xpath("//span[text()='Medium']")).click();
	 WebElement publicbutton=driver.findElement(By.xpath("//div//button[text()='Public']"));
	 publicbutton.click();
	 WebElement userallow=driver.findElement(By.xpath("//div[text()='Select users allowed access']"));
	 userallow.click();
	 driver.findElement(By.xpath("//div[@role='option']//span[text()='fouqia zeba']")).click();

	 WebElement street=driver.findElement(By.xpath("//input[@name='address']"));street.click();
	//=========//span[text()='Customer']  
	 street.sendKeys("kheria");
	 WebElement city=driver.findElement(By.xpath("//input[@name='city']"));city.click();
	 city.sendKeys("Agra");
	 WebElement state=driver.findElement(By.name("state"));
	 state.click();
	 state.sendKeys("uttar pradesh");
	 WebElement zip=driver.findElement(By.name("zip"));
	 zip.click();
	 zip.sendKeys("123456");
	// WebElement tags=driver.findElement(By.xpath("(//div[@class='ui field']//div[@role='combobox' and @aria-expanded='false'])[3]"));
	// tags.click();
	// tags.sendKeys("abc");
	 WebElement channel=driver.findElement(By.name("channel_type"));
	 channel.click();
	 WebElement fb=driver.findElement(By.xpath("//span[text()='Facebook']"));
	 fb.click();
	 WebElement numberOfemp=driver.findElement(By.name("num_employees"));numberOfemp.click();
	 numberOfemp.sendKeys("200");
	 WebElement annualRev=driver.findElement(By.name("annual_revenue"));
	 annualRev.click();
	 annualRev.sendKeys("Rs 200Cr");
	 WebElement status=driver.findElement(By.name("status"));
	 status.click();
	 WebElement selectStatus=driver.findElement(By.xpath("(//div[@class='visible menu transition']//div[@name='status' and @style='pointer-events: all;'])[2]"));
	 selectStatus.click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 WebElement save=driver.findElement(By.xpath("//button[@class='ui linkedin button']"));
	 save.click();
	
  }
}
