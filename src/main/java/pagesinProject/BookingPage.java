package pagesinProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage {
	WebDriver driver;

    // Constructor to initialize the WebDriver
    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By firstNameField = By.id("first_name");
    private By lastNameField = By.id("last_name");
    private By addressField = By.id("address");
    private By creditCardNumField = By.id("cc_num");
    private By creditCardTypeField = By.id("cc_type");
    private By creditCardExpiryMonthField = By.id("cc_exp_month");
    private By creditCardExpiryYearField = By.id("cc_exp_year");
    private By creditCardCvvField = By.id("cc_cvv");
    private By bookNowButton = By.id("book_now");
    private By myitinerary =By.id("my_itinerary");

    // Actions
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void enterCreditCardNum(String cardNum) {
        driver.findElement(creditCardNumField).sendKeys(cardNum);
    }

    public void selectCreditCardType(String cardType) {
        driver.findElement(creditCardTypeField).sendKeys(cardType);
    }

    public void selectCreditCardExpiryMonth(String month) {
        driver.findElement(creditCardExpiryMonthField).sendKeys(month);
    }

    public void selectCreditCardExpiryYear(String year) {
        driver.findElement(creditCardExpiryYearField).sendKeys(year);
    }

    public void enterCreditCardCvv(String cvv) {
        driver.findElement(creditCardCvvField).sendKeys(cvv);
    }

    public void clickBookNow() throws Exception {
  
        driver.findElement(bookNowButton).click();
        Thread.sleep(3000);
    }
    public void buttonmyitinerary() {
        driver.findElement(myitinerary).click();
    }

    // Method to complete booking
    public void completeBooking(String firstName, String lastName, String address, String cardNum, String cardType,
                                String expiryMonth, String expiryYear, String cvv) throws Exception {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterAddress(address);
        enterCreditCardNum(cardNum);
        selectCreditCardType(cardType);
        selectCreditCardExpiryMonth(expiryMonth);
        selectCreditCardExpiryYear(expiryYear);
        enterCreditCardCvv(cvv);
        clickBookNow();
        buttonmyitinerary();
    }
}
