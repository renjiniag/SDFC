package BrowserUtility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contacts {

	static WebDriver driver=BrowserUtility.driver;
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//Testcase25();
		//Testcase26();
		//Testcase27();
		//Testcase28();
		//Testcase29();
		//Testcase30();
		//Testcase31();
		Testcase32();

	}
	public static void login() throws InterruptedException, FileNotFoundException, IOException {
		BrowserUtility.launchBroswer("chrome");
		driver=BrowserUtility.driver;
		System.out.println("Browser launched");		
		BrowserUtility.loginBrowser();	
	    
	}
	public static void Testcase25() throws InterruptedException, FileNotFoundException, IOException {
		    login();
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
			Thread.sleep(5000);		
			WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
			ad_btn.click();
			System.out.println("pop up is closed");
			driver.findElement(By.xpath("//input[@name='new']")).click();
			WebElement lastName=driver.findElement(By.id("name_lastcon2"));
			wait.until(ExpectedConditions.visibilityOfAllElements(lastName));
			lastName.sendKeys("ABCDE");
			driver.findElement(By.id("con4")).sendKeys("TekArchParent");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
						
	}
	public static void Testcase26() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		WebElement name=driver.findElement(By.id("fname"));
		wait.until(ExpectedConditions.visibilityOfAllElements(name));
		name.sendKeys("View1234");
		Thread.sleep(3000);
		driver.findElement(By.id("devname")).click();
		driver.findElement(By.id("devname")).clear();
		driver.findElement(By.id("devname")).sendKeys("Unique1234");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		
	}
	public static void Testcase27() throws InterruptedException, FileNotFoundException, IOException {
		login();
		//WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		WebElement select=driver.findElement(By.id("hotlist_mode"));
		Select recentlyCreated=new Select(select);
		recentlyCreated.selectByVisibleText("Recently Created");
		
	}
	public static void Testcase28() throws InterruptedException, FileNotFoundException, IOException {
		login();
	//	WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		WebElement select=driver.findElement(By.id("fcf"));
		Select view=new Select(select);
		view.selectByVisibleText("My Contacts");
	}
	public static void Testcase29() throws InterruptedException, FileNotFoundException, IOException {
		login();
		//WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//tr[contains(@class,'dataRow even first')]//th[contains(@class,'dataCell')]//a")).click();
		
	}
	public static void Testcase30() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		WebElement unique=driver.findElement(By.id("devname"));
		wait.until(ExpectedConditions.visibilityOfAllElements(unique));
		unique.sendKeys("EFGH");
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
				
	}
	public static void Testcase31() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		WebElement unique=driver.findElement(By.id("devname"));
		wait.until(ExpectedConditions.visibilityOfAllElements(unique));
		unique.sendKeys("EFGH");
		driver.findElement(By.id("fname")).sendKeys("ABCD");
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='cancel']")).click();
	}
	public static void Testcase32() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("name_lastcon2"))));
		driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
		driver.findElement(By.id("con4")).sendKeys("TekArchParent");
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save_new')]")).click();
	}

}
