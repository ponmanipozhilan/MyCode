package SANITY_TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EditingAlert {


	public static void EditAlert(String[] a) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get(a[0]);
				
				driver.findElement(By.id("cred_userid_inputtext")).sendKeys(a[1]);
				Thread.sleep(2000);
				driver.findElement(By.id("cred_password_inputtext")).sendKeys(a[2]);
				Thread.sleep(2000);
				driver.findElement(By.id("cred_sign_in_button")).click();
				WebDriverWait wait = new WebDriverWait(driver, 50);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[@id='main-nav']/ul/li[2]/a")));
				
				driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[2]/a")).click();
				WebDriverWait wait1 = new WebDriverWait(driver, 50);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '"
								+ a[3] + "')]")));

				driver.findElement(By.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '"
								+ a[3] + "')]")).click();
				Thread.sleep(3000);

				driver.findElement(By.xpath(".//*[@id='alert-config-nav']/a[3]")).click();
				
				System.out.println(a[4]);
				System.out.println(a[5]);
				
				WebDriverWait wait2 = new WebDriverWait(driver, 40);
				wait2.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), '"
								+ a[6] + "')]")));
							
				driver.findElement(By.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), '"
								+ a[6] + "')]")).click();
				
			
				WebDriverWait wait4 = new WebDriverWait(driver, 25);
				wait4.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[@id='alert-setting-details-container']/header/div/a[1]")));
				
				System.out.println(a[7]);
				System.out.println(a[8]);
				System.out.println(a[9]);
				
				
				driver.findElement(By.xpath("//*[@id='alert-setting-details-container']/header/div/a[1]")).click();
				
				Thread.sleep(25000);
				
				//WebDriverWait wait5 = new WebDriverWait(driver, 50);
				//wait5.until(ExpectedConditions.visibilityOfElementLocated(By
					//	.xpath("//*[@id='edit-alert-settings-details']/section/div[3]/input")));
						
				driver.findElement(By.xpath("//*[@id='edit-alert-settings-details']/section/div[3]/input")).clear();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath(".//*[@id='edit-alert-settings-details']/section/div[3]/input")).sendKeys(a[10]);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='edit-alert-settings-details']/section/div[10]/textarea")).clear();
				
				driver.findElement(By.xpath("//*[@id='edit-alert-settings-details']/section/div[10]/textarea")).sendKeys(a[10]);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='edit-alert-settings-details']/section/section/button")).click();
				Thread.sleep(2000);
				
				WebDriverWait wait6 = new WebDriverWait(driver, 40);
				wait6.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[@id='alert-config-nav']/a[3]")));
				driver.findElement(By.xpath("//*[@id='alert-config-nav']/a[3]")).click();
				
				WebDriverWait wait8 = new WebDriverWait(driver, 40);
				wait8.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[@id='alert-settings-filter-container']/div[4]/div[3]/label")));
				
				driver.findElement(By.xpath("//*[@id='alert-settings-filter-container']/div[4]/div[3]/label")).click();
				
				Thread.sleep(2000);
				
				WebDriverWait wait7 = new WebDriverWait(driver, 40);
				wait7.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), '"
								+ a[10] + "')]")));
				
				String NewAlertName = driver.findElement(By.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), '"
								+ a[10] + "')]")).getText();
				
				System.out.println("New Alert name is"+ NewAlertName);
				
				Assert.assertEquals(a[10], NewAlertName);
				
				System.out.println("Alert Configuration edited successfully");
				
		        driver.quit();		
		
		
		
		
	}

	

}
