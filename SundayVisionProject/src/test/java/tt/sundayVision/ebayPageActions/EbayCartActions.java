package tt.sundayVision.ebayPageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tt.sundayVision.ebayPageElements.EbayCartLocators;
import tt.utilities.ReadExcelSheet;
import tt.utilities.setupDrivers;

public class EbayCartActions {
	
	EbayCartLocators EbayCartLocatorsObj;

	public EbayCartActions() {
		
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(setupDrivers.driver, EbayCartLocatorsObj);
	}
	
	public void selectColor() throws Exception {
		Thread.sleep(3000);
		Select myDrpDwn = new Select(EbayCartLocatorsObj.drpdwnColor);
		myDrpDwn.selectByVisibleText(ReadExcelSheet.getMapData("Style"));
		
	}

	public void selectSize() throws Exception {
		
		Thread.sleep(3000);
		Select myDrpDwn = new Select(EbayCartLocatorsObj.drpdwnSize);
		myDrpDwn.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
		
	}
	
	public void typeQty() throws Exception {
		Thread.sleep(3000);
		EbayCartLocatorsObj.drpdwnQty.clear();
		//EbayCartLocatorsObj.drpdwnQty.sendKeys(ReadExcelSheet.getMapData("Quantity"));
		EbayCartLocatorsObj.drpdwnQty.sendKeys("5");
	}
	
	public void addToCart() throws Exception {
		Thread.sleep(3000);
		EbayCartLocatorsObj.btnAddtoCart.click();
		Thread.sleep(3000);
	}
	
	
}
