package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BillingPage extends Utility {
    //  By firstNameLink=By.id("BillingNewAddress_FirstName");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameLink;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameLink;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailLink;

    @CacheLookup
    @FindBy(id = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryLink;
    //By cityLink = By.id("BillingNewAddress_City");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityLink;
    // By addressLink = By.id("BillingNewAddress_Address1");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressLink;
    // By postCodeLink = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCodeLink;
    //  By phoneNumberLink = By.id("BillingNewAddress_PhoneNumber");
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement phoneNumberLink;
    //By continueLink = By.xpath("//button[@onclick='Billing.save()']");
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement clickOnElement;
    //By shippingLink = By.id("shippingoption_1");
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement shippingLink;
    //By shippingLink2 = By.id("shippingoption_2");
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement shippingLink2;
    // By creditCardLink = By.id("paymentmethod_1");
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardLink;
    //By paymentMethodLink = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentMethodLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement cardLink;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement cardMonthLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement cardYearLink;
    //By cardCVVLink = By.xpath("//input[@id='CardCode']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCVVLink;
    // By creditCardTextLink = By.xpath("//li[@class='payment-method']");
    @CacheLookup
    @FindBy(xpath = "/li[@class='payment-method']")
    WebElement creditCardTextLink;
    // By shippingMethodText = By.xpath("//li[@class='shipping-method']");
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethodText;
    // By totalText = By.xpath("//span[@class='value-summary']//strong[starts-with(text(),'$')]");
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[starts-with(text(),'$')]")
    WebElement totalText;
    // By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;
    // By headText = By.xpath("//div[@class='page-title']//h1[text()='Thank you']");
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']//h1[text()='Thank you']")
    WebElement headText;

    // By successText = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successText;
    //By continueButton = By.xpath("//button[normalize-space()='Continue']");
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    // By nextStep = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement nextStep;

    // By paymentNextStep = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentNextStep;
    // By paymentInfoNextLink = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement paymentInfoNextLink;


    public void enterFirstname(String name) {
        sendTextToElement(firstNameLink, name);
        Reporter.log("enter first name" + firstNameLink.toString());
        CustomListeners.test.log(Status.PASS, "enter first name" + firstNameLink);
    }

    public void enterLastname(String name) {
        sendTextToElement(lastNameLink, name);
        Reporter.log("enter last name" + lastNameLink.toString());
        CustomListeners.test.log(Status.PASS, "enter last name" + lastNameLink);

    }

    public void enterEmail(String email) {
        sendTextToElement(emailLink, email);
        Reporter.log("enter email name" + emailLink.toString());
        CustomListeners.test.log(Status.PASS, "enter email name" + emailLink);

    }

    public void selectCountry(String country) {
        selectByVisibleTextFromDropDown(countryLink, country);
        Reporter.log("select Contry from DropDown" + countryLink.toString());
        CustomListeners.test.log(Status.PASS, "enter email name" + countryLink);
    }

    public void enterCity(String city) {
        sendTextToElement(cityLink, city);
        Reporter.log("enter city to dropdownlist" + cityLink.toString());
        CustomListeners.test.log(Status.PASS, "enter city to dropdownlist" + cityLink);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressLink, address);
        Reporter.log("enter adress to adreeslink" + addressLink.toString());
        CustomListeners.test.log(Status.PASS, "enter city to dropdownlist" + addressLink);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(postCodeLink, postcode);
        Reporter.log("enter  postcode" + postCodeLink.toString());
        CustomListeners.test.log(Status.PASS, "enter postcode" + postCodeLink);

    }

    public void enterPhoneNumber(String number) {
        sendTextToElement(phoneNumberLink, number);
        Reporter.log("enterPhoneNumer" + phoneNumberLink.toString());
        CustomListeners.test.log(Status.PASS, "enter PhoneNumber" + phoneNumberLink);

    }

    public void clickContinue() {
        clickOnElement(continueButton);
        Reporter.log("enterPhoneNumer" + continueButton.toString());
        CustomListeners.test.log(Status.PASS, "enter PhoneNumber" + continueButton);

    }

    public void selectShipping() {
        clickOnElement(shippingLink);
    }

    public void clickCreditCard() {
        clickOnElement(creditCardLink);
    }

    public void selectPaymentMethod() {
        clickOnElement(paymentMethodLink);
    }

    public void selectCard(int index) {
        selectByIndexFromDropDown(cardLink, index);
    }

    public void enterCardHolderName(String name) {
        sendTextToElement(cardHolderNameLink, name);
    }

    public void enterCardNumber(String number) {
        sendTextToElement(cardNumberLink, number);
    }

    public void selectExpiryMonth(int month) {
        selectByIndexFromDropDown(cardMonthLink, month);
    }

    public void selectExpiryYear(int year) {
        selectByIndexFromDropDown(cardYearLink, year);
    }

    public void enterCVV(String cvv) {
        sendTextToElement(cardCVVLink, cvv);
    }

    public String getPaymentText() {
        return getTextFromElement(creditCardTextLink);
    }

    public String getShippingText() {
        return getTextFromElement(shippingMethodText);
    }

    public String getPriceText() {
        return getTextFromElement(totalText);
    }

    public void clickConfirm() {
        clickOnElement(confirmButton);
    }

    public String getHeadText() {
        return getTextFromElement(headText);
    }

    public String getSuccessText() {
        return getTextFromElement(successText);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnContinue() {
        clickOnElement(nextStep);
    }

    public void clickPaymentContinue() {
        clickOnElement(paymentNextStep);
    }

    public void clickOnPaymentContinue() {
        clickOnElement(paymentInfoNextLink);
    }

    public void selectShipping2() {
        clickOnElement(shippingLink2);
    }
}



