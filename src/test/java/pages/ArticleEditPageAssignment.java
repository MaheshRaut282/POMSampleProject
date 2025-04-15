package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.utility.RandomString;

public class ArticleEditPageAssignment {
	
	@FindBy(name = "title")
	WebElement TitleField;
	
	@FindBy(xpath = "//input[@name='description']")
	WebElement DescField;
	
	@FindBy(xpath = "//textarea[@name='body']")
	WebElement BodyField;
	
	@FindBy(name = "tags")
	WebElement tagField;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;
	
	

	public ArticleEditPageAssignment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void EnterNewDetailsInArticleForm(String strTitle, String strDesc, String strContent, String strTag) {
		TitleField.clear();
		TitleField.sendKeys(strTitle);
		
		DescField.clear();
		DescField.sendKeys(strDesc);
		
		BodyField.clear();
		BodyField.sendKeys(strContent);
		
		tagField.clear();
		tagField.sendKeys(strTag);
		
	}
	
	public void SubmitInfo() {
		submitBtn.click();
	}
	
}