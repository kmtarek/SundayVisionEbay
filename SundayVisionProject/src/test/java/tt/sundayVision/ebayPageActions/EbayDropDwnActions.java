package tt.sundayVision.ebayPageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tt.sundayVision.ebayPageElements.EbayHomePageLocators;
import tt.utilities.setupDrivers;

public class EbayDropDwnActions {
	
	EbayHomePageLocators EbayHomePageLocatorsObj;
	
	public EbayDropDwnActions(){
		
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(setupDrivers.driver, EbayHomePageLocatorsObj);
	}

	public void drpDwnAll() throws Exception {
		
		// select Crafts by index
		
		Select listbox = new Select(EbayHomePageLocatorsObj.allCatagoiesy);
		listbox.selectByIndex(12);
		EbayHomePageLocatorsObj.search.click();
		Thread.sleep(3000);
		WebDriver driver = setupDrivers.driver;
		driver.navigate().to("https://www.ebay.com/b/Art-Craft-Supplies/14339/bn_1851051?_from=R40&_nkw=&_trksid=p2499334.m570.l1313ull");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(0);
	}
	
	
}
