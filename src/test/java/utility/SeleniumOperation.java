package utility;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperation
{
	public static WebDriver driver=null;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	 public static Hashtable<String,Object> browserLaunch(Object[] inputParameters)
	 {
		 try{
		 String bname=(String) inputParameters[0];
		 String exe=(String) inputParameters[1];
		 
		 if(bname.equalsIgnoreCase("Chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", exe);
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
		 }else if(bname.equalsIgnoreCase("fireFox"))
		 {
			 System.setProperty("webdriver.gecko.driver", exe);
			  driver=new FirefoxDriver();			 
		 }
		 outputParameters.put("STATUS", "PASS");
		 outputParameters.put("MESSAGE", "methodUsed: browserLaunch, Test_Data :" + inputParameters[1].toString() );
		 
		 }catch(Exception e)
		 {
			 outputParameters.put("STATUS", "FAIL");
			 outputParameters.put("MESSAGE", "methodUsed: browserLaunch, Test_Data :" + inputParameters[1].toString() );
		 }
		 
		 return outputParameters;
		 
	 }
	
	

	 public static Hashtable<String,Object> openApplication(Object[] inputParameters)
	 {
		 try{
		 String url=(String) inputParameters[0];
		
		 
		 driver.get(url);
		 
		 outputParameters.put("STATUS", "PASS");
		 outputParameters.put("MESSAGE", "methodUsed: openApplication, Test_Data :" + inputParameters[0].toString() );
		 
		 }catch(Exception e)
		 {
			 outputParameters.put("STATUS", "FAIL");
			 outputParameters.put("MESSAGE", "methodUsed: openApplication, Test_Data :" + inputParameters[1].toString() );
		 }
		 
		 return outputParameters;
		 
	 }
	
	
	 public static Hashtable<String,Object> clickOnElement(Object[] inputParameters)
	  	{
	  		try{
	  		String xpath=(String)inputParameters[0];	
	  		driver.findElement(By.xpath(xpath)).click();
	  		
	  		Thread.sleep(5000);
	  		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  		 
	  		 outputParameters.put("STATUS", "PASS");
	  	  	 outputParameters.put("MESSAGE", "Action:click,Input Given: " +inputParameters[0].toString() );
	  		}catch(Exception e)
	  		{
	  			 outputParameters.put("STATUS", "FAIL");
	  	  	  	 outputParameters.put("MESSAGE", "Action:click,Input Given: " +inputParameters[0].toString() );
	  		}
	  		return outputParameters;
	  	}
	 
	 public static Hashtable<String,Object> sendKey(Object[] inputParameters)
	 {
		 try{
		 String xpath1=(String)inputParameters[0];
		String value1=(String)inputParameters[1];
  		
		driver.findElement(By.xpath(xpath1)).sendKeys(value1);
		
		outputParameters.put("STATUS", "PASS");
		 outputParameters.put("MESSAGE", "methodUsed:sendKey, Test_Data :" + inputParameters[1].toString());
		 }catch(Exception e)
		 {
			 outputParameters.put("STATUS", "FAIL");
			 outputParameters.put("MESSAGE", "methodUsed:sendKey, Test_Data :" + inputParameters[1].toString());
		 }
		 return outputParameters;
	 }
	 
	 public static Hashtable<String,Object> mouseOver(Object[]inputParameters)
		{
			try
			{
			String elexpath=(String)inputParameters[0];
			Actions act=new Actions(driver);
			WebElement ele=driver.findElement(By.xpath(elexpath));
			act.moveToElement(ele).build().perform();
			System.out.println("Successfully moved to given element");
			Thread.sleep(1000);
			
			outputParameters.put("STATUS", "PASS");
			 outputParameters.put("MESSAGE", "methodUsed:mouseOver, Test_Data :" + inputParameters[0].toString());
			
			}
			catch(Exception e)
			{
				 outputParameters.put("STATUS", "FAIL");
				 outputParameters.put("MESSAGE", "methodUsed:mouseOver, Test_Data :" + inputParameters[0].toString());
			}
			 return outputParameters;	
		}
	 
	 public static Hashtable<String,Object> validation(Object[] inputParameters)
	  	{
	  		try{
	  		String given=(String)inputParameters[0];
	  		String xpath=(String)inputParameters[1];	  		
	  		
	  		String text=driver.findElement(By.xpath(xpath)).getText();
	  		
	  		System.out.println(text);
	  		System.out.println(given);
	  		if(text.equalsIgnoreCase(given))
	  		{
	  			 outputParameters.put("STATUS", "PASS");
				 outputParameters.put("MESSAGE", "methodUsed:validation, Test_Data :" + inputParameters[0].toString());
	  			
	  		}else
	  		{
	  			
	  			outputParameters.put("STATUS", "FAIL");
				 outputParameters.put("MESSAGE", "methodUsed:validation, Test_Data :" + inputParameters[0].toString());
	  		
	  		}
	  		}catch(Exception e)
			 {
	  			outputParameters.put("STATUS", "FAIL");
				 outputParameters.put("MESSAGE", "methodUsed:validation, Test_Data :" + inputParameters[0].toString());
			 }
	  		 return outputParameters;
}}
