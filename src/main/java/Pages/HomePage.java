package Pages;

import Utils.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(linkText = "Manager")
    WebElement lnkManager;

    @FindBy(linkText = "New Customer")
    WebElement lnkNewCustomer;

    @FindBy(linkText = "Edit Customer")
    WebElement lnkEditCustomer;

    @FindBy(linkText = "Delete Customer")
    WebElement lnkDeleteCustomer;

    @FindBy(linkText = "New Account")
    WebElement lnkNewAccount;

    @FindBy(linkText = "Edit Account")
    WebElement lnkEditAccount;

    @FindBy(linkText = "Delete Account")
    WebElement lnkDeleteAccount;

    @FindBy(linkText = "Mini Statement")
    WebElement lnkMiniStatement;

    @FindBy(linkText = "Customised Statement")
    WebElement lnkCustomisedStatement;

    @FindBy(linkText = "Log out")
    WebElement lnkLogout;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public String get_HomePageTitle(){
        return driver.getTitle();
    }

    public NewCustomerPage getNewCustomerPage(){
        lnkNewCustomer.click();
        return new NewCustomerPage();
    }

    public LoginPage Logout(){
        lnkLogout.click();
        driver.switchTo().alert().accept();
        return new LoginPage();
    }
}
