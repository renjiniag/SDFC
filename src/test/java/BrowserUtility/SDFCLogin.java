package BrowserUtility;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SDFCLogin {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//Testcase1();
		//Testcase2();
		Testcase3();
		//Testcase4a();
		//Testcase4b();

	}
	public static void Testcase1() throws InterruptedException {
		BrowserUtility.launchBroswer("chrome");
		WebDriver driver=BrowserUtility.driver;
		System.out.println("Browser launched");
		//BrowserUtility.loginBrowser();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		driver.findElement(By.id("username")).sendKeys("renjiniag@gmail.com");
		System.out.println("Username Entered");
		//driver.findElement(By.id("password")).sendKeys("test@123");		
		driver.findElement(By.id("Login")).click();		
		System.out.println("Login Button clicked");
		Thread.sleep(5000);
		if(driver.findElement(By.id("error")).getText().contentEquals("Please enter your password.")){
		System.out.println("Error displayed properly");
		}
		else {
			System.out.println("Error not displayed properly");
		}
		BrowserUtility.quitBrowser();	
		
	}
	public static void Testcase2() throws InterruptedException, FileNotFoundException, IOException {
		BrowserUtility.launchBroswer("chrome");
		WebDriver driver=BrowserUtility.driver;
		System.out.println("Browser launched");		
		BrowserUtility.loginBrowser();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userNavButton"))));
		System.out.println("Login successful");
		Thread.sleep(5000);
		BrowserUtility.quitBrowser();		
	}
	public static void Testcase3() throws InterruptedException, FileNotFoundException, IOException {
		BrowserUtility.launchBroswer("chrome");
		WebDriver driver=BrowserUtility.driver;
		System.out.println("Browser launched");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.id("rememberUn"))));
		driver.findElement(By.id("rememberUn")).click();
		System.out.println("Remember Me clicked.");
		BrowserUtility.loginBrowser();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userNavButton"))));
		System.out.println("Login successful");
		//Thread.sleep(5000);
		driver.findElement(By.id("userNavButton")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(5000);
		String currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
		WebElement username =driver.findElement(By.id("idcard-identity"));		
		wait.until(ExpectedConditions.visibilityOfAllElements(username));
		System.out.println(username.getText());
		if(username.getText().equalsIgnoreCase("renjiniag@gmail.com")) {
			System.out.println("Username saved.");
		}
		else {
			System.out.println("Username not saved");
		}
		driver.quit();			
	}
	public static void Testcase4a() throws InterruptedException {
		BrowserUtility.launchBroswer("chrome");
		WebDriver driver=BrowserUtility.driver;
		System.out.println("Browser launched");
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement forgotPassword=driver.findElement(By.id("forgot_password_link"));
		forgotPassword.click();
		System.out.println("Forgot Password clicked");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("un"))));
		driver.findElement(By.id("un")).sendKeys("renjiniag@gmail.com");
		System.out.println("Username entered");
		driver.findElement(By.id("continue")).click();
		System.out.println("Continue button clicked");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("header"))));
		Thread.sleep(2000);
		if(driver.findElement(By.id("header")).getText().trim().equalsIgnoreCase("Check Your Email")){
			System.out.println("Email sent");
		}
		else {
			System.out.println("Email Not sent");
		}
		BrowserUtility.quitBrowser();
	}
	
	public static void Testcase4b() throws InterruptedException {
		BrowserUtility.launchBroswer("chrome");
		WebDriver driver=BrowserUtility.driver;
		System.out.println("Browser launched");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		driver.findElement(By.id("username")).sendKeys("123");
		System.out.println("Username Entered");
		driver.findElement(By.id("password")).sendKeys("22131");		
		driver.findElement(By.id("Login")).click();		
		System.out.println("Login Button clicked");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.id("error"))));
		if(driver.findElement(By.id("error")).getText().trim().contains("Please check your username and password")){
			System.out.println("Error shown");
		}
		else {
			System.out.println("Error not shown");
		}
		driver.quit();
	}
	

}
