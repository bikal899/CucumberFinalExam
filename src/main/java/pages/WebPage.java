package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPage {
	WebDriver driver;

	public WebPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SkyBlue;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement White;
	@FindBy(how = How.TAG_NAME, using = "body")
	WebElement BACKGROUND_PAGE_BODY;

	public void changeBackGroundColorToSkyblue() {
		SkyBlue.click();

	}

	public void changeBackGroundColorToWhite() {
		White.click();

	}

	public String getPageTitle() {

		return driver.getTitle();

	}

	public void verifySkyBlueButton() {
		WebElement BgcolorSb = SkyBlue;
		String Bg = BgcolorSb.getText();
		Assert.assertEquals("WrongPage!!!", Bg, "Set SkyBlue Background");

	}

	public void verifyWhiteButton() {
		WebElement BgcolorWh = White;
		String Bgw = BgcolorWh.getText();
		Assert.assertEquals("WrongPage!!!", Bgw, "Set White Background");

	}

	public void verifyBlueBackground() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.attributeContains(BACKGROUND_PAGE_BODY, "style", "background-color: skyblue;"));

	}
	
	public void verifyWhiteBackground() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.attributeContains(BACKGROUND_PAGE_BODY, "style", "background-color: white;"));
	}
}
