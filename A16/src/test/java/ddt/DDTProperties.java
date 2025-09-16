package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("D:\\Shama\\Testing\\Tutorial\\QSpider\\Selenium\\html\\commdata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		String un = prop.getProperty("un");
		String pw = prop.getProperty("pw");
		
		prop.setProperty("New user", "user2");
		
		FileOutputStream fos = new FileOutputStream("D:\\Shama\\Testing\\Tutorial\\QSpider\\Selenium\\html\\commdata.properties");
		prop.store(fos, "updated value");


		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(pw);
		
		


		

		

	}

}
