package tt.sundayVision.ebayPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	@FindBy(xpath="//*[@id=\"x-refine__group__0\"]/ul/li/ul/li[3]/ul/li[2]/a/span")
	public WebElement txtPocketWatches;
	
	//brand Casio
	@FindBy(xpath="//*[@aria-label='Casio']")
	public WebElement cbxCasio;
	
	// brand Tommy Hilfiger
	@FindBy(xpath="//*[@aria-label='Tommy Hilfiger']")
	public WebElement cbxTommyHilfiger;
	
	//brand DOCKERS
	@FindBy(xpath="//*[@aria-label='DOCKERS']")
	public WebElement cbxDOCKERS;
	
	//validate Casio
	@FindBy(xpath="//*[contains(text(),'Casio')]")
	public WebElement txtCasio;
	
	//validate Tommy Hilfiger
	@FindBy(xpath="//*[contains(text(),'Tommy Hilfiger')]")
	public WebElement txtTommyHilfiger;
	
	//validate DOCKERS
	@FindBy(xpath="//*[contains(text(),'DOCKERS')]")
	public WebElement txtDOCKERS;
	
	//select a shirt for cart
	@FindBy(xpath="//h3[contains(text(), 'Sonic Youth Dirty Tee Top  Vintage Super CooL Unisex  Ladies T Shirt B572')]")
	public WebElement shirtItemToCart;
	
}
