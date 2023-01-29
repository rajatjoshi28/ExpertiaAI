package testSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver d;
	@BeforeMethod
	public WebDriver setDriversetup()
	{
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.expertia.ai/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return d;
	}
	
	@AfterMethod(alwaysRun=true)
	public void closebrowser()
	{
		d.quit();
	}
	
	public String getDataProperty(String requiredDataName) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\GlobalData.properties");
		prop.load(file);
		return prop.getProperty(requiredDataName);
	}
	
	
	
	

}
