package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_ConfirmationPage {
	WebDriver ldriver;

	public C_ConfirmationPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver,this);
	}

	@FindBy(xpath="//h2[normalize-space()='Appointment Confirmation']")
	private WebElement ConfirmationTitle;

	@FindBy(xpath="//p[@id='facility']")
	private WebElement Facility;

	@FindBy(xpath="//p[@id='hospital_readmission']")
	private WebElement HospitalReadmission;

	@FindBy(xpath="//p[@id='program']")
	private WebElement HealthCareProgram;

	@FindBy(xpath="//p[@id='visit_date']")
	private WebElement VisitDate;

	@FindBy(xpath="//p[@id='comment']")
	private WebElement Comment;

	public String verifyconfirmationtitle() {
		return ConfirmationTitle.getText();
	}

	public String verifyfacility() {
		return Facility.getText();
	}

	public String verifyhospitalreadmission() {
		return HospitalReadmission.getText();
	}

	public String verifyhealthcareprogram() {
		return HealthCareProgram.getText();
	}

	public String verifyvisitdate() {
		return VisitDate.getText();
	}

	public String verifycomment() {
		return Comment.getText();
	}
}
