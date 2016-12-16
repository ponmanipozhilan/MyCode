package AutomationPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MultipleTestCases {

	public WebDriver driver;
	
		
	@BeforeMethod
	public void setup() throws InterruptedException{
		
		System.out.println("Before Method called");

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
        driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datdev.test-lcbs.honeywell.com");
		
		driver.findElement(By.id("cred_userid_inputtext")).sendKeys("dcontractor37@datdev.lcbsconnect.com");
		Thread.sleep(2000);
		driver.findElement(By.id("cred_password_inputtext")).sendKeys("lcbs@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("cred_sign_in_button")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[2]/a")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), 'Brinkers Jewelers 7300')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='alert-config-nav']/a[3]")).click();
		Thread.sleep(5000);
	}
	
		
	
	@Test(priority=1)
	public void AlertTesting() throws InterruptedException {
		
		System.out.println("Add test called");

				
		driver.findElement(By.xpath("//*[@id='alert-settings-sort']/a")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[1]/div/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[1]/div/ul/li/a[contains(text(), 'RTU11')]")).click();

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[2]/div/a")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[2]/div/ul/li/a[contains(text(), 'Digital')]")).click();


		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[3]/input")).sendKeys("creating");

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[4]/div/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[4]/div/ul/li/a[contains(text(), 'High')]")).click();

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[5]/div/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[5]/div/ul/li/a[contains(text(), 'Dirty Filter')]")).click();

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[6]/input")).clear();
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[6]/input")).sendKeys("2");

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[7]/div/div")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[7]/div/ul/li/a[contains(text(), '0-Normally Closed')]")).click();
		
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[10]/textarea")).sendKeys("Test");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/section/button")).click();
		
		Thread.sleep(40000);
		String AA = driver.findElement(By.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), 'creating')]")).getText();
		
		Assert.assertEquals("creating", AA);
		
		System.out.println("Created alert configuration successfully");
		}
	
	@Test(priority=2)
	public void DeleteTesting() throws InterruptedException {
        	
		System.out.println("Delete test called");
		
		driver.findElement(By.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), 'creating')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='alert-setting-details-container']/header/div/a[2]")).click();
		
		driver.findElement(By.xpath("html/body/div[5]/div/div/div/div[3]/button")).click();
		
		Thread.sleep(50000);
		
        String BB = driver.findElement(By.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), 'creating')]")).getText();
		
        Assert.assertNotEquals("creating", BB);
		
        System.out.println("Alert configuration deleted successfully");
			
		
	}
	
	@AfterMethod
	public void AfterTest(){
		
		
		driver.quit();
		System.out.println("Browser closed successfully");
		
	}
	

}
