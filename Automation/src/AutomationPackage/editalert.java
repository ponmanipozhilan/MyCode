package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class editalert {

	@Test(dataProviderClass = TestDataAlert.class, dataProvider = "logindataAlert")
	public void editalerttesting(String url, String username, String password, String BuildingName, String RTUname, String AlertType, String CreateAlert, String Priority, String PointName, String limit, String editalert) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.findElement(By.id("cred_userid_inputtext")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("cred_password_inputtext")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("cred_sign_in_button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='main-nav']/ul/li[2]/a")));
		
		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[2]/a")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '"
						+ BuildingName + "')]")));

		driver.findElement(By.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '"
						+ BuildingName + "')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='alert-config-nav']/a[3]")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), '"
						+ CreateAlert + "')]")));
		
		System.out.println(RTUname);
		System.out.println(AlertType);
				
		driver.findElement(By.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), '"
						+ CreateAlert + "')]")).click();
		
	
		WebDriverWait wait4 = new WebDriverWait(driver, 15);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='alert-setting-details-container']/header/div/a[1]")));
		
		System.out.println(Priority);
		System.out.println(PointName);
		System.out.println(limit);
		
		driver.findElement(By.xpath("//*[@id='alert-setting-details-container']/header/div/a[1]")).click();
		
		Thread.sleep(25000);
		
		//WebDriverWait wait5 = new WebDriverWait(driver, 50);
		//wait5.until(ExpectedConditions.visibilityOfElementLocated(By
			//	.xpath("//*[@id='edit-alert-settings-details']/section/div[3]/input")));
		
		driver.findElement(By.xpath("//*[@id='edit-alert-settings-details']/section/div[3]/input")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='edit-alert-settings-details']/section/div[3]/input")).sendKeys(editalert);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='edit-alert-settings-details']/section/div[10]/textarea")).clear();
		
		driver.findElement(By.xpath("//*[@id='edit-alert-settings-details']/section/div[10]/textarea")).sendKeys(editalert);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='edit-alert-settings-details']/section/section/button")).click();
		Thread.sleep(2000);
		
		WebDriverWait wait6 = new WebDriverWait(driver, 10);
		wait6.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='alert-config-nav']/a[3]")));
		driver.findElement(By.xpath("//*[@id='alert-config-nav']/a[3]")).click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 20);
		wait7.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), '"
						+ editalert + "')]")));
		
		String NewAlertName = driver.findElement(By.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), '"
						+ editalert + "')]")).getText();
		
		System.out.println(NewAlertName);
		
		Assert.assertEquals(editalert, NewAlertName);
		
			

	}

}
