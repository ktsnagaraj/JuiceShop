package POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id="navbarAccount")
	public static WebElement account;
	@FindBy(id="navbarLoginButton")
	public static WebElement login;
	@FindBy(id="email")
	public static WebElement userName;
	@FindBy(id="password")
	public static WebElement passWord;
	@FindBy(id="loginButton")
	public static WebElement loginButton;
	@FindBy(id="navbarLogoutButton")
	public static WebElement logout;	
	@FindBy(xpath="//button[@class='mat-focus-indicator close-dialog mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	public static WebElement popUpDismiss;
	@FindBy(xpath="//div[@class='mat-tooltip-trigger product']")
	public static WebElement appleJuiceDescription;
	@FindBy(id="mat-expansion-panel-header-4")
	public static WebElement appleJuiceReview;
	@FindBy(xpath="//button[@aria-label='Close Dialog']")
	public static WebElement appleJuiceReviewClose;
	@FindBy(xpath="//*[text()='Add to Basket']")
	public static WebElement addToBasketOne;
	@FindBy(xpath="//button[@aria-label='Show the shopping cart']")
	public static WebElement yourBasket;
	@FindBy(id="checkoutButton")
	public static WebElement checkOut;
	@FindBy(id="mat-radio-40")
	public static WebElement selectAddress;
	@FindBy(xpath="//button[@aria-label='Proceed to payment selection']")
	public static WebElement proceedToPayment;	
	@FindBy(id="mat-radio-42")
	public static WebElement fastDelivery;
	@FindBy(xpath="//button[@aria-label='Proceed to delivery method selection']")
	public static WebElement continueAfterDeliverySelection;
	@FindBy(xpath="//span[contains(text(),'left')]/ancestor::mat-card")
	public static List<WebElement> onlyFewLeftJuices;
}