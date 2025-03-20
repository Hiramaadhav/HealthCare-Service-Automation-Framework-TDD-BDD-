package StepDefinition;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import PageObject.B_BookingPage;
import PageObject.C_ConfirmationPage;
import PageObject.A_LoginPage;
import PageObject.D_LogoutPage;

public class Base_Class {
	public static WebDriver driver;
	public A_LoginPage loginpg;
	public B_BookingPage bookingpg;
	public C_ConfirmationPage confirmationpg;
	public D_LogoutPage Logoutpg;
	public static Logger log;
}
