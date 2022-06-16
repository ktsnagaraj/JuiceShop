package com.shop.step_definition;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.itextpdf.text.DocumentException;
import com.shop.utilities.ScreenShotMaker;
import POM.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JuiceCheckOut {
	
	WebDriver driver  = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	
	@Given("^launch the juice shop OWASP URL$")
	public void launch_the_juice_shop_OWASP_URL() throws IOException, DocumentException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dra Nallely Corona\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, HomePage.class);
		driver.get("https://juice-shop.herokuapp.com/");
		ScreenShotMaker.screenShot(driver);
		HomePage.popUpDismiss.click();
	}
	
	@And("^login into the account$")
	public void login_into_the_account() throws IOException, DocumentException {
		HomePage.account.click();
		ScreenShotMaker.screenShot(driver);
		HomePage.login.click();
		ScreenShotMaker.screenShot(driver);
		HomePage.userName.sendKeys("ktsnagaraj@outlook.com");
		ScreenShotMaker.screenShot(driver);
		HomePage.passWord.sendKeys("tsaThish27*");
		ScreenShotMaker.screenShot(driver);
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.loginButton)).click();
		ScreenShotMaker.screenShot(driver);
	}
	
	@When("^the juice is selected to add into the basket$")
	public void the_juice_is_selected_to_add_into_the_basket() throws IOException, DocumentException {
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.addToBasketOne)).click();
		ScreenShotMaker.screenShot(driver);
		HomePage.yourBasket.click();
		ScreenShotMaker.screenShot(driver);
	}
	
	@And("^checkout the selected juice to the address$")
	public void checkout_the_selected_juice_to_the_address() throws IOException, DocumentException {
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.checkOut)).click();
		ScreenShotMaker.screenShot(driver);
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.selectAddress)).click();
		ScreenShotMaker.screenShot(driver);
		HomePage.proceedToPayment.click();
		ScreenShotMaker.screenShot(driver);
	}
	
	@Then("delivery speed displayed to choose before Payments option")
	public void delivery_speed_displayed_to_choose_before_Payments_option() throws IOException, DocumentException {
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.fastDelivery)).click();
		ScreenShotMaker.screenShot(driver);
		HomePage.account.click();
		ScreenShotMaker.screenShot(driver);
		HomePage.logout.click();
		ScreenShotMaker.screenShot(driver);
		driver.quit();
	}
}