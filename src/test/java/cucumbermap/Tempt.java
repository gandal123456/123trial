package cucumbermap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{

	 public static void main(String[]args)
	  {
		  System.setProperty("webdriver.chrome.driver", "G:\\Automation Support\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  //openApp
		  driver.get("https://www.flipkart.com/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //click on cancel
		  driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		  //navigate on login
		  Actions act=new Actions(driver);
		  WebElement to=driver.findElement(By.xpath("//*[@class='_28p97w']"));
		  act.moveToElement(to).build().perform();
		  //click on My Profile
		  WebElement to1=driver.findElement(By.xpath("//*[text()='My Profile']"));
		  act.click(to1).build().perform();
		  //enter email
		  driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]")).sendKeys("aniket9497@gmail.com");
		  //enter password
		  driver.findElement(By.xpath("//*[@type='password']")).sendKeys("aniket97");
		  //click on login
		  driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		  //click on manage address
		  driver.findElement(By.xpath("//*[text()='Manage Addresses']")).click();
		  //click on add new address
		  driver.findElement(By.xpath("//*[@class='_1QhEVk']")).click();
		  //name
		  driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Aniket Deshmukh");
		  //mobile number
		  driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9890935583");
		  //pincode
		  driver.findElement(By.xpath("//*[@name='pincode']")).sendKeys("422003");
		  //locality
		  driver.findElement(By.xpath("//*[@name='addressLine2']")).sendKeys("Panchavati");
		  //address
		  driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("Flat No=5, Shree Samartha Appt, Damodar Nagar,Opposite Rajlaxmi Bank, Hirawadi Road");
		  //select Home
		  driver.findElement(By.xpath("(//*[@class='_1XFPmK'])[1]")).click();
		  //click on save
		  driver.findElement(By.xpath("//*[@tabindex='10']")).click();
		

		  
		  
		  
		  
		  
		  
		  
	  }
		
		
	
	
}
