package Assesment5.Assesment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test5 {
	@Test
	public void Test() throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\all_drivers\\chromedriver-win64_new\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.get("https://www.edureka.co/");
    driver.quit();
	}
} 
