package AutomationPackage;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@SuppressWarnings("deprecation")
public class CreateNewAlert {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
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

		driver.findElement(By.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), 'Intermountain Healthcare 6397')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='alert-config-nav']/a[3]")).click();
		Thread.sleep(5000);

		int i;
		
		for(i=4; i<=10; i++){
		
		driver.findElement(By.xpath("//*[@id='alert-settings-sort']/a")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[1]/div/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[1]/div/ul/li/a[contains(text(), 'R_1')]")).click();

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[2]/div/a")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[2]/div/ul/li/a[contains(text(), 'Digital')]")).click();


		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[3]/input")).sendKeys("Test" + i);


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
		
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[10]/textarea")).sendKeys("Test" + i);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/section/button")).click();
		
		Thread.sleep(15000);
			
		}
		
		
		System.out.println("Finished successfully");
		
	}

}
