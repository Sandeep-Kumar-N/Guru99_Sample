package Pages;

import Utils.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(name="emailid")
    WebElement edtEmail;

    @FindBy(name="btnLogin")
    WebElement btnLogin;

    @FindBy(linkText = "Bank Project")
    WebElement lnkBankProject;

    @FindBy(name="uid")
    WebElement edtUserName;

    @FindBy(name="password")
    WebElement edtPassword;

    @FindBy(name="btnReset")
    WebElement btnReset;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public String get_LoginPageTitle(){
        return driver.getTitle();
    }

    public HomePage Login(String username, String password){
        edtUserName.sendKeys(prop.getProperty("username"));
        edtPassword.sendKeys(prop.getProperty("password"));
        btnLogin.click();
        return new HomePage();
    }

    public void Reset_Credentials(){
        btnReset.click();
    }



}
