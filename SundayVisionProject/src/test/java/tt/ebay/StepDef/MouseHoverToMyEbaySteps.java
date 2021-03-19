package tt.ebay.StepDef;



import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.sundayVision.ebayPageActions.EbayMouseHoverActions;

public class MouseHoverToMyEbaySteps {
	
	EbayMouseHoverActions EbayMouseHoverActionsObj = new EbayMouseHoverActions();
	
	@When("^move mouse to myEbay and select Messages$")
	public void move_mouse_to_myEbay() throws Throwable {
		
		EbayMouseHoverActionsObj.mouseHoverToMyebay();
	}


	@Then("^Displayed My eBay: Messages$")
	public void displayed_My_eBay_Messages() throws Throwable {
	    
		System.out.println("coding not done - 2");
	}


	
	
	

}
