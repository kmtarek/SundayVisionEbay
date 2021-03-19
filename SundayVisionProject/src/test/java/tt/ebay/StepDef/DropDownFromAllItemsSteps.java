package tt.ebay.StepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.sundayVision.ebayPageActions.EbayDropDwnActions;

public class DropDownFromAllItemsSteps {
	
	EbayDropDwnActions EbayDropDwnActionsObj = new EbayDropDwnActions();
	
	//EbayDropDwnActions EbayDropDwnActionsObj = new EbayDropDwnActions();
	
	@When("^search Crafts from drop down$")
	public void search_Crafts_from_drop_down() throws Exception  {
	    
		EbayDropDwnActionsObj.drpDwnAll();
	}

	@Then("^Displayed all craft items$")
	public void displayed_all_craft_items() throws Throwable {
	    
		System.out.println("craft items coding not done - kmtarek");
	}



}
