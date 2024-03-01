package AutomationAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_LaunchingBrowsers {

	public static void main(String[] args) throws InterruptedException {
		
		
		String MozillaDriver = "D:\\Eclipse Editor\\GIT\\Selenium-Java-Automation\\Drivers\\Firefox\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",MozillaDriver);
		 
		String ChromeDriver = "D:\\Eclipse Editor\\GIT\\Selenium-Java-Automation\\Drivers\\Chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeDriver);
		
		String MicrosoftEdgeDriver = "D:\\Eclipse Editor\\GIT\\Selenium-Java-Automation\\Drivers\\Edge\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver",MicrosoftEdgeDriver);
		
		
		WebDriver driver = new ChromeDriver();
		
	//  WebDriver driver= new FirefoxDriver();
		
	//	 WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		driver.quit();

		System.out.println("Automated..!!");
	}

}
