package BrowserUtility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leads {
	
	static WebDriver driver=BrowserUtility.driver;
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		//Testcase20();
		//Testcase21();
		//Testcase22();
		//Testcase23();
		Testcase24();
	}
	public static void login() throws InterruptedException, FileNotFoundException, IOException {
		BrowserUtility.launchBroswer("chrome");
		driver=BrowserUtility.driver;
		System.out.println("Browser launched");		
		BrowserUtility.loginBrowser();	
	    
	}
	public static void Testcase20() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement leads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(leads));
		leads.click();
        Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
	}
	public static void Testcase21() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement leads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(leads));
		leads.click();
        Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		WebElement select=driver.findElement(By.id("fcf"));
		Select leadDropDown=new Select(select);
		List<WebElement> list = leadDropDown.getOptions();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());			
		}
		driver.quit();		
		
	}
	public static void Testcase22() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement leads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(leads));
		leads.click();
        Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		WebElement select=driver.findElement(By.id("fcf"));
		Select leadDropDown=new Select(select);
		leadDropDown.selectByVisibleText("Today's Leads");
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
		System.out.println("Going to click lead");
		WebElement leads1=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(leads1));
		leads1.click();
		Thread.sleep(5000);		
		//WebElement ad_btn1 = driver.findElement(By.id("tryLexDialogX"));
		//ad_btn1.click();
		Thread.sleep(2000);
		WebElement select1=driver.findElement(By.id("fcf"));
		Select leadDropDown1=new Select(select1);
		List selected1=leadDropDown1.getAllSelectedOptions();
		for(int i=0;i<selected1.size();i++) {
			System.out.println(selected1.get(i));
		}
		driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
				
	}
	public static void Testcase23() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement leads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(leads));
		leads.click();
        Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		WebElement select=driver.findElement(By.id("fcf"));
		Select leadDropDown=new Select(select);
		leadDropDown.selectByVisibleText("Today's Leads");
		//driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
	}
	public static void Testcase24() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement leads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(leads));
		leads.click();
        Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//input[@name='new']")).click();
		WebElement lastName=driver.findElement(By.id("name_lastlea2"));
		wait.until(ExpectedConditions.visibilityOfAllElements(lastName));
		lastName.sendKeys("ABCD");
		driver.findElement(By.id("lea3")).sendKeys("ABCD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		
	}

}
