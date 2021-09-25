package DemoCase;

import java.awt.Desktop.Action;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import com.gargoylesoftware.htmlunit.html.Keyboard;

public class SampleTestCase {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesktopOptions options= new DesktopOptions();
		
		options.setApplicationPath("C:\\Program Files (x86)\\Somnoware Healthcare Systems\\Somnoware\\SomnoManagementConsole.exe");
		
		WiniumDriver driver= new WiniumDriver(new URL ("http://localhost:9999"), options);
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		
	
		//driver.findElement(By.id("txtUserName")).sendKeys("ashik");
		//act.sendKeys(Keys.TAB).build().perform();
		
		//driver.findElementById("txtPassword").click();
		driver.findElement(By.id("txtPassword")).sendKeys("123456");
		//Thread.sleep(3000);
		
		//driver.findElement(By.id("btnLogin")).click();
		
		
	}

}
