package Web.LocatorsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Web.BaseClass.BaseClass;
import Web.CommonUtils.WaitCommands;
public class QAAutomation extends BaseClass{

	static By QAAutomation = By.xpath("//*[@id=\"menu-item-4131\"]/a/span");
	static By CourComplCertificate = By.xpath("//*[@id=\"menu-item-5296\"]/a");
	static By AtoZ = By.xpath("//*[@id=\"menu-item-5884\"]/a/span");
	static By PracticeAtomationText = By.xpath("//*[@id=\"menu-item-4157\"]/a/span");
	static By RegForm = By.xpath("//*[@id=\"menu-item-4134\"]/a/span");
	//*[@id="menu-item-4131"]/a/span
	public static void CourseFeatures_Click() throws InterruptedException
	{
		
		WaitCommands.waitForVisiblityofallelements(QAAutomation);
		
		
			WebElement QAelement = driver.findElement(QAAutomation);
			WebElement CourComplElement = driver.findElement(CourComplCertificate);
			Actions mouse = new Actions(driver);
			mouse
			.moveToElement(QAelement)
			.moveToElement(CourComplElement)
			.click()
			.perform();
			
			//driver.navigate().refresh();
			Thread.sleep(5000);
					
	}
	public static void PracticeAtomationText_Click() throws InterruptedException
	{
		
		WaitCommands.waitForVisiblityofallelements(QAAutomation);
		
		
			WebElement QAelement = driver.findElement(QAAutomation);
			WebElement PracticeAtomationTextElement = driver.findElement(PracticeAtomationText);
			WebElement RegFormElement = driver.findElement(RegForm);
			Actions mouse = new Actions(driver);
			mouse
			.moveToElement(QAelement)
			.moveToElement(PracticeAtomationTextElement).moveToElement(RegFormElement)
			.click()
			.perform();
			
			//driver.navigate().refresh();
			Thread.sleep(5000);
					
	}
	public static void AtoZ_Click() throws InterruptedException
	{
		
		WaitCommands.waitForVisiblityofallelements(QAAutomation);
		
		
			WebElement QAelement = driver.findElement(QAAutomation);
			WebElement AtoZElement = driver.findElement(AtoZ);
			Actions mouse = new Actions(driver);
			mouse
			.moveToElement(QAelement)
			.moveToElement(AtoZElement)
			.click()
			.perform();
			
			//driver.navigate().refresh();
			Thread.sleep(5000);
					
	}
	
}
