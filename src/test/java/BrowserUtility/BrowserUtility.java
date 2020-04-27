package BrowserUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {public static WebDriver driver = null;

public static void launchBroswer(String browser) {
	if(browser.startsWith("ch")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browser.startsWith("ed")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();			
	}
	else {
		System.out.println("Wrong Browser Selected");
	}
	if(driver!=null) {
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	}
}
public static void loginBrowser() throws InterruptedException, FileNotFoundException, IOException {
	String sFile="C:\\Users\\Jana\\eclipse-workspace\\SDFCTest\\src\\main\\resources\\SDFC.xls";
	System.out.println(sFile);
	HSSFWorkbook book=new HSSFWorkbook(new FileInputStream(sFile));
	HSSFSheet sheet=book.getSheet("Sheet1");
	HSSFRow row1=sheet.getRow(0);
	String username=row1.getCell(0).getStringCellValue();
	System.out.println(username);
	HSSFRow row2=sheet.getRow(1);
	String password=row2.getCell(0).getStringCellValue();
	System.out.println(password);
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
	driver.findElement(By.id("username")).sendKeys(username);
	System.out.println("Entered Username");
	driver.findElement(By.id("password")).sendKeys(password);
	System.out.println("Entered password");
	driver.findElement(By.id("Login")).click();
	System.out.println("Login clicked");
			
}
public static void quitBrowser() {
	if(driver!=null) {
		driver.quit();
	}
}	
/*public static void ReadXLS() throws FileNotFoundException, IOException {
	String sFile="C:\\Users\\Jana\\eclipse-workspace\\SDFCTest\\src\\main\\resources\\SDFC.xls";
	System.out.println(sFile);
	HSSFWorkbook book=new HSSFWorkbook(new FileInputStream(sFile));
	HSSFSheet sheet=book.getSheet("Sheet1");
	HSSFRow row1=sheet.getRow(0);
	System.out.println(row1.getCell(0).getStringCellValue());
}*/

}
