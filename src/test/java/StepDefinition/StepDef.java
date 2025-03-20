package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.A_LoginPage;
import PageObject.B_BookingPage;
import PageObject.C_ConfirmationPage;
import PageObject.D_LogoutPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends Base_Class {

	@Before(order=0)
	public void setup() {
		log=LogManager.getLogger("StepDef");
		System.out.println("Setup method executed..");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		log.info("SetUp Executed");
		log.info("Chrome Browser Launched Sucessfully");
		log.info("Window is Maximized Sucessfully");
	}

	@Given("user Launch Chrome browser")
	public void user_launch_chrome_browser() {
		// Initialize Page Object Models
		loginpg=new A_LoginPage(driver);
		bookingpg=new B_BookingPage(driver);
		confirmationpg=new C_ConfirmationPage(driver);
		Logoutpg=new D_LogoutPage(driver);
	}
	//...............................................Login Page.........................................................
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		log.info("LoginPage page object model is executed");
		driver.get(url);
		log.info("URL opened Sucessfully");
	}

	@When("click on {string}")
	public void click_on(String UrL) {
		loginpg.clickonmakeappointmentbutton();
		log.info("Clicked On appointment Button");
	}

	@When("user enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String UName, String Pwd) {
		loginpg.enterusername(UName);
		log.info("UserName Entered");
		loginpg.enterpassword(Pwd);
		log.info("Password Entered");
	}

	@When("click on login")
	public void click_on_login() {
		loginpg.clickonloginbutton();
		log.info("Clicked On Login Button");
	}

	@Then("page title Should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			log.warn("Test Passed: Login feature: Page title matched");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
			log.warn("Test Failed: Login feature: Page title not matched");
		}
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
		log.info("Browser Closed Sucessfully After login page is executed");
	}


	//..................................................Booking Page..............................................

	@Then("user is redirected to appointment page")
	public void user_is_redirected_to_appointment_page() {
		log.info("BookingPage page object model is executed");
		System.out.println("User is Redirected to Booking Page");
		log.info("User is redirected to BookingPage");
	}

	@When("user click on Facility")
	public void user_click_on_facility() {
		bookingpg.clickonfacility();
		log.info("Clicked on Facility");
	}

	@When("select the Type of Facility")
	public void select_the_type_of_facility() {
		bookingpg.typeoffacility();
		log.info("User Select the type of Facility");
	}

	@When("select the type of healthcare program")
	public void select_the_type_of_healthcare_program() {
		bookingpg.selecthealthcareprogram();
		log.info("User Selected the Health Care Program");
	}

	@When("click on visit date icon")
	public void click_on_visit_date_icon() {
		bookingpg.clickOnvisitdateicon();
		log.info("Clicked on Visit Date icon");
	}

	@When("select the visit date")
	public void select_the_visit_date() {
		bookingpg.selectvisitdate();
		log.info("User Selected the Visit Date");
	}

	@When("click on comment")
	public void click_on_comment() {
		bookingpg.clickoncomment();
		log.info("Clicked on Comment icon");
	}

	@When("enters comment {string}")
	public void enters_comment(String com) {
		bookingpg.entercomment(com);
		log.info("User Entered Comment");
	}

	@When("click on book appointment")
	public void click_on_book_appointment() {
		bookingpg.clickonbookappointment();
		log.info("User Clicked on BookAppointment Button");
	}

	@Then("user is redirected to confirmation page")
	public void user_is_redirected_to_confirmation_page() {
		System.out.println("User is redirected to Confirmation Page");
		log.info("User is redirected to Confirmation Page");
	}

	//..................................................Confirmation Page..............................................

	@When("verifies page title as {string}")
	public void verifies_page_title_as(String ConfirmationPageTitle) {
		log.info("ConfirmationPage page object model is executed");
		if(confirmationpg.verifyconfirmationtitle().equals(ConfirmationPageTitle)) {
			log.warn("Test Passed: Confirmation feature: Page title matched");
			System.out.println("Title Verified");
		}else {
			log.warn("Test Failed: Confirmation feature: Page title not matched");
			System.out.println("Invalid Title");
		}
	}

	@When("verifies facility as {string}")
	public void verifies_facility_as(String Facility) {
		if(confirmationpg.verifyfacility().equals(Facility)) {
			log.warn("Test Passed: Confirmation feature: Facility matched");
			System.out.println("Facility Verified");
		}else {
			System.out.println("Invalid Facility");
			log.warn("Test Failed: Confirmation feature: Facility not matched");
		}
	}

	@When("verifies hospitalreadmission as {string}")
	public void verifies_hospitalreadmission_as(String HospitalReAdmission) {
		if(confirmationpg.verifyhospitalreadmission().equals(HospitalReAdmission)) {
			log.warn("Test Passed: Confirmation feature: HospitalReAdmission matched");
			System.out.println("HospitalReadmission Verified");
		}else {
			System.out.println("Invalid HospitalReadmission");
			log.warn("Test Failed: Confirmation feature: HospitalReadmission not matched");
		}
	}

	@When("verifies healthcareprogram as {string}")
	public void verifies_healthcareprogram_as(String HealthCareProgramme) {
		if(confirmationpg.verifyhealthcareprogram().equals(HealthCareProgramme)) {
			log.warn("Test Passed: Confirmation feature: HealthCareProgramme matched");
			System.out.println("Healthcare Program Verified");
		}else {
			System.out.println("Invalid Program");
			log.warn("Test Failed: Confirmation feature: HealthCareProgramme not matched");
		}
	}

	@When("verifies visitdate as {string}")
	public void verifies_visitdate_as(String VisitDate) {
		if(confirmationpg.verifyvisitdate().equals(VisitDate)){
			log.warn("Test Passed: Confirmation feature: VisitDate matched");
			System.out.println("Visit Date Verified");
		}else {
			System.out.println("Invalid Visit Date");
			log.warn("Test Failed: Confirmation feature: VisitDate not matched");
		}
	}

	@When("verifies comment as {string}")
	public void verifies_comment_as(String CoMment) {
		if(confirmationpg.verifycomment().equals(CoMment)){
			log.warn("Test Passed: Confirmation feature: Comment matched");
			System.out.println("Comment Verified");
		}else {
			System.out.println("Invalid Comment");
			log.warn("Test Failed: Confirmation feature: Comment not matched");
		}
	}

	@Then("user confirms the confirmation page")
	public void user_confirms_the_confirmation_page() {
		System.out.println("Confirmation Page is Verified");
		log.info("ConfirmationPage is Verified");
	}

	//..................................................Logout Page..............................................

	@When("Confirmation page is verified")
	public void confirmation_page_is_verified() {
		log.info("LogoutPage Page Object model is executed");
		System.out.println("Confirmation page is Verified and user wants to logout from website");
		log.info("User wants to Logout from Website");
	}

	@When("user clicks on menubar")
	public void user_clicks_on_menubar() {
		Logoutpg.clickonmenubar();
		log.info("Clicked on Menu bar");
	}

	@When("clicked on Logout button")
	public void clicked_on_logout_button() {
		Logoutpg.clickonlogout();
		log.info("Clicked on Logout button");
	}

	@Then("user sucessfully logout from the website")
	public void user_sucessfully_logout_from_the_website() {
		System.out.println("User Sucessfully Logout from Website");
		log.info("User SucessfullY logout from the Website");
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {
		try {
			//  Check if driver session is active before capturing screenshot
			if (driver != null && ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES) != null) {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", scenario.getName());
			} else {
				System.out.println("Skipping screenshot: WebDriver session is already closed.");
			}
		} catch (Exception e) {
			System.out.println("Error capturing screenshot: " + e.getMessage());
		}
	}

	@After(order=1)
	public void teardown(Scenario sc) {
		System.out.println("TearDown method executed..");
		//If Any Scenario is failed then screen shot is taken..Otherwise Not
		if(sc.isFailed()==true) {
			String fileWithPath="C:\\Users\\hp5cd\\Eclipse_Cucumber\\Cucumber_BDD\\Screenshot\\test.png";
			TakesScreenshot scrShot=((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File(fileWithPath);
			try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		driver.quit();
		log.info("TearDown Executed");
		log.info("Browser Closed Sucessfully");
	}
}
