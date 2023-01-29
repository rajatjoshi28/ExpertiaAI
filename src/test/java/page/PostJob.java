package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PostJob {
	public void BasicDetailFill(WebDriver d) throws InterruptedException {
		d.findElement(By.xpath("//button[@class=\"ui button GetStartedHeader__StyleButton-sc-fm1kyw-21 iYMvVn\"]"))
				.click(); // Click on Access for Free
		d.findElement(By.xpath("//button[text()='Post a Job!']")).click(); // click on Post a job
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
		d.findElement(By.name("Confirm & Continue")).click(); // click on continue
	}
	
	public void FillJobDetail(WebDriver d) throws InterruptedException
	{
		Actions a = new Actions(d);
		// Filling Job Details
		d.findElement(By.name("jobTitle")).sendKeys("Senior Quality Engineer");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("p.text-sm")).click(); // clicking from drop down
		d.findElement(By.cssSelector("div.css-1jqq78o-placeholder")).click();
		Thread.sleep(2000);
		a.sendKeys(Keys.DOWN,Keys.ENTER).build().perform(); // Selecting Junior Experince
		d.findElement(By.name("jobLocation")).sendKeys("Bangalore");  // Selecting Job Location
		Thread.sleep(2000);
		d.findElement(By.cssSelector("p.text-sm")).click(); 
		d.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("bcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebfabcdefgadcdefgadcdebf");  
		d.findElement(By.xpath("//p[text()='Full-Time']")).click(); // Selecting FUll Time role
		Thread.sleep(2000);
		WebElement element = d.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		JavascriptExecutor jse2 = (JavascriptExecutor)d;
		jse2.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public void FillSkillDetail(WebDriver d) throws InterruptedException
	{
		Actions a = new Actions(d);
		JavascriptExecutor jse2 = (JavascriptExecutor)d;
		//Skill Details 
		
		d.findElement(By.name("minimumSalary")).sendKeys("900000");
		d.findElement(By.name("maximumSalary")).sendKeys("1100000");
		jse2.executeScript("scroll(400, 0)");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("div.css-egrrsv-control")).click();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		d.findElement(By.xpath("//input[@placeholder='Eg; IT consulting']")).sendKeys("Information Services"); // Entering Industry Type
		d.findElement(By.cssSelector("p.text-sm")).click();
		Thread.sleep(4000);// clicking from drop down
		d.findElement(By.xpath("//input[@placeholder='Eg; Python, Java']")).click();
		d.findElement(By.xpath("//input[@placeholder='Eg; Python, Java']")).sendKeys("Selenium");
		d.findElement(By.cssSelector("p.text-sm")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//p[@class='text-sm']")).click();
		d.findElement(By.xpath("//input[@placeholder='Eg; Python, Java']")).sendKeys("Java");
		d.findElement(By.xpath("//p[@class='text-sm']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@placeholder='Eg; Python, Java']")).click();
		d.findElement(By.xpath("//input[@placeholder='Eg; Python, Java']")).sendKeys("Robot Framework");
		
		d.findElement(By.xpath("//p[@class='text-sm']")).click();
		Thread.sleep(3000);
		jse2.executeScript("scroll(0, 400)");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("div.css-ce7t0n-control")).click();
		a.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		d.findElement(By.xpath("//button[text()='Create a job']")).click();
	}
}
