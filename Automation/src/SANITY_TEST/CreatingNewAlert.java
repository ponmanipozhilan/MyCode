package SANITY_TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreatingNewAlert {



	public static void CreateNewAlert(String[] a) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(a[0]);
		
		//Login
		driver.findElement(By.id("cred_userid_inputtext")).sendKeys(a[1]);
		Thread.sleep(2000);
		driver.findElement(By.id("cred_password_inputtext")).sendKeys(a[2]);
		Thread.sleep(2000);
		driver.findElement(By.id("cred_sign_in_button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		//Clicking on Buildings Tab
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='main-nav']/ul/li[2]/a")));

		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[2]/a")).click();
		
		//Clicking on the Building
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '"
						+ a[3] + "')]")));

		driver.findElement(By.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '"
						+ a[3] + "')]")).click();
        
		//Clicking on Settings page
		WebDriverWait wait2 = new WebDriverWait(driver, 3);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='alert-config-nav']/a[3]")));

		driver.findElement(By.xpath("//*[@id='alert-config-nav']/a[3]")).click();
		Thread.sleep(5000);

		//int i;
		
		//for(i=19; i<=19; i++){
		
		//Clicking on Add New Alert button
		driver.findElement(By.xpath("//*[@id='alert-settings-sort']/a")).click();
		//Clicking on RTU name field
		WebDriverWait wait3 = new WebDriverWait(driver, 15);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='add-alert-container']/section/div[1]/div/a")));
        		
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[1]/div/a")).click();
		
		//Selecting the RTU
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='add-alert-container']/section/div[1]/div/ul/li/a[contains(text(), '"
						+ a[4] + "')]")));
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[1]/div/ul/li/a[contains(text(), '"
						+ a[4] + "')]")).click();
        Thread.sleep(5000);
        
      //Clicking on Alert type field
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[2]/div/a")).click();
		
		//Selecting the Alert type
		WebDriverWait wait5 = new WebDriverWait(driver, 5);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='add-alert-container']/section/div[2]/div/ul/li/a[contains(text(), '"
						+ a[5] + "')]")));

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[2]/div/ul/li/a[contains(text(), '"
						+ a[5] + "')]")).click();

        //Entering Alert name
		String Alertname = a[6];
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[3]/input")).sendKeys(Alertname);

        //Clicking on Priority field
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[4]/div/a")).click();
		Thread.sleep(3000);
        //Selecting the Priority
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[4]/div/ul/li/a[contains(text(), '"
						+ a[7] + "')]")).click();
        //Clicking on Point name field
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[5]/div/a")).click();
		//Selecting the Point name
		WebDriverWait wait6 = new WebDriverWait(driver, 5);
		wait6.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='add-alert-container']/section/div[5]/div/ul/li/a[contains(text(), '"
						+ a[8] + "')]")));
       
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[5]/div/ul/li/a[contains(text(), '"
						+ a[8] + "')]")).click();

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[6]/input")).clear();
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[6]/input")).sendKeys("2");

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[7]/div/div")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[7]/div/ul/li/a[contains(text(), '"
						+ a[9] + "')]")).click();
		//String Alert = "Test"+i;
		
		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/div[10]/textarea")).sendKeys(Alertname);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='add-alert-container']/section/section/button")).click();
		
		WebDriverWait wait12 = new WebDriverWait(driver, 50);
		wait12.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), '"
						+ Alertname + "')]")));		
		
		String AlertName = driver.findElement(By.xpath("//*[@id='alert-settings-list']/ul/li/div/div/article/dl[1]/dt/a[contains(text(), '"
						+ Alertname + "')]")).getText();
		
		System.out.println("Alert Name is"+ AlertName);
		
		//Assert.assertEquals(Alertname, AlertName);

		System.out.println("Alert Configuration created successfully");
		
		Thread.sleep(180000);
		
		//Finding Alerts in Active Alerts page
		WebDriverWait wait7 = new WebDriverWait(driver, 5);
		wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='alert-config-nav']/a[1]")));
       
		driver.findElement(By.xpath("//*[@id='alert-config-nav']/a[1]")).click();
		
		WebDriverWait wait8 = new WebDriverWait(driver, 60);
		wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-body']/section/ul/li/article/div[1]/a[2][contains(text(), '"
						+ Alertname + "')]")));
       
		driver.findElement(By.xpath("//*[@id='main-body']/section/ul/li/article/div[1]/a[2][contains(text(), '"
						+ Alertname + "')]"));
		
		System.out.println("Alert found sucessfully in Active Alerts page");
		
		//Finding Alerts in Alert logs page
		
		WebDriverWait wait9 = new WebDriverWait(driver, 20);
		wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='alert-config-nav']/a[2]")));
		
		driver.findElement(By.xpath("//*[@id='alert-config-nav']/a[2]")).click();
		
		WebDriverWait wait10 = new WebDriverWait(driver, 30);
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='alert-log-filter-container']/div[4]/div[3]/label")));
		
		driver.findElement(By.xpath("//*[@id='alert-log-filter-container']/div[4]/div[3]/label")).click();
		
		WebDriverWait wait11 = new WebDriverWait(driver, 30);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-body']/section/ul/li/article/div[1]/a[2][contains(text(), '"
						+ Alertname + "')]")));
       
		String AlertNameInLog = driver.findElement(By.xpath("//*[@id='main-body']/section/ul/li/article/div[1]/a[2][contains(text(), '"
						+ Alertname + "')]")).getText();
		
		Assert.assertEquals(Alertname, AlertNameInLog);
		
		System.out.println("Alert found sucessfully in Alert logs page");
			
		
		driver.quit();
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
	}

