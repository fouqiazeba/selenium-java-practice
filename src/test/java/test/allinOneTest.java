package test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class allinOneTest {
   
private static final String javascriptExecuter = null;
@Test
  public void myTest() {  
  }
  @Test
  public void loginTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	//ChromiumOptions<ChromeOptions> options = new ChromiumOptions(null, null, null);
	//  System.setProperty("webdriver.edge.driver");
	//  WebDriverManager.ChromeDriver().setup();
	  //options.addArguments("--remote-allow-origins=*");
		ChromeOptions options=new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en");
		//driver.navigate().to("https://www.nopcommerce.com/en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); 
		
		WebElement action= driver.findElement(By.xpath("//span[text()='My account ']"));
		action.click();
		
		WebElement register=driver.findElement(By.linkText("Register"));
	    register.click();
		WebElement FirstName= driver.findElement(By.id("FirstName"));
		FirstName.sendKeys("fouqia");
		
		WebElement LastName=driver.findElement(By.id("LastName"));
		LastName.sendKeys("zeba");
		WebElement Email=driver.findElement(By.name("Email"));
		Email.sendKeys("fouqiazebakhan@gmail.com");
		WebElement ConfirmEmail=driver.findElement(By.id("ConfirmEmail"));
		ConfirmEmail.sendKeys("fouqiazebakhan@gmail.com");
		WebElement UserName=driver.findElement(By.name("Username"));
		UserName.sendKeys("zeba");
		WebElement Button=driver.findElement(By.id("check-availability-button"));
		Button.click();
		
		driver.close();  
  }
 @Test
	 public void dropDownMenuTest(){
		 
			System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.nopcommerce.com/en");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); 
			WebElement product=driver.findElement(By.xpath("//li//span[text()='Product']"));
	        product.click();
			WebElement industries =driver.findElement(By.xpath("//li//span[text()='Industries']"));
			industries.click();
			WebElement furniture=driver.findElement(By.linkText("Furniture"));
			furniture.click();
			String title=driver.getTitle();
			System.out.println(title);
			
			driver.close();
			
 }
 @Test
 public void marketingTest() {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\\\Chromedriver\\\\chromedriver.exe");
	 ChromeOptions options=new ChromeOptions();
	 options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
	 WebDriver driver=new ChromeDriver(options);
	 driver.get("https://www.nopcommerce.com/en/ecommerce-marketing-features");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 WebElement marketting=driver.findElement(By.linkText("//span[text()='Marketing']"));
	 marketting.click();
	 driver.close();
 }
 @Test
 public void dropDownMenu() {
	 System.setProperty("webdriver.chrome.driver", "C:\\\\Chromedriver\\\\chromedriver.exe");
	 ChromeOptions options=new ChromeOptions();
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.nopcommerce.com/en");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	//WebElement supportandservices=driver.findElement(By.xpath("(//span//parent::li//following-sibling::li)[17]"));
	WebElement supportandservices=driver.findElement(By.xpath("//li//span[text()='Support & services']"));
	supportandservices.click();
	WebElement contactus=driver.findElement(By.linkText("Contact us"));
	contactus.click();
	//find the dropdown menu name it as request_type
	WebElement request_type=driver.findElement(By.id("Type"));
	request_type.click();
	
	Select type_element=new Select(request_type);
	
	// select an element from this dropdpown menu
	type_element.selectByVisibleText("Partnership enquiries");
	WebElement name=driver.findElement(By.id("FullName"));
	name.sendKeys("zeba");
	
	WebElement email=driver.findElement(By.id("Email"));
	name.sendKeys("fouqiazebakhan@gmail.com");
	
	WebElement website=driver.findElement(By.id("WebsiteUrl"));
	name.sendKeys("fouqiazebakhan.com");
	WebElement country =driver.findElement(By.id("Country"));
	country.click();
	Select type_country=new Select(country);
	type_country.selectByVisibleText("India");
	WebElement project=driver.findElement(By.id("Projects"));
	project.sendKeys("nopcommerce.com");
	WebElement enquiry=driver.findElement(By.id("Enquiry"));
	enquiry.sendKeys("abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ");
	WebElement sendEmail=driver.findElement(By.name("send-email"));
	sendEmail.click();
	driver.close();
 }
 @Test
public void implicitAndExplicitwaits()
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe" );
	 ChromeOptions options=new ChromeOptions();
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.nopcommerce.com/en");
	 driver.manage().window().maximize();
	 
	 //implicitwait
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 WebElement supportandservices=driver.findElement(By.xpath("//li//span[text()='Support & services']"));
	 supportandservices.click();
	 WebElement contactus=driver.findElement(By.linkText("Contact us"));
	 contactus.click();

	 WebElement request_type=driver.findElement(By.id("Type"));
	 request_type.click();
	 Select type_element=new Select(request_type);
	 type_element.selectByVisibleText("Partnership enquiries");

	 //finding elements by calling explicit wait function 

	 WebElement name=findelement(driver,By.id("FullName") ,2);
	 name.sendKeys("zeba khan");
	 WebElement email=findelement(driver,By.id("Email"),1) ;
	 email.sendKeys("fouqiazebakhan@gmail.com");
	 WebElement website=findelement(driver,By.id("WebsiteUrl"), 0);
	 website.sendKeys("www.nopcommerce.com");

	 WebElement country =driver.findElement(By.id("Country"));
	 country.click();
	 Select type_country=new Select(country);
	 type_country.selectByVisibleText("India");
	 WebElement project=driver.findElement(By.id("Projects"));
	 project.sendKeys("nopcommerce.com");
	 WebElement enquiry=driver.findElement(By.id("Enquiry"));
	 enquiry.sendKeys(" Java selenium Automation ");
	 WebElement sendEmail=driver.findElement(By.name("send-email"));
	 sendEmail.click();
	 driver.close();

 }
 public  WebElement findelement(WebDriver driver,By loc,int seconds)
 {
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	 return driver.findElement(loc);
 }
 @Test
 public void fluent_wait () {
	 System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe" );
	 ChromeOptions options=new ChromeOptions();
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.nopcommerce.com/en");
	 driver.manage().window().maximize();
	 //implicitwait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //fluentwait to find manIcon
	 WebElement manicon=findElemenetByFluent(driver,By.xpath("//span[text()='My account ']"),3);
	 manicon.click();
	 
	 WebElement login=findElemenetByFluent(driver,By.linkText("Log in"),1);
	 login.click();
	 
	 WebElement username=findElemenetByFluent(driver,By.id("Username"),1);
	 username.sendKeys("Fouqia zeba khan");

	 WebElement pwd=findElemenetByFluent(driver,By.className("password"),1);
	 pwd.sendKeys("12345");

	 WebElement button=findElemenetByFluent(driver,By.xpath("//input[@class='btn blue-button']"),1);
	 button.click();
     driver.close();
}
public WebElement findElemenetByFluent(WebDriver driver,By loc,int sec) {
      FluentWait waiter=new FluentWait(driver);
	 waiter.pollingEvery(Duration.ofSeconds(1));
	 waiter.withTimeout(Duration.ofSeconds(sec));
	 waiter.ignoring(NoSuchElementException.class);
	 waiter.until(ExpectedConditions.visibilityOfElementLocated(loc));
	 return driver.findElement(loc);

 }
@Test
public void gettingTextOnConsole() {
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe" );
	 ChromeOptions options=new ChromeOptions();
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.nopcommerce.com/en");
	 driver.manage().window().maximize();
	 //implicitwait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 WebElement supportsAndservices=findelement(driver, By.xpath("//li//span[text()='Support & services']"), 1);
	 supportsAndservices.click();
	 WebElement training=findelement(driver,By.xpath("//a//span[text()='Training']"),1);
	 training.click();
	 WebElement view=findelement(driver, By.xpath("//div//a[text()='View the topics']"), 2);
	 view.click();
	 WebElement cart=findelement(driver,By.xpath("//div//a[@title='nopCommerce Course. Advanced']\n"), 1);
	 cart.click();
	 WebElement candidatename=findelement(driver, By.xpath("//input[@id='product_attribute_34']"), 2);
	 candidatename.sendKeys("zeba");
	 WebElement candidateemail=findelement(driver, By.xpath("//input[@id='product_attribute_35']"), 2);
	 candidateemail.sendKeys("zeba@gmail.com");
	 WebElement submitbutton=findelement(driver, By.xpath("//*[@id=\"modal-6546\"]/div/div/footer/div[2]/button"), 1);
	 submitbutton.click();
	
	driver.close();
	
	 }

@Test
public void partners( ) {
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe" );
	 ChromeOptions options=new ChromeOptions();
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.nopcommerce.com/en");
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 WebElement partners=driver.findElement(By.xpath("//span[text()='Partners']"));
	 partners.click();
	 
	
	WebElement solution =driver.findElement(By.xpath("//div[@class='parnter-content']//a[text()='Solution partners']"));
	String s =solution.getText();
	System.out.println(s);
	
	List <WebElement> sol_list=driver.findElements(By.xpath("//div[@class='parnter-box solution-partner']"));
	int size=sol_list.size();
	System.out.println(size);
	
	for(WebElement each_element :sol_list) {
		System.out.println(each_element.getText());
	}
	driver.close();
	
}

@Test
public void partners1() {
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe" );
	 ChromeOptions options=new ChromeOptions();
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.nopcommerce.com/en");
	 driver.manage().window().maximize();
	 //implicitwait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 WebElement partners=driver.findElement(By.xpath("//span[text()='Partners']"));
	 partners.click();
	 

		WebElement line1 =driver.findElement(By.xpath("//span[text()='Online stores for SMB']"));
		String a =line1.getText();
		System.out.println(a);
		
		WebElement line2 =driver.findElement(By.xpath("//span[text()='Large retail and multi-store']"));
		String  b=line2.getText();
		System.out.println(b);
		
		WebElement line3 =driver.findElement(By.xpath("//div//span[text()='B2B multi-vendor marketplace']"));
		String c =line3.getText();
		System.out.println(c);
		
		WebElement line4 =driver.findElement(By.xpath("//div//span[text()='Store integration with third-party services']"));
		String d =line4.getText();
		System.out.println(d);
		
		WebElement line5 =driver.findElement(By.xpath("//div//span[text()='Marketing services: SEO, SMM, advertising, content']"));
		String e =line5.getText();
		System.out.println(e);
		
		WebElement line6 =driver.findElement(By.xpath("//div//span[text()='Technical support and consulting']"));
		String f =line6.getText();
		System.out.println(f);
		driver.close();
}


      @Test
      public void J_EX() {
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.nopcommerce.com/en");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().fullscreen();
		WebElement getstarted=driver.findElement(By.xpath("//div[@class='home-banner-button']//a[text()='Get started']"));
		JavascriptExecutor jsdriver=(JavascriptExecutor) driver;
		
		//jsdriver.executeScript("arguments[0].background-color: #e4434b;",getstarted);
		jsdriver.executeScript("arguments[0].click()",getstarted );
		
		
		driver.manage().window().fullscreen();
		//jsdriver.executeScript("window.scrollBy(0,150");
		driver.close();
		
	}
      @Test
      public void practiceListOfLinks() throws InterruptedException {
    	  System.setProperty("webdriver.chrome.driver","C:\\\\Chromedriver\\\\chromedriver.exe");
    	  ChromeOptions options=new ChromeOptions();
    	  WebDriver driver=new ChromeDriver();
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
    	  Actions act=new Actions(driver);
    	  driver.navigate().to("https://www.nopcommerce.com/en");
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  driver.manage().window().fullscreen();

    	  WebElement partners=driver.findElement(By.xpath("//span[text()='Partners']"));
    	  partners.click();
    	
    	  js.executeScript("window.scrollTo(0,1600)" );
    	  Thread.sleep(2000);


    	  WebElement viewhostingpartnerbutton=driver.findElement(By.xpath("//a[text()='View hosting partners']"));
    	  viewhostingpartnerbutton.click();
    	 
    	  List <WebElement>hostingpartners=driver.findElements(By.xpath("//div[@class='page-description']//ul"));

    	 System.out.println("number of WebElements are:"+hostingpartners.size());
    	 for(WebElement eachElement: hostingpartners ) {
    		 System.out.println(eachElement.getText());
    		 System.out.println(eachElement.getSize());
    	 }
    	  driver.close();
      }
      @Test
      public void practice1()   {
    	  System.setProperty("webdriver.chrome.driver","C:\\\\Chromedriver\\\\chromedriver.exe");
    	  ChromeOptions options=new ChromeOptions();
    	  WebDriver driver=new ChromeDriver();


    	  driver.navigate().to("https://www.planethoster.com/en/World-Hosting\n");
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    	  driver.manage().window().fullscreen();

    	  WebElement trustpilotiframe=driver.findElement(By.xpath("//iframe[contains(@title,'Customer reviews')]"));
    	  driver.switchTo().frame(trustpilotiframe);

    	  WebElement logoOfTrustpilot= driver.findElement(By.id("trustpilotLogo"));
    	  String text=logoOfTrustpilot.getText();
    	  System.out.println(text);
    	  driver.close();
      }
      
      @Test
      public void practice10()   {
    	  System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
    	  ChromeOptions options=new ChromeOptions();
    	  WebDriver driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	  driver.get("https://the-internet.herokuapp.com/windows");
    	  
    	  String parentWindowHandle=driver.getWindowHandle();
       
        		
    	  WebElement clickHerebutton=driver.findElement(By.linkText("Click Here"));
    	  clickHerebutton.click();
    	  
    	  Set<String> ourHandles=driver.getWindowHandles();
    	  Iterator<String> items=ourHandles.iterator();
    	  
    	  while(items.hasNext()) {
    		  
    		  String  childWindowHadle=items.next().trim();
    		  if(!parentWindowHandle.trim().equalsIgnoreCase(childWindowHadle));
    		  {
    			 
    			  driver.switchTo().window(childWindowHadle);
    		      WebElement h3=driver.findElement(By.xpath("//h3"));
    			  String ofH3=h3.getText();
    			  System.out.println(ofH3);
    			  
    			  
    		  }
    	  }
    	 driver.switchTo().window(parentWindowHandle);
          driver.quit();
}
      @Test
      public void BrokenLinks() throws Exception {
    	  System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
    	  ChromeOptions options=new ChromeOptions();
    	  WebDriver driver=new ChromeDriver();
    	  
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	  
		  driver.get("http://www.deadlinkcity.com/");
		  
		  List <WebElement> linkList=driver.findElements(By.tagName("a"));
		  
		  int resCode=200;//2xx esponse code is valid link
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
		  
	}
    	/*
    	  driver.get("https://demo.guru99.com/selenium/newtours/");
    	  driver.manage().window().maximize();
    	  //finding all the links on page
    	  List <WebElement> all_links=driver.findElements(By.tagName("a"));
    	  
    	  //iterator over all_links one by one
    	  for(int i=0;i<all_links.size();i++)
    	  {
    		  WebElement link_url=all_links.get(i);
    		  String url=link_url.getAttribute("href");
    		  
    		  URL link=new URL(url);
    		  HttpsURLConnection connection=((HttpsURLConnection) link.openConnection());
    		  int responsecode=connection.getResponseCode();
    		  
    		  if(responsecode>=400)
    		  {
    			  System.out.println("Broken Link :"+ link.getPath());
    			  
    		  }
    		  else 
    		  {
    			  System.out.println("working link:"+link.getPath());
    		  }
			 

    	  }
    	  
    		 driver.quit() ;*/
                               
      
      @Test
      public void javascriptExecutor() {
    	  System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
    	  ChromeOptions options=new ChromeOptions();
    	  WebDriver driver=new ChromeDriver();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    	 // driver.manage().window().maximize();
           driver.get("https://www.google.com/");
           WebElement q=driver.findElement(By.name("q"));
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("arguments[0].click()",q);
        //   String  title= js.executeScript("returndocument.title;").toString();  
        //   System.out.println(title);
          // js.executeScript("alert('hello world');");
          String s=  (String) js.executeScript("returndocument.title;",toString());
          System.out.println(s);
           driver.quit();  
      }
      
      @Test
      public void gettingAttributesOfelement() {
    	  System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
    	  ChromeOptions options=new ChromeOptions();
    	  WebDriver driver=new ChromeDriver();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  driver.manage().window().maximize();
    	  driver.get("https://www.google.com/");
    	  String googlewindowhandle=driver.getWindowHandle();
    	  System.out.println(googlewindowhandle);
    	  WebElement googlesearchbox=driver.findElement(By.name("q"));
    	   googlesearchbox.sendKeys("selenium");
    	  String attribute=driver.switchTo().activeElement().getAttribute("name");
    	  String attribute1=driver.switchTo().activeElement().getCssValue("color");
    	  String attribute2=driver.switchTo().activeElement().getText();
    	  System.out.println("attributes are:"+attribute+ " /"  +attribute1+ "/ " +attribute2);
    	   
    	  driver.close();
    	  
      }
      @Test
  	public void letsKodeitPractice() throws InterruptedException {
  		 System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
   	  ChromeOptions options=new ChromeOptions();
   	  WebDriver driver=new ChromeDriver();
   	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	 // driver.manage().window().maximize();
   	  driver.get("https://courses.letskodeit.com/practice");
   	
  	  
   	 WebElement radiobutton=driver.findElement(By.id("bmwradio"));
   	 radiobutton.click();
   	 WebElement brands=driver.findElement(By.id("multiple-select-example"));
   	 brands.click();
   	 Select slt=new Select (brands);
   	 slt.selectByVisibleText("Apple");
   	 WebElement checkboxBmw=driver.findElement(By.xpath("//input[@id='bmwcheck']"));
   	 checkboxBmw.click();
   	 WebElement windowbutton=driver.findElement(By.xpath("//div[@class='block large-row-spacer yummy'][1]"));
   	 JavascriptExecutor js=(JavascriptExecutor)driver;
   	  js.executeScript("arguments[0].click();",windowbutton);
   	 String parentwindohandle=driver.getWindowHandle();
   
   	 Set<String> parentwindohandles=driver.getWindowHandles();
   	 Iterator<String> s=parentwindohandles.iterator();
   	 while(s.hasNext())//i hav windows or not
   		 {
   		String title= driver.getTitle();
   		if(title=="Facebook") {
   			driver.switchTo().window(s.next());
   		}
   		 //check for window title
   		 //match for both titles expected and actual
   		 String childwindowhandle=s.next();
   		 if(parentwindohandle!=childwindowhandle) {
   			 driver.switchTo().window(childwindowhandle);
   			 
   			// WebElement categories=driver.findElement(By.name("categories"));
   			// categories.click();
   			// Select se=new Select(categories);
   			// se.selectByValue("1606");
   			 
   			 
   			WebElement openwindow=driver.findElement(By.xpath("//fieldset//button[@id='openwindow']"));
   	   	 openwindow.click();
   			 
   			 
   		 }
   	 }
   	 driver.switchTo().window(parentwindohandle);
   	 WebElement inputname=driver.findElement(By.id("name"));
   	 inputname.click();
   	 inputname.sendKeys("zeba");

   //	 WebElement alertbtn=driver.findElement(By.name("alertbtn"));
  // 	 alertbtn.click();
 //  	 Alert alt=driver.switchTo().alert();
 //  	 alt.accept();
   	 driver.switchTo().window(parentwindohandle);	 
      }		
}  


    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      

