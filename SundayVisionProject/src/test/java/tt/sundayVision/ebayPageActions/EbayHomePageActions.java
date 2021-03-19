package tt.sundayVision.ebayPageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import tt.sundayVision.ebayPageElements.EbayHomePageLocators;
import tt.utilities.setupDrivers;

public class EbayHomePageActions {

	public static EbayHomePageLocators EbayHomePageLocatorsobj;
	
	public EbayHomePageActions() {

		EbayHomePageLocatorsobj = new EbayHomePageLocators();
		PageFactory.initElements(setupDrivers.driver, EbayHomePageLocatorsobj);

	}

	public  void loadEbayHomePage() throws InterruptedException {

		setupDrivers.driver.get("https://www.ebay.com/");
		setupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		setupDrivers.driver.manage().window().maximize();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>loadEbayHomePage");
		Thread.sleep(1000);
	}

	public  void searchWatch() throws Exception {
		Thread.sleep(5000);
		EbayHomePageLocatorsobj.txtbxSerchForAnyThing.clear();
		EbayHomePageLocatorsobj.txtbxSerchForAnyThing.sendKeys("Watch");
		EbayHomePageLocatorsobj.btnSearch.click();
		Thread.sleep(5000);
	}

	public  void searchItem(String item) throws Exception {
		Thread.sleep(5000);
		EbayHomePageLocatorsobj.txtbxSerchForAnyThing.clear();
		EbayHomePageLocatorsobj.txtbxSerchForAnyThing.sendKeys(item);
		EbayHomePageLocatorsobj.btnSearch.click();
		Thread.sleep(5000);
	}

}
