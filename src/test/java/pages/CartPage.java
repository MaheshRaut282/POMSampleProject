package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {
	@FindAll(value = @FindBy(css = "div.cart_item"))
	List<WebElement> items;
	
	@FindBy(css = "button[data-test='continue-shopping']")
	WebElement contBtn;
	
	@FindBy(css = "button[data-test='checkout']")
	WebElement chkoutBtn;
	
	//*[@id="checkout"]
	
	
	@FindBy(id = "remove-sauce-labs-backpack")
	WebElement removeBtn;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isItemsAdded() {
		if(items.size() > 0) 
			return true;
		 else
			return false;
		}

	public void checkoutItems() {
		// TODO Auto-generated method stub
		chkoutBtn.click();
	}
	
	public void continueShopping() {
		contBtn.click();
	}
}
