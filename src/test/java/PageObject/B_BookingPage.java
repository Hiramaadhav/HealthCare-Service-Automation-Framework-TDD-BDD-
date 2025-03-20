package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_BookingPage {

	WebDriver ldriver;
	
	public B_BookingPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver,this);
	}

	@FindBy(xpath="//select[@id='combo_facility']")
	private WebElement ClickOnFacility;

	@FindBy(xpath="//option[@value='Seoul CURA Healthcare Center']")
	private WebElement TypeOfFacility;

	@FindBy(xpath="//input[@id='radio_program_medicaid']")
	private WebElement SelectHealthCareProgram;

	@FindBy(xpath="//input[@id='txt_visit_date']")
	private WebElement ClickOnVisitDateIcon;

	@FindBy(xpath="//td[normalize-space()='31']")
	private WebElement SelectVisitDate;

	@FindBy(xpath="//textarea[@id='txt_comment']")
	private WebElement ClickOnComment;

	@FindBy(xpath="//button[@id='btn-book-appointment']")
	private WebElement ClickOnBookAppointment;

	public void clickonfacility() {
		ClickOnFacility.click();
	}

	public void typeoffacility() {
		TypeOfFacility.click();
	}

	public void selecthealthcareprogram() {
		SelectHealthCareProgram.click();
	}

	public void clickOnvisitdateicon() {
		ClickOnVisitDateIcon.click();
	}

	public void selectvisitdate() {
		SelectVisitDate.click();
	}

	public void clickoncomment() {
		ClickOnComment.click();
	}
	
	public void entercomment(String Comment) {
		ClickOnComment.sendKeys(Comment);
	}

	public void clickonbookappointment() {
		ClickOnBookAppointment.click();
	}
}
