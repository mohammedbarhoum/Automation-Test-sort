import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autong {
 
	public WebDriver driver1;
	
	public WebDriver driver2;
	
	public WebDriver driver3;
	
	
	@BeforeTest
	
	public void Login() {
		
		WebDriverManager.edgedriver().setup();
	
		driver1= new EdgeDriver();
		
		
		
		
		
		driver1.get("https://github.com/login");
		
		driver1.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("mohammedbarhoum777@gmial.com");
		driver1.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mohammed12345$");
		driver1.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[11]")).click();
		
	}
	@Test()
	
	public void Test_Title()
	{
		String ActualTitleName =driver1.getTitle();
		 String ExpectedTittle="Gethub";
		
		Assert.assertEquals("ActualTitleName", "ExpectedTittle");
		
	}
	@Test()
	
	public void Test_Login()
	{
		System.out.println("");
		
		
	
	}
	}
	
	
	
	

