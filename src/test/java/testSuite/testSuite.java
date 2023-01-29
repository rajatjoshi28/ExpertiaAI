package testSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import page.CreateCareerPage;
import page.PostJob;

public class testSuite extends BaseClass {
	
	
	@Test(testName="Verify Home Page")
	public void VerifyHomePageLauch() {
			//Before Method will be called from BaseClass
	}

	@Test(testName="Verifying Access Free Option ")
	public void VerifyAccessFreeOption() {
		d.findElement(By.xpath("//button[@class=\"ui button GetStartedHeader__StyleButton-sc-fm1kyw-21 iYMvVn\"]"))
				.click();
		String title = d.getTitle();
		System.out.println(title);
		String titleTobeValidate = "Expertia AI - Know whom to hire and why in seconds";
		assertEquals(titleTobeValidate, title);
	}

	@Test(testName="Creating Career Page")
	public void CreateYourCareerPage() throws InterruptedException {
		
		CreateCareerPage cp = new CreateCareerPage();  
		cp.BasicDetailFill(d);  //Navigating to Career page and Filling Details
		cp.SignUpPage(d);   //Filling up Sign up Page and Signing up

	}
	
	@Test(testName="Posting First Job")
	public void PostJob() throws InterruptedException {
		CreateCareerPage cp = new CreateCareerPage();
		PostJob pj = new PostJob();
		pj.BasicDetailFill(d);  // Navigating to Posting Job and filling basic details
		pj.FillJobDetail(d);	// Filling up Job Details 
		pj.FillSkillDetail(d);  // Filling up Skill sets
		cp.SignUpPage(d);       // Filling up Sign up Page and Signing up

	}

}
