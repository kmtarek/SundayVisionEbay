package tt.sundayVision.ebayPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {
	
	//color changed to fit changed to Style
	@FindBy(xpath="//select[@name='Style']")
	public WebElement drpdwnColor;
	//size
	@FindBy(xpath="//select[@name='Size Type']")
	public WebElement drpdwnSize;
	//qty
	@FindBy(xpath="//input[@class='qtyInput']")
	public WebElement drpdwnQty;
	//add to cart
	@FindBy(xpath="//a[@id='isCartBtn_btn']")
	public WebElement btnAddtoCart;
}
