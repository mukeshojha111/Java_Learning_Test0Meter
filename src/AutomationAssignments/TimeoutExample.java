package AutomationAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 If you set an implicit wait of 10 seconds and then apply an explicit wait of 15 seconds for a specific element, 
 the script will wait for a maximum of 15 seconds for that element. If the element is not found within this combined 
 time,a TimeoutException will be thrown.
 */

public class TimeoutExample {

	public static void main(String[] args) throws InterruptedException {
		
		String ChromeDriver = "D:\\Eclipse Editor\\GIT\\Selenium-Java-Automation\\Drivers\\Chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeDriver);
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// Set implicit wait to 10 seconds
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

        try {
            // Navigate to your page or perform any other necessary setup

            // Use an explicit wait for a specific element with a timeout of 15 seconds
            WebElement element = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(By.id("your_element_id")));

            // Perform actions with the located element (not shown in the example)
            // ...

        } catch (org.openqa.selenium.TimeoutException e) {
            System.out.println("Element not found within the specified time.");
        } finally {
            // Close the WebDriver
            driver.quit();

	}
	}
}
