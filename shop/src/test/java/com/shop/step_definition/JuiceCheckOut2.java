package com.shop.step_definition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shop.utilities.ScreenShotMaker;

import POM.HomePage;

public class JuiceCheckOut2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dra Nallely Corona\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		try {
		PageFactory.initElements(driver, HomePage.class);
		driver.get("https://juice-shop.herokuapp.com/");
		ScreenShotMaker.screenShot(driver);
		HomePage.popUpDismiss.click();
		ScreenShotMaker.screenShot(driver);
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
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.addToBasketOne)).click();
		ScreenShotMaker.screenShot(driver);
		HomePage.yourBasket.click();
		ScreenShotMaker.screenShot(driver);
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.checkOut)).click();
		ScreenShotMaker.screenShot(driver);
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.selectAddress)).click();
		ScreenShotMaker.screenShot(driver);
		HomePage.proceedToPayment.click();
		ScreenShotMaker.screenShot(driver);
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.fastDelivery)).click();
		ScreenShotMaker.screenShot(driver);
		HomePage.account.click();
		ScreenShotMaker.screenShot(driver);
		HomePage.logout.click();
		ScreenShotMaker.screenShot(driver);
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		driver.quit();
	}
	}
}