package Web.TestPages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Web.BaseClass.BaseClass;
import Web.LocatorsPage.CourseFeaturesFuctionality;
import Web.LocatorsPage.QAAutomation;

public class QAAutomationTest extends BaseClass{

	@Test(priority = 0)
	public void Validate_HomePageData() throws InterruptedException {
		QAAutomation.CourseFeatures_Click();
		QAAutomation.AtoZ_Click();
		QAAutomation.PracticeAtomationText_Click();
		
		//Assert.assertEquals(actual, expected);
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
