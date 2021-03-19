package tt.ebay.StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.sundayVision.ebayPageActions.EbayHomePageActions;
import tt.sundayVision.ebayPageActions.EbaySearchResultActions;
import tt.utilities.setupDrivers;


public class ItemsSteps {

	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	

	
	 @Given("^Open Ebay Website$") public void open_Ebay_Website() throws Exception {
	 
	 System.out.println("new from snipet");
	 setupDrivers.driver.get("https://www.ebay.com/");
	 EbayHomePageActionsObj.loadEbayHomePage();
	 
	 }
	

	@When("^search for \"([^\"]*)\"$")
	public void search_for(String item) throws Exception {
		
		EbayHomePageActionsObj.searchItem(item);
		
	}

	@When("^filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		
		EbaySearchResultActionsObj.filterBrand(brand);
	}

	@Then("^Displayed products by \"([^\"]*)\"$")
	public void displayed_products_by(String brand) throws Throwable {
		
		EbaySearchResultActionsObj.validateBrand(brand);
	}

}
