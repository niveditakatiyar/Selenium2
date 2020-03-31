package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//home/nivedita/Documents/Testing_Java/Chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select s = new Select(driver.findElement(By.id("select-demo")));
		for(int i=0;i<8;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		Select s2 = new Select(driver.findElement(By.id("multi-select")));
		s2.selectByVisibleText("New Jersey");
		s2.selectByVisibleText("New York");
		s2.selectByVisibleText("Texas");
		driver.findElement(By.id("printMe")).click();// after clicking first selected and then all select it is only giving the output of last selected
		Thread.sleep(2000);                           //as the site is working as same.
		driver.findElement(By.id("printAll")).click();

	}

}
