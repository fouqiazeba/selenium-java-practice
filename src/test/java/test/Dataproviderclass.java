package test;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class Dataproviderclass {
  @Test(dataProvider = "dp")

  public void lognTest(String nme , String s) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  // open google page and search for freeCRMlink
	  driver.get("https://www.google.com/");
	  WebElement googletextbox=driver.findElement(By.name("q"));
	  googletextbox.sendKeys("freeCRM"+Keys.ENTER);
	  WebElement link= driver.findElement(By.partialLinkText("Free CRM with Free calling"));link.click();
	  //login to freeCRM
	  WebElement login= driver.findElement(By.xpath("//li//a[text()='Login']"));login.click();
	  WebElement Email= driver.findElement(By.name("email"));Email.sendKeys("fouqiazebakhan@gmail.com");
	  WebElement password=driver.findElement(By.name("password"));password.sendKeys("rollno545");
	  WebElement loginbtn=driver.findElement(By.xpath("//div[text()='Login']"));loginbtn.click();
      ////home page of CRM .....finding companies icon
	  Actions action=new Actions(driver);
	  WebElement companies=driver.findElement(By.xpath("//span[text()='Companies']"));
	  action.moveToElement(companies).build().perform();
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement addcompanies=driver.findElement(By.xpath("(//i[@class='plus inverted icon'])[3]"));
	  action.click().perform();
      action.moveToElement(addcompanies).click().build().perform();
      //creat company form
	  WebElement name= driver.findElement(By.xpath("//div[@class='ui right corner labeled input']//input[@name='name']"));
	  action.moveByOffset(300,0).perform();
	  Thread.sleep(1000);
	  action.moveToElement(name).perform(); name.sendKeys(nme);
	  WebElement url= driver.findElement(By.xpath("//input[@name='url']"));
	  url.sendKeys(s);
	  WebElement phone=driver.findElement(By.xpath("//div[@name='hint']//input[@type='text' and @class='search']"));
	  phone.sendKeys("India");
	  WebElement india= driver.findElement(By.xpath("(//div//span[text()='India'])[1]"));
	 // india.click();
	  action.click().perform();
	  WebElement number=driver.findElement(By.xpath("//div[@class='ui input']//input[@name='value' and @placeholder='Number']"));
	  number.sendKeys("98480");
	  WebElement othernumber=driver.findElement(By.xpath("//input[@placeholder='Home, Work, Mobile...']"));
	  othernumber.sendKeys("9849098490");
	  WebElement textarea=driver.findElement(By.xpath("//textarea[@name='description']"));
	  textarea.sendKeys("abcd");
	  WebElement industry=driver.findElement(By.xpath("//input[@name='industry']"));
	  industry.sendKeys("SwTesting");
	  WebElement stocksymbol=driver.findElement(By.xpath("//input[@name='symbol']"));
	  stocksymbol.sendKeys("$$$");
	  WebElement priority=driver.findElement(By.xpath("//div[@name='priority' and @tabindex='0' ]"));
	  priority.click();
	  driver.findElement(By.xpath("//span[text()='Medium']")).click();
	 WebElement publicbutton=driver.findElement(By.xpath("//div//button[text()='Public']"));
	 publicbutton.click();
	 WebElement userallow=driver.findElement(By.xpath("//div[text()='Select users allowed access']"));
	 userallow.click();
	 driver.findElement(By.xpath("//div[@role='option']//span[text()='fouqia zeba']")).click();

	 WebElement street=driver.findElement(By.xpath("//input[@name='address']"));street.click();
	 street.sendKeys("kheria");
	 WebElement city=driver.findElement(By.xpath("//input[@name='city']"));city.click();
	 city.sendKeys("Agra");
	 WebElement state=driver.findElement(By.name("state"));
	 state.click();
	 state.sendKeys("uttar pradesh");
	 WebElement zip=driver.findElement(By.name("zip"));
	 zip.click();
	 zip.sendKeys("282008");
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
	 driver.quit();
	
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Tata consultancy", "www.tata.com" },
      new Object[] { "fzSolutions", "www.fzsolutions.com"},
    };
    
  }
  
}
