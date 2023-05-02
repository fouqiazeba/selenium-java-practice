package test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Brokenlinks {
@Test
	public  void brlinks () throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		  ChromeOptions options=new ChromeOptions();
		  WebDriver driver=new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("http://www.deadlinkcity.com/");
		  
		  List <WebElement> linkList=driver.findElements(By.tagName("a"));
		  
		  int resCode=200;//2xx response code is valid link
		  int brokenLinkCount=0;
		  System.out.println("Total number of links are:"+linkList.size());
		  
		  for(WebElement element:linkList)
		  {
			  String url=element.getAttribute("href");
			  try 
			  {
				  
				URL urlLink=new URL(url);
				
				HttpURLConnection huc=(HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode=huc.getResponseCode();
				
				if(resCode>=400)
				{
					System.out.println(url+"Broken links");
					brokenLinkCount++;
				}
			} 
				catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  
		  }
		  System.out.println("Toyal broken links:"+brokenLinkCount);
		driver.close() ; 
	}

}
