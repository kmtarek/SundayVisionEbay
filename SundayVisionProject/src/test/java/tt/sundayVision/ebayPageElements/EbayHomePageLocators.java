package tt.sundayVision.ebayPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {
	
	@FindBy(xpath="//input[@id='gh-ac']")  
	public WebElement txtbxSerchForAnyThing;
	
	@FindBy(xpath="//input[@id='gh-btn']")
	public WebElement btnSearch;
	
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement MyEbay;

	@FindBy(xpath="//a[contains(text(),'Messages') and @class=\"gh-eb-oa thrd\"]")
	public WebElement msg;
	
	@FindBy(xpath="//select[@aria-label=\"Select a category for search\"]")
	public WebElement allCatagoiesy;
	
	@FindBy(xpath="//input[@class=\"btn btn-prim gh-spr\"]")
	public WebElement search;
}
