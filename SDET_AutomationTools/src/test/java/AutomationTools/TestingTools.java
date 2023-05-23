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

public class TestingTools 
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
		WebElement element=driver.findElement(By.xpath("//div[contains(@class,'I506P IFnjPb')]"));
		List<WebElement>elements=element.findElements(By.xpath("//div[contains(@class,'sinMW')]"));

		System.out.println(elements.size());
		
/*		for(WebElement e:elements)
		{
			String text=e.getText();
			System.out.println(text);
			element.click();
			Thread.sleep(2000);	
			
			WebElement e1=driver.findElement(By.xpath("//div[@class='nfUtB PZPZlf hb8SAc']"));
		}
		*/
		WebElement q;
		//div[@class='I506P IFnjPb']
		for(int i=0;i<=elements.size()-1;i++)
		{
			q=elements.get(i);	
			System.out.println(q.getText());
//			String titleText=driver.findElement(By.xpath("//div[@class='sinMW']")).getText();
//			System.out.println(titleText);
			
			
//			driver.findElement(By.xpath("//div[@class='Rw802b']")).click();


		}
		
		
	}
}
