package tt.sundayVision.ebayPageActions;

import org.openqa.selenium.support.PageFactory;


import junit.framework.Assert;
import tt.sundayVision.ebayPageElements.EbaySearchResultLocators;
import tt.utilities.setupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	
	
	public EbaySearchResultActions(){
		
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(setupDrivers.driver, EbaySearchResultLocatorsObj);
		
	}

	public void verifyWatchPage() throws Exception {
		Thread.sleep(5000);
		//option:1
		
		EbaySearchResultLocatorsObj.txtPocketWatches.isDisplayed();
		
		//option: 2
		System.out.println(EbaySearchResultLocatorsObj.txtPocketWatches.getText());
		
		//option:3
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtPocketWatches.getText(), "Pocket Watches");
		
		//option:4
		Assert.assertEquals(true, EbaySearchResultLocatorsObj.txtPocketWatches.isDisplayed());
	}
	
	public void filterBrand(String brand) throws Exception {
		Thread.sleep(5000);
		if(brand.equals("Casio")){
			EbaySearchResultLocatorsObj.cbxCasio.click();
			
		}else if(brand.equals("Tommy Hilfiger")) {
			
			EbaySearchResultLocatorsObj.cbxTommyHilfiger.click();
			
		}else if(brand.equals("DOCKERS")) {
			
			EbaySearchResultLocatorsObj.cbxDOCKERS.click();
		}
		
		Thread.sleep(5000);
	}
	
	public void validateBrand(String brand) throws Exception {
		Thread.sleep(5000);
		if (brand.equals("Casio")) {
			EbaySearchResultLocatorsObj.txtCasio.isDisplayed();
		} else if (brand.equals("Tommy Hilfiger")) {
			EbaySearchResultLocatorsObj.txtTommyHilfiger.isDisplayed();
		} else if (brand.equals("DOCKERS")) {
			EbaySearchResultLocatorsObj.txtDOCKERS.isDisplayed();
		}
		Thread.sleep(5000);
}
	public void selectShirtforCart() {
		
		EbaySearchResultLocatorsObj.shirtItemToCart.click();
	}
	
	
	
}
