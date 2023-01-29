package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateCareerPage {

	public void BasicDetailFill(WebDriver d) throws InterruptedException {
		d.findElement(By.xpath("//button[@class=\"ui button GetStartedHeader__StyleButton-sc-fm1kyw-21 iYMvVn\"]"))
				.click(); // Click on Access for Free
		d.findElement(By.xpath("//button[text()='Create your Career Page!']")).click(); // Click on Create Your Career
																						// Page
		d.findElement(By.id("Company-name")).sendKeys("Rajat-Demo"); // Entering Company Name
		d.findElement(By.name("headquarters")).sendKeys("Bangalore"); // Entering Headqurter name
		d.findElement(By.name("industryType")).sendKeys("Information Services"); // Entering Industry Type
		d.findElement(By.cssSelector("p.text-sm")).click(); // clicking from drop down
		d.findElement(By.cssSelector("div.css-egrrsv-control")).click();
		Thread.sleep(2000);
		Actions a = new Actions(d);
		a.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform(); // Selecting 1000-5000 Employee
																					// Range
		d.findElement(By.name("companyWebsite")).sendKeys("www.rajat-demo.com"); // Entering Website
		d.findElement(By.name("companyDescription")).sendKeys("THis is demo"); // Entering Company Discription

		// clicking on Confirm & Continue
		d.findElement(By.name("Confirm & Continue")).click();   // click on continue
	}
	
	public void SignUpPage(WebDriver d)
	{
		//entering details on Sign Up Page
		d.findElement(By.name("firstName")).sendKeys("Rajat");    //entering first name
		d.findElement(By.name("lastName")).sendKeys("Joshi");     //entering last name
		d.findElement(By.name("phoneNumber")).sendKeys("0000011111");  //entering phone No
		d.findElement(By.name("workEmail")).sendKeys("company@test.com");  //entering Email
		d.findElement(By.name("password")).sendKeys("testdemo");   //password input
		
		// clicking on Sign Up
		d.findElement(By.name("Sign Up For Free")).click();
	}

}
