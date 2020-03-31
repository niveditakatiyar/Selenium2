package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q7 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//home/nivedita/Documents/Testing_Java/Chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@data-group='home-&-living']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[@data-reactid='529']"))).click().build().perform();
		System.out.println(driver.getCurrentUrl());

	}
}
