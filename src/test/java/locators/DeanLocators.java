package locators;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeanLocators {

    public DeanLocators() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement mainLogin;


    @FindBy(xpath = "//input[@id='username']")
    public WebElement mainLoginUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement mainLoginPassword;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement userLogin;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement mainMenu;

    @FindBy(xpath = "(//div[@class='justify-content-start flex-grow-1 fs-5 ps-3 navbar-nav'])[2]/a[text()='Dean Management']")
    public WebElement mainMenuDeanManagement;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement deanManagementAddName;

    @FindBy(xpath = "//input[@placeholder='Surname']")
    public WebElement deanManagementAddSurname;

    @FindBy(xpath = "//input[@placeholder='Birth Place']")
    public WebElement deanManagementAddBirthPlace;

    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public WebElement deanManagementAddPhone;

    @FindBy(xpath = "//input[@placeholder='ssn']")
    public WebElement deanManagementAddSsn;

    @FindBy(xpath = "//input[@placeholder='username']")
    public WebElement deanManagementAddUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement deanManagementAddPassword;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderFemale;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMale;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement deanManagementAddBirthDay;

    @FindBy(xpath = "//div[@class='mx-auto p-3']/button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement addDeanSubmitButton;


}
