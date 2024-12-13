package utilsactionpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesinProject.BookingPage;
import pagesinProject.HotelSearchPage;
import pagesinProject.HotelSelectionPage;
import pagesinProject.LoginPagenew;
import pagesinProject.TestCancelBooking;

public class HotelBookingTest {
	 
	
	WebDriver driver;
	    @BeforeClass
	    public void setup() {
	        // Initialize WebDriver (firefox)
	    	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
			  driver= new ChromeDriver();
			  driver.get("https://adactinhotelapp.com/index.php");
	          driver.manage().window().maximize();
	          driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	      

	    }

	          @Test
	          public void testHotelBooking() throws Exception {
	              // Check that driver is not null before using it
	              if (driver == null) {
	                  throw new IllegalStateException("WebDriver is not initialized properly.");
	              }

	              // Step 1: Open the Adactin Hotel page
	              driver.get("https://adactinhotelapp.com/");

	              // Initialize the LoginPage with the WebDriver
	              LoginPagenew loginPage = new LoginPagenew(driver);
	              loginPage.login("adactintestingsite", "10qh1a1206@");  // Use valid credentials

	              // Step 2: Search for a hotel
	              HotelSearchPage hotelSearchPage = new HotelSearchPage(driver);
	              hotelSearchPage.searchHotel("Sydney", "Hotel Creek", "Standard", "1 - One", "2024-12-10", "2024-12-12", "2 - Two", "0 - None");

	              // Step 3: Select a hotel from the search results
	              HotelSelectionPage hotelSelectionPage = new HotelSelectionPage(driver);
	              hotelSelectionPage.selectHotelAndContinue();

	              // Step 4: Complete the booking
	              BookingPage bookingPage = new BookingPage(driver);
	              bookingPage.completeBooking("John", "Doe", "123 Main Street, City, Country", "1234567812345678", "VISA", "July", "2026", "123");

	            /*  // Step 5: Assert the booking confirmation
	              String confirmationMessage = driver.getPageSource();
	              Assert.assertTrue(confirmationMessage.contains("Booking Confirmation")); */
	              
	              
	              TestCancelBooking cancel = new TestCancelBooking(driver);
	              cancel.Checkboxselecting();
	          }
/*
	          @AfterClass
	          public void tearDown() {
	              // Close the browser after the test is finished
	              if (driver != null) {
	                  driver.quit();
	              } 
	          } */
}
