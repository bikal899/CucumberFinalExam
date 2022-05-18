package steps;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestBase;
import pages.WebPage;

public class StepDefination extends TestBase {
	WebPage webpage;

	// Given I am in Techfios WebPage

	@Given("^I am in Techfios WebPage$")
	public void i_am_in_Techfios_WebPage() throws Throwable {
		initDriver();
		Thread.sleep(5000);
		System.out.println("I am at the Techfios Web_Page");
	}

	@Given("^Verify SkyBlue Background button exists$")
	public void verify_SkyBlue_Background_button_exists() {
		webpage = PageFactory.initElements(driver, WebPage.class);
		webpage.verifySkyBlueButton();
		System.out.println("Skyblue Button Exist");
	}

	@When("^I click on the SkyBlueButton button$")
	public void i_click_on_the_button() throws Throwable {
		webpage = PageFactory.initElements(driver, WebPage.class);
		webpage.changeBackGroundColorToSkyblue();
		Thread.sleep(3000);
		System.out.println("Background Color change to skyBlue");
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		webpage = PageFactory.initElements(driver, WebPage.class);
		webpage.verifyBlueBackground();
	}
	@Given("^Verify White Background button exists$")
	public void verify_White_Background_button_exists() {
		webpage = PageFactory.initElements(driver, WebPage.class);
		webpage.verifyWhiteButton();
		System.out.println("White Background Button exist");
	}

	@Then("^Click on White Background button$")
	public void Click_on_White_Background_button() throws Throwable {
		webpage = PageFactory.initElements(driver, WebPage.class);
		webpage.changeBackGroundColorToWhite();
		Thread.sleep(3000);
	}
	@Then("^the background color will change to White$")
	public void the_background_color_will_change_to_White() {
		webpage = PageFactory.initElements(driver, WebPage.class);
		webpage.verifyWhiteBackground();
		    }
		
		
	}
