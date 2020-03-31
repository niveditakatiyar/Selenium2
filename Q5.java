package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//home/nivedita/Documents/Testing_Java/Chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		System.out.println(driver.findElements(By.tagName("iframe")).size());

	}

}

