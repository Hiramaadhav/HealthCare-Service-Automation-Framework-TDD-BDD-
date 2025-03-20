package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_LoginPage {
	WebDriver ldriver;

	public A_LoginPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver,this);
	}

	@FindBy(xpath="//a[@id='btn-make-appointment']")
	private WebElement MakeAppointmentButton;

	@FindBy(xpath="//input[@id='txt-username']")
	private WebElement UserName;

	@FindBy(xpath="//input[@id='txt-password']")
	private WebElement Password;

	@FindBy(xpath="//button[@id='btn-login']")
	private WebElement Login;

	public void clickonmakeappointmentbutton() {
		MakeAppointmentButton.click();
	}

	public void enterusername(String username) {
		UserName.sendKeys(username);
	}

	public void enterpassword(String Pwd) {
		Password.sendKeys(Pwd);
	}

	public void clickonloginbutton() {
		Login.click();
	}
}
