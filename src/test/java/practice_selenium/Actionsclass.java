package practice_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionsclass {
 
@Test
  public void actionsclass() {
	  System.setProperty("webdriver.chrome.driver","c:\\ChromeDriver\\chromedriver.exe");
      ChromeOptions options=new ChromeOptions();
      WebDriver driver=new ChromeDriver(options);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://www.nopcommerce.com/en");
     boolean source= driver.findElement(By.xpath("//span[text()='Partners']")).isEnabled();
     WebElement destination=driver.findElement(By.className("home-banner-button"));
     Actions action=new Actions(driver);
     action.click(destination).perform();
    // action.moveToElement(destination);
}
}
