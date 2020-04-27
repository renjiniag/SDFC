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

public class CreateOpty {
	static WebDriver driver =null;

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//Testcase15();
		//Testcase16();
		//Testcase17();
		//Testcase18();
		Testcase19();

	}
	public static void login() throws InterruptedException, FileNotFoundException, IOException {
		BrowserUtility.launchBroswer("chrome");
		driver=BrowserUtility.driver;
		System.out.println("Browser launched");		
		BrowserUtility.loginBrowser();	
	    
	}
	public static void Testcase15() throws InterruptedException, FileNotFoundException, IOException {
	    login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(5000);
		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		WebElement select=driver.findElement(By.id("fcf"));
		wait.until(ExpectedConditions.visibilityOfAllElements(select));
		Select selectOppo=new Select(select);
		List<WebElement> list = selectOppo.getOptions();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());			
		}
		driver.quit();		
	}
	public static void Testcase16() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(5000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		WebElement oppo=driver.findElement(By.id("opp3"));
		wait.until(ExpectedConditions.visibilityOfAllElements(oppo));
		oppo.sendKeys("MyOppo");
		driver.findElement(By.id("opp4")).sendKeys("TekArchParent");
		driver.findElement(By.id("opp9")).click();
		driver.findElement(By.id("opp9")).sendKeys("4/26/2020");
		WebElement select=driver.findElement(By.id("opp11"));
		Select selectOppo=new Select(select);
		selectOppo.selectByVisibleText("Prospecting");
		driver.findElement(By.id("opp12")).sendKeys("20");
		WebElement selectlead=driver.findElement(By.id("opp6"));
		Select selectOppolead=new Select(selectlead);
		selectOppolead.selectByVisibleText("Web");
		driver.findElement(By.id("opp17")).sendKeys("MyCampaign");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
	}
	public static void Testcase17() throws InterruptedException, FileNotFoundException, IOException {
		login();
		//WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(6000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();
				
	}
	public static void Testcase18() throws InterruptedException, FileNotFoundException, IOException {
		login();
		//WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(6000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
	}
	public static void Testcase19() throws InterruptedException, FileNotFoundException, IOException {
		login();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(6000);		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		WebElement select=driver.findElement(By.id("quarter_q"));
		Select selectOppo=new Select(select);
		selectOppo.selectByVisibleText("Current and Next FQ");
		WebElement selectInclude=driver.findElement(By.id("open"));
		Select selectOppoInclude=new Select(selectInclude);
		selectOppoInclude.selectByVisibleText("All Opportunities");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']")).click();
	}
	

}
