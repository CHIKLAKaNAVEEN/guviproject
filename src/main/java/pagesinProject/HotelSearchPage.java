package pagesinProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelSearchPage {

    WebDriver driver;

    // Constructor to initialize the WebDriver
    public HotelSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By locationDropdown = By.name("location");
    private By hotelDropdown = By.name("hotels");
    private By roomTypeDropdown = By.name("room_type");
    private By roomNoDropdown = By.name("room_nos");
    private By dateInField = By.name("datepick_in");
    private By dateOutField = By.name("datepick_out");
    private By adultRoomDropdown = By.name("adult_room");
    private By childRoomDropdown = By.name("child_room");
    private By searchButton = By.name("Submit");
    
    // Actions
    public void selectLocation(String location) {
        Select locationSelect = new Select(driver.findElement(locationDropdown));
        locationSelect.selectByVisibleText(location);
    }

    public void selectHotel(String hotel) {
        Select hotelSelect = new Select(driver.findElement(hotelDropdown));
        hotelSelect.selectByVisibleText(hotel);
    }

    public void selectRoomType(String roomType) {
        Select roomTypeSelect = new Select(driver.findElement(roomTypeDropdown));
        roomTypeSelect.selectByVisibleText(roomType);
    }

    public void selectRoomNumber(String roomNumber) {
        Select roomNoSelect = new Select(driver.findElement(roomNoDropdown));
        roomNoSelect.selectByVisibleText(roomNumber);
    }

    public void enterCheckInDate(String date) {
        driver.findElement(dateInField).sendKeys(date);
    }

    public void enterCheckOutDate(String date) {
        driver.findElement(dateOutField).sendKeys(date);
    }

    public void selectAdultRoom(String adults) {
        Select adultSelect = new Select(driver.findElement(adultRoomDropdown));
        adultSelect.selectByVisibleText(adults);
    }

    public void selectChildRoom(String children) {
        Select childSelect = new Select(driver.findElement(childRoomDropdown));
        childSelect.selectByVisibleText(children);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
 /*public void Clickmyitinerary() {
	
	driver.findElement(By.id("my_itinerary"));
	
} */
    // Method to fill out the hotel search form and search
    public void searchHotel(String location, String hotel, String roomType, String roomNumber, String checkInDate,
                             String checkOutDate, String adults, String children) {
        selectLocation(location);
        selectHotel(hotel);
        selectRoomType(roomType);
        selectRoomNumber(roomNumber);
        enterCheckInDate(checkInDate);
        enterCheckOutDate(checkOutDate);
        selectAdultRoom(adults);
        selectChildRoom(children);
        clickSearch();
       // Clickmyitinerary();
    }

}
