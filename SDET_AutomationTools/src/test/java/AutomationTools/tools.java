package AutomationTools;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class tools
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
	public void searchAutomationTestingtool()
	{
		driver.findElement(By.id("APjFqb")).sendKeys("Automation Testing Tool",Keys.ENTER);
		WebElement element=driver.findElement(By.xpath("//div[@class='jdsrEf hhv4Fb']"));
		List<WebElement>elements=element.findElements(By.xpath("(//div[@class='sinMW'])"));
		System.out.println(elements.size());
		
		for(int i=0;i<=elements.size()-1;i++)
		{
			driver.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[1]/div[2]/div/div/div/div/div[3]/div["+i+"]")).click();
			String text=driver.findElement(By.xpath("(//div[@class='I506P IFnjPb'])["+i+"]")).getText();
			System.out.println(text);
			
			String description=driver.findElement(By.xpath("(//div[@data-attrid='description'])["+i+"]")).getText();
			System.out.println(description);
			
			WebElement logo=driver.findElement(By.xpath("(//div[@class='duOqab'])["+i+"]"));
			Assert.assertEquals(true, logo.isDisplayed());
			System.out.println(logo.isDisplayed());
			
	
			
//			driver.navigate().back();
			
		}
		
	}
	
}
