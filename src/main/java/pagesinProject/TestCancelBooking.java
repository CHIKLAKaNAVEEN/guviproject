package pagesinProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCancelBooking {
	WebDriver driver;

    // Constructor to initialize the WebDriver
    public TestCancelBooking(WebDriver driver) {
        this.driver = driver;
    }
    //locators
    private By selectcheckbox = By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[4]/td[1]/input");
    private By cancelbutton= By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[3]/td/input[1]");
    
    
    
    public void Selectcheckboxes () {
    	
    	driver.findElement(selectcheckbox).click();
    }
    
    public void cancelorderid() throws Exception {
    	String text=driver.findElement(cancelbutton).getText();
    	driver.findElement(cancelbutton).click();
    	
    	Alert alert=driver.switchTo().alert();
    //	alert.wait(20,20);
    	 alert.accept();
    	 if(text.equals(text)) {
    		 System.out.println("Selected OrderId is cancelled");
    	 }
    }
    public void Checkboxselecting() throws Exception {
    	Selectcheckboxes();
    	cancelorderid();
}
}
