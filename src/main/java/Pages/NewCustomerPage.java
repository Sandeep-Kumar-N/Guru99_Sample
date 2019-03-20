package Pages;

import Utils.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage extends TestBase {

    @FindBy(name="name")
    WebElement editCustomerName;

    @FindBy(xpath = "//input[contains(text()='male')]")
    WebElement rdoMale;

    @FindBy(xpath = "//input[contains(text()='female')]")
    WebElement rdoFemale;

    @FindBy(name="dob")
    WebElement dtDOB;

    @FindBy(name="addr")
    WebElement txtAreaAddress;

    @FindBy(name="city")
    WebElement editCity;

    @FindBy(name="state")
    WebElement editState;

    @FindBy(name="pinno")
    WebElement editPIN;

    @FindBy(name="telephoneno")
    WebElement editTelephone;

    @FindBy(name="emailid")
    WebElement editEmailID;

    @FindBy(name="Submit")
    WebElement btnSubmit;

    @FindBy(name="Reset")
    WebElement btnReset;

    @FindBy(xpath="//a[text()='Home']")
    WebElement lnkHome;

    public NewCustomerPage(){
        PageFactory.initElements(driver,this);
    }

    public String get_NewCustomerPageTitle(){
        return driver.getTitle();
    }

    public HomePage NavigateHome(){
        lnkHome.click();
        return new HomePage();
    }

    public void Enter_NewCustomerData(String name, String gender, String dob, String address, String city,
                        String state, String pin, String phonenumber, String emailid){

        editCustomerName.sendKeys(name);
        if (gender.equalsIgnoreCase("MALE")){
            rdoMale.click();
        }else{
            rdoFemale.click();
        }
        dtDOB.sendKeys(dob);
        txtAreaAddress.sendKeys(address);
        editCity.sendKeys(city);
        editState.sendKeys(state);
        editPIN.sendKeys(pin);
        editTelephone.sendKeys(phonenumber);
        editEmailID.sendKeys(emailid);
    }

    public void reset_CustomerData(){
        btnReset.click();
    }

    public void submit_CustomerData(){
        btnSubmit.click();
    }
}
