package rahul.maven.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//textarea[@class='gLFyf' and id='APjFqb']")).sendKeys(args);
		
	}

}

