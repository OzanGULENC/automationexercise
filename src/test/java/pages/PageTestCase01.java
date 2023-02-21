package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class PageTestCase01 {
    public PageTestCase01(){ PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLoginButton;

    @FindBy(xpath = "//div[@class='signup-form']")
    public WebElement signUpForm;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement signUpFormNameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement signupFormEmailBox;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpFormSubmitButton;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountInformationText;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement accountInformationTitleMRButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement accountInformationNameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement accountInformationEmailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement accountInformationPasswordBox;

    @FindBy(xpath = "//div[@id='uniform-days']")
    public WebElement accountInformationBirthDay;

    @FindBy(xpath = "//div[@id='uniform-months']")
    public WebElement accountInformationBirthMonth;

    @FindBy(xpath = "//div[@id='uniform-years']")
    public WebElement accountInformationBirthYear;


}
