package SANITY_TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Alertcount {

	
	public static void AlertCount(String[] a) throws InterruptedException {
		
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
		
		//Clicking on Home Tab
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-nav']/ul/li[1]/a")));

		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[1]/a")).click();
		
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
		String Bldgname = a[3];
        String RTUname = a[4];
		System.out.println(a[5]);
        
		//Finding Alert in Home page
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-content']/ul/li/a/article/section[1]/span[contains(text(), '"
						+ Bldgname + "')]/parent::section/following-sibling::section/div[1]/span")));

		String count2 = driver.findElement(By.xpath("//*[@id='main-content']/ul/li/a/article/section[1]/span[contains(text(), '"
						+ Bldgname + "')]/parent::section/following-sibling::section/div[1]/span")).getText();
		
       Integer count3 = Integer.valueOf(count2);
		
		if (count3 >=1){
			
			System.out.print("Alert found in Home page");
			
		}
		
		else {
			System.out.print("Alert not found in Home page");
		}
				
		//Alert in Buildings page
		
         WebDriverWait wait2 = new WebDriverWait(driver, 30);
		
		//Clicking on Buildings Tab
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='main-nav']/ul/li[2]/a")));

		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[2]/a")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '"	+ Bldgname + "')]")));
		Thread.sleep(5000);
		String count6 = driver.findElement(By.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '" + Bldgname + "')]/parent::article/span[2]/span[1]")).getText();
		System.out.print(count6);
		int count7 =0;
		try{
			  count7 = Integer.valueOf(count6);
		}catch (NumberFormatException e){
			System.out.println("not a number"); 
		}        
		
		if (count7 >=1){
			
			System.out.print("Alert found in Buildings page");
			
		}
		
		else {
			System.out.print("Alert not found in Buildings page");
		}
		
		//Alert in Control index page
		
		driver.findElement(By.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '"
						+ Bldgname + "')]")).click();
			
		WebDriverWait wait4 = new WebDriverWait(driver, 30);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-tab']/nav/a[2]")));
		
		driver.findElement(By.xpath("//*[@id='main-tab']/nav/a[2]")).click();
		
		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-body']/section/ul/li[4]/ul/li/a/div/div/span[contains(text(), '"
						+ RTUname + "')]")));
		Thread.sleep(5000);
		String count4 = driver.findElement(By.xpath("//*[@id='main-body']/section/ul/li[4]/ul/li/a/div/div/span[contains(text(), '"
						+ RTUname + "')]//parent::div/following-sibling::span/span")).getText();
		System.out.print(count4);
		int count5 =0;
       
        try{
			  count5 = Integer.valueOf(count4);
		}catch (NumberFormatException e){
			System.out.println("not a number"); 
		}        
		
		
		if (count5 >=1){
			
			System.out.print("Alert found in Control index page");
			
		}
		
		else {
			System.out.print("Alert not found in Control index page");
		}
			
		Assert.assertTrue(count7>=1);
		
		driver.close();
		
	
		
		
		

	}

}
