package PropretiesFileDome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
   //properties class variable  for reading proerties from properties file
	Properties properties;
	
	//path of config data stored in project config.properties
	String path="C:\\Users\\mdjav\\eclipse-workspace\\seleniumAutomationProject\\src\\test\\java\\PropretiesFileDome\\Config.properties";
	 
	//creaing constructor to load confic file 
	public ReadConfigFile() 
	{
		//initialising this properties var here
		properties=new Properties();
		//load the this path through fileinputStream obj
		try {
			FileInputStream fis=new FileInputStream(path);
			//load this file
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getURL()
	{
	   String url=properties.getProperty("url");	
		if(url!=null)
			return url;
		else
			throw new RuntimeException("url not specified in conig file");
	}
	
	public String getUsername()
	{
	   String username=properties.getProperty("username");	
		if(username!=null)
			return username;
		else
			throw new RuntimeException("username not specified in conig file");
	}
	public String getPassword()
	{
	   String password=properties.getProperty("password");	
		if(password!=null)
			return password;
		else
			throw new RuntimeException("password not specified in conig file");
	}	
		
}
