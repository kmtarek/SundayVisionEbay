package tt.ebay.StepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.sundayVision.ebayPageActions.EbayCartActions;
import tt.sundayVision.ebayPageActions.EbaySearchAnyItemActions;
import tt.sundayVision.ebayPageActions.EbaySearchResultActions;

public class CartShirtSteps {
	
	EbayCartActions EbayCartActionsObj = new EbayCartActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	EbaySearchAnyItemActions EbaySearchAnyItemActionsObj = new EbaySearchAnyItemActions();
			
	@When("^Search for shirts$")
	public void search_for_shirts() throws Exception  {
		
		EbaySearchAnyItemActionsObj.typeShirt();
		EbaySearchAnyItemActionsObj.clickSrchBtn();
	}

	@When("^Select a shirt from list$")
	public void select_a_shirt_from_list()  {
		
		EbaySearchResultActionsObj.selectShirtforCart();
	    
	}

	@When("^Select color on shirt$")
	public void select_color_on_shirt() throws Exception  {
		
		EbayCartActionsObj.selectColor();
	    
	}

	@When("^Select size on shirt$")
	public void select_size_on_shirt() throws Exception  {
	   
		EbayCartActionsObj.selectSize();
		
	}

	@When("^Select qty on shirt$")
	public void select_qty_on_shirt() throws Exception  {
	    
		EbayCartActionsObj.typeQty();
		
	}

	@When("^add to cart$")
	public void add_to_cart() throws Exception  {
		
		EbayCartActionsObj.addToCart();
	}

	@Then("^Validate item is in the cart$")
	public void validate_item_is_in_the_cart()  {
		
	System.out.println("Validate funntion not yet written");
	    
	}

}
