package com.shop.step_definition;

import java.io.IOException;
import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.log.SysoLogger;
import com.shop.utilities.ReadProperties;
import com.shop.utilities.ScreenShotMaker;
import POM.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import com.shop.utilities.*;

public class OnlyFewLeftJuices {
	
	WebDriver driver  = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	
	@Given("^launch the OWASP juice shop URL$")
	public void launch_the_OWASP_juice_shop_URL() throws IOException, DocumentException {
		ReadProperties.readProperties();
		System.setProperty("webdriver.chrome.driver", ReadProperties.driverLocation);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, HomePage.class);
		driver.get(ReadProperties.URL);
		ScreenShotMaker.screenShot(driver);
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.popUpDismiss)).click();
	}
	@When("^search the juices with only few left$")
	public void search_the_juices_with_only_few_left() throws IOException, DocumentException, InterruptedException {
		System.out.println("Number of Products identified: " + HomePage.onlyFewLeftJuices.size());
	}
	@Then("^shows the list of juices with only few left$")
	public void shows_the_list_of_juices_with_only_few_left() throws IOException, DocumentException, InterruptedException {
		for(WebElement a : HomePage.onlyFewLeftJuices) {
			wait.until(ExpectedConditions.elementToBeClickable(a)).click();
			ScreenShotMaker.screenShot(driver);
			wait.until(ExpectedConditions.elementToBeClickable(HomePage.appleJuiceReviewClose)).click();
		}
	driver.quit();
	}
}