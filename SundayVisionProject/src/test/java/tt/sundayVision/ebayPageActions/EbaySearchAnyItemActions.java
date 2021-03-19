package tt.sundayVision.ebayPageActions;

import org.openqa.selenium.support.PageFactory;

import tt.sundayVision.ebayPageElements.EbaySearchAnyItemLocators;
import tt.utilities.setupDrivers;

public class EbaySearchAnyItemActions {
	
	EbaySearchAnyItemLocators EbaySearchAnyItemLocatorsObj;
	
	public EbaySearchAnyItemActions() {
		
		EbaySearchAnyItemLocatorsObj = new EbaySearchAnyItemLocators();
		PageFactory.initElements(setupDrivers.driver, EbaySearchAnyItemLocatorsObj);
	}
public void typeShirt() throws Exception {
	
	EbaySearchAnyItemLocatorsObj.txtBxSrchAnything.clear();
	EbaySearchAnyItemLocatorsObj.txtBxSrchAnything.sendKeys("shirt");
	Thread.sleep(3000);
	
}
	public void clickSrchBtn() throws Exception {
		
		EbaySearchAnyItemLocatorsObj.btnSearch.click();
		Thread.sleep(3000);
		
	}
	
}
