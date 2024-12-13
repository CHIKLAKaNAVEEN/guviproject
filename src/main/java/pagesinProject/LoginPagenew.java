package pagesinProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagenew {

    WebDriver driver;
    public LoginPagenew(WebDriver driver) {
        this.driver = driver;
    }


    // Locators for username, password, and login button
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login");

    // Actions (Methods for interacting with the page)
    public void enterUsername(String username) {
        WebElement usernameElem = driver.findElement(usernameField);
        if (usernameElem != null) {
            usernameElem.sendKeys(username);
        } else {
            System.out.println("Username field is not found!");
        }
    }

    public void enterPassword(String password) {
        WebElement passwordElem = driver.findElement(passwordField);
        if (passwordElem != null) {
            passwordElem.sendKeys(password);
        } else {
            System.out.println("Password field is not found!");
        }
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    // Method to log in using username and password
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}