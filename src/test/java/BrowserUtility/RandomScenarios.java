package BrowserUtility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RandomScenarios {
	static WebDriver driver =null;

	public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		//Testcase33();
		//Testcase34();
		//Testcase35();
		//Testcase36();
		Testcase37();

	}
	public static void login() throws InterruptedException, FileNotFoundException, IOException {
		BrowserUtility.launchBroswer("chrome");
		driver=BrowserUtility.driver;
		System.out.println("Browser launched");		
		BrowserUtility.loginBrowser();	
	    
	}
	public static void Testcase33() throws FileNotFoundException, InterruptedException, IOException {
		login();
		driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]")).click();		
        Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		WebElement name=driver.findElement(By.xpath("//h1[@class='currentStatusUserName']"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(name));
		name.click();
	}
	public static void Testcase34() throws FileNotFoundException, InterruptedException, IOException {
		login();
		driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]")).click();		
        Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		WebElement name=driver.findElement(By.xpath("//h1[@class='currentStatusUserName']"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(name));
		name.click();
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		Thread.sleep(3000);	
		driver.switchTo().frame("contactInfoContentId");
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//a[contains(text(),'About')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
		driver.switchTo().defaultContent();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, -250);");
		Thread.sleep(3000);
		if(driver.findElement(By.id("tailBreadcrumbNode")).getText().trim().equalsIgnoreCase("Renjini XYZ")) {
			System.out.println("Last name changed");
		}
		else {
			System.out.println("Last name not changed");
		}		
		
	}
	public static void Testcase35() throws FileNotFoundException, InterruptedException, IOException {
		login();
		driver.findElement(By.xpath("//img[contains(@class,'allTabsArrow')]")).click();
		Thread.sleep(2000);
		WebElement customize=driver.findElement(By.xpath("//input[@name='customize']"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(customize));
		customize.click();
		Thread.sleep(2000);
		WebElement select=driver.findElement(By.xpath("//select[@id='duel_select_1']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(select));
		Select one=new Select(select);
		one.selectByValue("Case");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userNavButton")).click();
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));		
		wait.until(ExpectedConditions.visibilityOfAllElements(logout));
		logout.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		driver.findElement(By.id("username")).sendKeys("renjiniag@gmail.com");
		System.out.println("Entered Username");
		driver.findElement(By.id("password")).sendKeys("test@123");
		System.out.println("Entered password");
		driver.findElement(By.id("Login")).click();
		System.out.println("Login clicked");
		Thread.sleep(6000);			
	}
	public static void Testcase36() throws FileNotFoundException, InterruptedException, IOException {
		login();
		driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]")).click();		
        Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//span[@class='pageDescription']/a")).click();
		Thread.sleep(2000);
		WebElement time=driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(time));
		time.click();
		Thread.sleep(2000);
		String handle=driver.getWindowHandle();
		WebElement combo=driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(combo));
		combo.click();
		Thread.sleep(2000);
		ArrayList windowTabs=new ArrayList((driver.getWindowHandles()));
		driver.switchTo().window((String) windowTabs.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(handle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		driver.findElement(By.xpath("//div[@id='timePickerItem_42']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
	}
	public static void Testcase37() throws FileNotFoundException, InterruptedException, IOException {
		login();
		driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]")).click();		
        Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//span[@class='pageDescription']/a")).click();
		Thread.sleep(2000);
		WebElement time=driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(time));
		time.click();
		Thread.sleep(2000);
		String handle=driver.getWindowHandle();
		WebElement combo=driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(combo));
		combo.click();
		Thread.sleep(2000);
		ArrayList windowTabs=new ArrayList((driver.getWindowHandles()));
		driver.switchTo().window((String) windowTabs.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(handle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		driver.findElement(By.xpath("//div[@id='timePickerItem_38']")).click();
		driver.findElement(By.id("IsRecurrence")).click();
		WebElement weekly=driver.findElement(By.id("rectypeftw"));
		wait.until(ExpectedConditions.visibilityOfAllElements(weekly));
		weekly.click();
		int noOfDays = 14; //i.e two weeks
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar calendar = Calendar.getInstance();		        
		calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
		String newDate = sdf.format(calendar.getTime());
		driver.findElement(By.id("RecurrenceEndDateOnly")).click();
		driver.findElement(By.id("RecurrenceEndDateOnly")).sendKeys(newDate);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@class,'monthViewIcon')]")).click();
	}

}
