package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticleLoginPageAssignment {
	
	@FindBy(name = "email")
	WebElement emailInput;

	@FindBy(name = "password")
	WebElement pwd;
	
	@FindBy(className = "btn-primary")
	WebElement loginbtn;
	
	//constructor to initialize
	public ArticleLoginPageAssignment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Action
	public void loginIntoApp(String strUser, String strpwd) {
		emailInput.sendKeys(strUser);
		pwd.sendKeys(strpwd);
		loginbtn.click();
	}
}