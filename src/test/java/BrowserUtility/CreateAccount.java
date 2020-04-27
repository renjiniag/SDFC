package BrowserUtility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//Testcase10();
		//Testcase11();
		//Testcase12();
		//Testcase13();
		Testcase14();

	}
	public static void login() throws InterruptedException, FileNotFoundException, IOException {
		BrowserUtility.launchBroswer("chrome");
		driver=BrowserUtility.driver;
		System.out.println("Browser launched");		
		BrowserUtility.loginBrowser();	
	    
	}
	public static void Testcase10() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(3000);
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		WebElement newAccount=driver.findElement(By.xpath("//input[@name='new']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(newAccount));
		newAccount.click();
		WebElement Account=driver.findElement(By.id("acc2"));
		wait.until(ExpectedConditions.visibilityOfAllElements(Account));
		Account.click();
		Account.sendKeys("TekArchSDFC");
		WebElement selectMenuTab=driver.findElement(By.id("acc6"));
		Select selectTab=new Select(selectMenuTab);
		selectTab.selectByVisibleText("Technology Partner");
		WebElement selectPriority=driver.findElement(By.id("00N5w00000HXjXY"));
		Select selectPriorityTab=new Select(selectPriority);
		selectPriorityTab.selectByVisibleText("High");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
	    driver.quit();
	}
	
	public static void Testcase11() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(3000);
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		WebElement createNewView=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(createNewView));
		createNewView.click();
		WebElement viewName=driver.findElement(By.id("fname"));
		wait.until(ExpectedConditions.visibilityOfAllElements(viewName));
		//viewName.click();
		viewName.sendKeys("NewView");
		driver.findElement(By.id("devname")).clear();
		driver.findElement(By.id("devname")).sendKeys("NewUniqueName2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		driver.quit();		
	}
	public static void Testcase12() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(5000);
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		WebElement selectView=driver.findElement(By.id("fcf"));
		Select selectedView=new Select(selectView);
		selectedView.selectByVisibleText("NewView");
		driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")).click();
		WebElement viewName=driver.findElement(By.id("fname"));
		wait.until(ExpectedConditions.visibilityOfAllElements(viewName));
		viewName.clear();
		viewName.sendKeys("NewView5");
		driver.findElement(By.id("devname")).clear();
		driver.findElement(By.id("devname")).sendKeys("NewUniqueName8");
		WebElement selectEdit=driver.findElement(By.id("fcol1"));
		Select selectedEdit=new Select(selectEdit);
		selectedEdit.selectByVisibleText("Account Name");
		WebElement selectOperator=driver.findElement(By.id("fop1"));
		Select selectedOperator=new Select(selectOperator);
		selectedOperator.selectByVisibleText("contains");
		driver.findElement(By.id("fval1")).clear();
		driver.findElement(By.id("fval1")).sendKeys("a");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]")).click();
		driver.quit();
		
	}
	public static void Testcase13() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(5000);
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		driver.findElement(By.id("srch")).sendKeys("Account");
		driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]")).click();
		driver.findElement(By.id("cid0")).click();
		driver.findElement(By.id("cid1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]")).click();
		WebElement merge=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'save')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(merge));
		merge.click();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(3000);
		driver.quit();
	}
	public static void Testcase14() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(5000);
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.id("ext-gen152"));
		wait.until(ExpectedConditions.visibilityOf(date));
		date.click();
		WebElement todayFrom=driver.findElement(By.id("ext-gen276"));
		wait.until(ExpectedConditions.visibilityOf(todayFrom));
		todayFrom.click();
		driver.findElement(By.id("ext-gen154")).click();
		Thread.sleep(2000);
		WebElement todayTo=driver.findElement(By.id("ext-gen292"));
		wait.until(ExpectedConditions.visibilityOf(todayTo));
		todayTo.click();
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen49")).click();
		Thread.sleep(2000);
		WebElement report=driver.findElement(By.id("saveReportDlg_reportNameField"));
		wait.until(ExpectedConditions.visibilityOfAllElements(report));
		report.sendKeys("Report1");
		driver.findElement(By.id("saveReportDlg_DeveloperName")).clear();
		driver.findElement(By.id("saveReportDlg_DeveloperName")).sendKeys("Report1Unique1");
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen312")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
