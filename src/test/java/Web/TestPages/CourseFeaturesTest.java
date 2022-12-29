package Web.TestPages;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import Web.BaseClass.BaseClass;
import Web.LocatorsPage.CourseFeaturesFuctionality;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CourseFeaturesTest extends BaseClass {

	public CourseFeaturesTest() {
		// TODO Auto-generated constructor stub
	}
	 @Test(priority = 1)
	  public void Click_CourseFeatures() throws InterruptedException {
			//System.out.println("R-Testing Tools – Manual & Automation Testing");
		 CourseFeaturesFuctionality.CourseFeatures_Click();
		 
		}
	@Test(priority = 0)
	public void Validate_HomePageData() throws InterruptedException {
		//CourseFeaturesFuctionality.validate_text()
		String actual = CourseFeaturesFuctionality.validate_text();
		String expected ="HOME\n"+"COURSE FEATURES\n"+"QA AUTOMATION\n"+"ABOUT ME\n"+"PYTHON FOR DATA SCIENCE\n"+"PYTHON LIBRARIES";
		
		Assert.assertEquals(actual, expected);
	}
	
	@BeforeClass
	public void OpenBrowser() {
		initialization();
	}
	@AfterClass
	public void CloseBrowser() {
		TearDown();
		
	}

}
