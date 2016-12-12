package AutomationPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddCompany {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://atqa.testqa-lcbs.honeywell.com");
		
		driver.findElement(By.id("cred_userid_inputtext")).sendKeys("JSmith1@atqa.lcbsconnect.com");
		Thread.sleep(2000);
		driver.findElement(By.id("cred_password_inputtext")).sendKeys("lcbs@123");
		Thread.sleep(2000);
		driver.findElement(By.id("cred_sign_in_button")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[2]/a")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), 'Shinola South store')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='alert-config-nav']/a[3]")).click();
		Thread.sleep(5000);

		
		
		System.out.println("Add Company Process Finished successfully 2");
		
	}

}
