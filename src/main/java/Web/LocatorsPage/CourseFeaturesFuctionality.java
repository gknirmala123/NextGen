package Web.LocatorsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Web.BaseClass.BaseClass;
import Web.CommonUtils.WaitCommands;



public class CourseFeaturesFuctionality extends BaseClass {

	static By CourseText= By.xpath("//*[@id=\"menu-item-6044\"]/a/span");
	static By CourseFeaturesText= By.xpath("//*[@id=\"site-header-inner\"]");
	
	
	public static void CourseFeatures_Click() throws InterruptedException
	{
		
		WaitCommands.waitForVisiblityofallelements(CourseText);
	
			WebElement element = driver.findElement(CourseText);
			System.out.println(element.getText());
			element.click();
			//driver.navigate().refresh();
			Thread.sleep(5000);
					
	}
	public static String validate_text() throws InterruptedException {
		WaitCommands.waitForVisiblityofallelements(CourseFeaturesText);
		WebElement element = driver.findElement(CourseFeaturesText);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(5000);
		return text;

	}

}
