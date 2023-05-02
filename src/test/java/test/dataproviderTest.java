package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderTest {
	@Test(dataProvider="dp")
	public void companies(String name, String website) {
		// launch brouser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.cogmento.com/");
		//login page
	
		WebElement Email= driver.findElement(By.name("email"));Email.sendKeys("fouqiazebakhan@gmail.com");
		WebElement password=driver.findElement(By.name("password"));password.sendKeys("rollno545");
		WebElement loginbtn=driver.findElement(By.xpath("//div[text()='Login']"));loginbtn.click();
        //home page
		Actions action=new Actions(driver);
        WebElement company=driver.findElement(By.xpath("//span[text()='Companies']"));
		 action.moveToElement(company).click().build().perform();
		WebElement create=driver.findElement(By.linkText("Create"));
		create.click();

		WebElement companyname=driver.findElement(By.xpath("//input[@name='name' and @autocomplete='new-password']"));
		companyname.click();
		companyname.sendKeys(name);
		WebElement companywebsite=driver.findElement(By.name("url"));
		companywebsite.click();
		companywebsite.sendKeys(website);
		WebElement savebutton=driver.findElement(By.xpath("//button[@class='ui linkedin button']"));
		savebutton.click();
		driver.quit();
	}
	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			 new Object[]{ "EliteAutomation", "elitetestautomation.com" },
			 new Object[] { "IBM", "ibm.com" },
		       new Object[] {"microsoft","microsoft.com"},
			 new Object[] {"Amazon","amazon.com"} 
		};
	}
}
