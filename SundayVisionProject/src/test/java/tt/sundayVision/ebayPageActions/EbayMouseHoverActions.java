package tt.sundayVision.ebayPageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tt.sundayVision.ebayPageElements.EbayHomePageLocators;
import tt.utilities.setupDrivers;

public class EbayMouseHoverActions {

	EbayHomePageLocators EbayHomePageLocatorsObj;
	
	public EbayMouseHoverActions (){
		
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(setupDrivers.driver, EbayHomePageLocatorsObj);
	}
	
	public void mouseHoverToMyebay() throws Exception {
		
		WebDriver driver = setupDrivers.driver;
		Actions actions = new Actions(driver);
		actions.moveToElement(EbayHomePageLocatorsObj.MyEbay).perform();
		EbayHomePageLocatorsObj.msg.click();
		Thread.sleep(3000);
	}
	
	public void selectMessages() throws Exception {
		
		System.out.println("coding not done!");
	}
	
}
