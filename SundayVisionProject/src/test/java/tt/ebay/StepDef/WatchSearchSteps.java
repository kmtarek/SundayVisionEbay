package tt.ebay.StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.sundayVision.ebayPageActions.EbayHomePageActions;
import tt.sundayVision.ebayPageActions.EbaySearchResultActions;


public class WatchSearchSteps {
	
	EbayHomePageActions EbayHomePageActionsobj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	
	 @Given("^home page of ebay$") public void home_page_of_ebay() throws
	 Throwable {
	 
	 EbayHomePageActionsobj.loadEbayHomePage();
	 
	 }
	

	@When("^search for watch$")
	public void search_for_watch() throws Throwable {
	    
		EbayHomePageActionsobj.searchWatch();
		
	}

	@Then("^Displayed watch products only$")
	public void displayed_watch_products_only() throws Throwable {
	    
		EbaySearchResultActionsObj.verifyWatchPage();
		
	}


}
