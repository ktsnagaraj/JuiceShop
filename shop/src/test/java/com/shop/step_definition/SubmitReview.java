package com.shop.step_definition;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.itextpdf.text.DocumentException;
import com.shop.utilities.ReadProperties;
import com.shop.utilities.ScreenShotMaker;
import POM.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmitReview {
	
	WebDriver driver  = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	
	@Given("^launch the Juice shop URL$")
	public void launch_the_Juice_shop_URL() throws IOException, DocumentException {
		ReadProperties.readProperties();
		System.setProperty("webdriver.chrome.driver", ReadProperties.driverLocation);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, HomePage.class);
		driver.get(ReadProperties.URL);
		ScreenShotMaker.screenShot(driver);
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.popUpDismiss)).click();
	}
	@And("^login with valid account details$")
	public void login_with_valid_account_details() throws IOException, DocumentException, InterruptedException {
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
	@When("^I select the product review$")
	public void I_select_the_product_review() throws IOException, DocumentException, InterruptedException {
		System.out.println("Number of Products identified: " + HomePage.onlyFewLeftJuices.size());
	}
	@And("^enter the review comments$")
	public void enter_the_review_comments() throws IOException, DocumentException, InterruptedException {
		System.out.println("Number of Products identified: " + HomePage.onlyFewLeftJuices.size());
	}
	@Then("^I submit it successfully$")
	public void I_submit_it_successfully() throws IOException, DocumentException, InterruptedException {
		
		HomePage.account.click();
		ScreenShotMaker.screenShot(driver);
		HomePage.logout.click();
		ScreenShotMaker.screenShot(driver);
		driver.quit();
	driver.quit();
	}
}