package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_LogoutPage {

	WebDriver ldriver;

	public D_LogoutPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver,this);
	}

	@FindBy(xpath="//i[@class='fa fa-bars']")
	private WebElement MenuBar;

	@FindBy(xpath="//a[normalize-space()='Logout']")
	private WebElement LogOut;

	public void clickonmenubar() {
		MenuBar.click();
	}

	public void clickonlogout() {
		LogOut.click();
	}
}
