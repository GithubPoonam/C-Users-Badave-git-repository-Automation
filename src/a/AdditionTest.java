package a;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AdditionTest {
	 
		  
	  @Test
	  public void Addition() {
		  System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\ChromeDriver.exe");
			WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
			
				driver.get(" https://www.calculator.net/");
		  
		  driver.findElement(By.xpath("//span[text()='±']")).click();
		  driver.findElement(By.xpath("//span[text()='2']")).click();
			driver.findElement(By.xpath("//span[text()='3']")).click();
			driver.findElement(By.xpath("//span[text()='4']")).click();	
			driver.findElement(By.xpath("//span[text()='2']")).click();
			driver.findElement(By.xpath("//span[text()='3']")).click();
			driver.findElement(By.xpath("//span[text()='4']")).click();	
			driver.findElement(By.xpath("//span[text()='+']")).click();
			driver.findElement(By.xpath("//span[text()='3']")).click();
			driver.findElement(By.xpath("//span[text()='4']")).click();
			driver.findElement(By.xpath("//span[text()='5']")).click();	
			driver.findElement(By.xpath("//span[text()='3']")).click();
			driver.findElement(By.xpath("//span[text()='4']")).click();
			driver.findElement(By.xpath("//span[text()='5']")).click();	
			driver.findElement(By.xpath("//span[text()='=']")).click();
			//Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[text()='Ans']")).click();
			//Thread.sleep(3000);
			String element = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
			
		try {
			int actualVal = Integer.parseInt(element);
			int exp_result=111111;
			Assert.assertEquals(actualVal, exp_result);
		}
		catch(NumberFormatException e){}
			
			driver.close();
	     
	  
	  }

	 
}
