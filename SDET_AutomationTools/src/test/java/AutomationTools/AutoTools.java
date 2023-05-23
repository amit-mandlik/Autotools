package AutomationTools;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutoTools 
{
	WebDriver driver;
	@BeforeClass
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+".//driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
    }
	@Test
	public void searchAutomationTestingtool() throws Throwable 
	{
		driver.findElement(By.id("APjFqb")).sendKeys("Automation Testing Tool",Keys.ENTER);
	//	Thread.sleep(2000);
	}
	
	@Test
	public void AllToolsVerification()
	{
		WebElement element=driver.findElement(By.xpath("//div[contains(@class,'I506P IFnjPb')]"));
		List<WebElement>elements=element.findElements(By.xpath("//div[contains(@class,'sinMW')]"));
		System.out.println(elements.size());
		
		for(WebElement e:elements)
		{
	//		driver.findElement(By.xpath("//div[@class='RpqMib JL6v7b']")).click();
			String text=e.getText();
			System.out.println(text);
		}
	
	}
}
