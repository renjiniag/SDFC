package BrowserUtility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserDropDownMenu {
	static WebDriver driver=null;
	

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//Testcase5();
		Testcase6();
		//Testcase7();
		//Testcase8();
		//Testcase9();

	}
	public static void clickUserMenu() throws InterruptedException, FileNotFoundException, IOException {
		BrowserUtility.launchBroswer("chrome");
		driver=BrowserUtility.driver;
		System.out.println("Browser launched");		
		BrowserUtility.loginBrowser();	
	    WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userNavButton"))));
		System.out.println("Login successful");
		Thread.sleep(3000);
		driver.findElement(By.id("userNavButton")).click();
	}
	public static void Testcase5() throws InterruptedException, FileNotFoundException, IOException {
		clickUserMenu();
    	 WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userNav-menuItems"))));
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).isDisplayed()) {
			System.out.println("My Profile present");
		}
		if(driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).isDisplayed()) {
			System.out.println("My Settings present");
		}
		if(driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")).isDisplayed()) {
			System.out.println("My Developer Console present");
		}
		if(driver.findElement(By.xpath("//a[@class='menuButtonMenuLink'][contains(text(),'Switch to Lightning Experience')]")).isDisplayed()) {
			System.out.println("My Switch to lightning experience present");
		}
		if(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed()) {
			System.out.println("My Settings present");
		}
		//driver.quit();
	}
	public static void Testcase6() throws InterruptedException, FileNotFoundException, IOException {
		Testcase5();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.id("chatterTab"))));
		//Testing Last name-Step 1
		driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")).click();
		Thread.sleep(3000);	
		driver.switchTo().frame("contactInfoContentId");
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//a[contains(text(),'About')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
		driver.switchTo().defaultContent();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, -250);");
		Thread.sleep(3000);
		if(driver.findElement(By.id("tailBreadcrumbNode")).getText().trim().equalsIgnoreCase("Renjini ABCD")) {
			System.out.println("Last name changed");
		}
		else {
			System.out.println("Last name not changed");
		}
		//Testing Post Link-Step 2
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")));
		
		WebElement body = driver.findElement(By.xpath("/html/body"));
		body.click();
	    body.sendKeys("renjini");		 
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		driver.findElement(By.id("publishersharebutton")).click();		
		Thread.sleep(2000);
		
		//Testing File Step-3
		WebElement file_option = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
		file_option.click();
		System.out.println("File option is selected");
		WebElement upload=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(upload));
		upload.click();
		System.out.println("Upload clicked");
		Thread.sleep(2000);
		WebElement choose=driver.findElement(By.id("chatterFile"));
		wait.until(ExpectedConditions.visibilityOfAllElements(choose));
		choose.sendKeys("C://Users//Jana//Desktop//download.jpg");
		System.out.println("Choose button clicked");
		driver.findElement(By.id("publishersharebutton")).click();		
		Thread.sleep(3000);
		WebElement photo=driver.findElement(By.id("displayBadge"));
		Actions action =new Actions(driver);
		action.moveToElement(photo).build().perform();
		System.out.println("Mouse hovered");
		//Thread.sleep(3000);
		WebElement uploadLink=driver.findElement(By.id("uploadLink"));
		uploadLink.click();
		System.out.println("display Badge clickked");
		Thread.sleep(2000);
		driver.switchTo().frame("uploadPhotoContentId");
		System.out.println("Switched to frame");
		driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile")).sendKeys("C://Users//Jana//Desktop//download.jpg");
		System.out.println("File sent");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']")).click();
		System.out.println("Save clicked");
		Thread.sleep(3000);
		WebElement area=driver.findElement(By.xpath("//div[contains(@class,'imgCrop_handle imgCrop_handleSW')]"));
		
		action.clickAndHold(area).moveByOffset(50, 50).release().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("j_id0:j_id7:save")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.quit();
	}
	public static void Testcase7() throws InterruptedException, FileNotFoundException, IOException {
		clickUserMenu();
		WebElement mySettings=driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(mySettings));
		mySettings.click();
		WebElement personal=driver.findElement(By.id("PersonalInfo_font"));
		wait.until(ExpectedConditions.visibilityOfAllElements(personal));
		personal.click();
		WebElement loginHistory=driver.findElement(By.id("LoginHistory_font"));
		wait.until(ExpectedConditions.visibilityOfAllElements(loginHistory));
		loginHistory.click();
		WebElement downloadLoginHistory=driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(downloadLoginHistory));
		downloadLoginHistory.click();
		Thread.sleep(2000);
		WebElement displayLayout=driver.findElement(By.id("DisplayAndLayout_font"));
		displayLayout.click();
		WebElement customizeMyTab=driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(customizeMyTab));
		customizeMyTab.click();
		WebElement selectMenu=driver.findElement(By.id("p4"));
		Select select=new Select(selectMenu);
		select.selectByVisibleText("Salesforce Chatter");
		Thread.sleep(2000);
		WebElement selectMenuTab=driver.findElement(By.id("duel_select_0"));
		Select selectTab=new Select(selectMenuTab);
		selectTab.selectByVisibleText("Reports");
		WebElement add=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		add.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("EmailSetup_font"));
		email.click();
		WebElement emailSettings=driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(emailSettings));
		emailSettings.click();
		WebElement emailName=driver.findElement(By.id("sender_name"));
		wait.until(ExpectedConditions.visibilityOfAllElements(emailName));
		emailName.click();
		emailName.clear();
		emailName.sendKeys("ABCD");
		WebElement emailAddress=driver.findElement(By.id("sender_email"));
		emailAddress.click();
		emailAddress.clear();
		emailAddress.sendKeys("renjiniag@gmail.com");
		driver.findElement(By.id("auto_bcc1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
		WebElement calendar=driver.findElement(By.xpath("//div[@id='CalendarAndReminders']//a[@class='header setupFolder']"));
		calendar.click();
		WebElement activityReminder=driver.findElement(By.xpath("//a[@id='Reminders_font']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(activityReminder));
		activityReminder.click();
		String handle=driver.getWindowHandle();
		WebElement testReminder=driver.findElement(By.id("testbtn"));
		wait.until(ExpectedConditions.visibilityOfAllElements(testReminder));
		testReminder.click();
		Thread.sleep(2000);
				
		//add validation
		driver.close();
		
	}
	public static void Testcase8() throws InterruptedException, FileNotFoundException, IOException {
		clickUserMenu();
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement devConsole=driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));		
		wait.until(ExpectedConditions.visibilityOfAllElements(devConsole));
		devConsole.click();
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window((String) tabs.get(1));
		driver.close();
		driver.switchTo().window((String) tabs.get(0));
		driver.quit();	
		
	}
	public static void Testcase9() throws InterruptedException, FileNotFoundException, IOException {
		clickUserMenu();
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));		
		wait.until(ExpectedConditions.visibilityOfAllElements(logout));
		logout.click();
		driver.quit();
	}

}
