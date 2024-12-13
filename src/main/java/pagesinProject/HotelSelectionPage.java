package pagesinProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelSelectionPage {
	WebDriver driver;

    // Constructor to initialize the WebDriver
    public HotelSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By selectHotelRadioButton = By.id("radiobutton_0");
    private By continueButton = By.id("continue");

    // Actions
    public void selectHotel() {
        driver.findElement(selectHotelRadioButton).click();
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    // Method to select a hotel and continue to booking
    public void selectHotelAndContinue() {
        selectHotel();
        clickContinue();
    }

}
