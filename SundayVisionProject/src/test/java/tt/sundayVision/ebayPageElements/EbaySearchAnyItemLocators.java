package tt.sundayVision.ebayPageElements;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchAnyItemLocators {

	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtBxSrchAnything;
	
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
	
}
