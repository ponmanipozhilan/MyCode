package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatingNewOccupant {
	


	@Test(dataProviderClass = TestData.class, dataProvider = "logindata")
	public static void main(String url, String username, String password,
			String buildingName, String email, String phNo, String FirName, String SecName)
			throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);

		driver.findElement(By.id("cred_userid_inputtext")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("cred_password_inputtext")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("cred_sign_in_button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='main-nav']/ul/li[2]/a")));

		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[2]/a")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '"
						+ buildingName + "')]")));

		driver.findElement(
				By.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), '"
						+ buildingName + "')]")).click();
		WebDriverWait wait3 = new WebDriverWait(driver, 2);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='main-tab']/nav/a[4]")));

		driver.findElement(By.xpath("//*[@id='main-tab']/nav/a[4]")).click();
		WebDriverWait wait4 = new WebDriverWait(driver, 4);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='occupant-list-container']/header/div/a")));

		driver.findElement(
				By.xpath("//*[@id='occupant-list-container']/header/div/a"))
				.click();
		WebDriverWait wait5 = new WebDriverWait(driver, 3);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='main-body']/section/section/div[1]/input")));

		driver.findElement(
				By.xpath("//*[@id='main-body']/section/section/div[1]/input"))
				.sendKeys(email);

		driver.findElement(
				By.xpath("//*[@id='main-body']/section/section/div[2]/input"))
				.sendKeys(phNo);

		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id='main-body']/section/section/footer/button"))
				.click();

		System.out.println("Called email class");
		
		String emailid = email;
		String Firstname = FirName;
		String SecondName = SecName;
		
		
//		ArrayList<String> credentials = new ArrayList<String>();

	YOPemail.accessEmail(emailid, phNo, Firstname, SecondName);
	
//		String emailUser = null;
//		String emailPass = null;
//		if(credentials.size() >= 2 ){
//			emailUser =  credentials.get(0);
//			emailPass = credentials.get(1);
//		}
//		System.out.println("username :" + emailUser);
//		System.out.println("password :" + emailPass);


		System.out.println("Finished email class");

		Thread.sleep(5000);

		driver.navigate().refresh();

		WebDriverWait wait6 = new WebDriverWait(driver, 30);
		wait6.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[@id='occupant-list-container']/table/tbody/tr/td[contains(@class, 'email ng-binding')][contains(text(), '"
						+ emailid + "')]")));

		Thread.sleep(20000);

		String OccupantName = driver
				.findElement(
						By.xpath("//*[@id='occupant-list-container']/table/tbody/tr/td[contains(@class, 'email ng-binding')][contains(text(), '"
								+ emailid + "')]")).getText();

		System.out.println(OccupantName);

		Assert.assertEquals(emailid, OccupantName);

		System.out.println("Occupant Successfully created");

		driver.close();

	}

}
