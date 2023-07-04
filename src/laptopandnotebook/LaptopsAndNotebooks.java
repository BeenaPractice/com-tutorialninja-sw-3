package laptopandnotebook;
/*
● Create package myaccounts
1. Create the class MyAccountsTest
1.1 create method with name "selectMyAccountOptions" it has one parameter name
"option" of type string
1.2 This method should click on the options whatever name is passed as parameter.
(Hint: Handle List of Element and Select options)
Write the following test
1. Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
1.1 Clickr on My Account Link.
1.2 Call the method “selectMyAccountOptions” method and pass the parameter
“Register”
1.3 Verify the text “Register Account”.
2. Test name verifyUserShouldNavigateToLoginPageSuccessfully()
2.1 Clickr on My Account Link.
2.2 Call the method “selectMyAccountOptions” method and pass the parameter
“Login”
2.3 Verify the text “Returning Customer”.
3. Test name verifyThatUserRegisterAccountSuccessfully()
3.1 Clickr on My Account Link.
3.2 Call the method “selectMyAccountOptions” method and pass the parameter
“Register”
3.3 Enter First Name
3.4 Enter Last Name
3.5 Enter Email
3.6 Enter Telephone
3.7 Enter Password
3.8 Enter Password Confirm
3.9 Select Subscribe Yes radio button
3.10 Click on Privacy Policy check box
3.11 Click on Continue button
3.12 Verify the message “Your Account Has Been Created!”
3.13 Click on Continue button
3.14 Clickr on My Account Link.
3.15 Call the method “selectMyAccountOptions” method and pass the parameter
“Logout”
3.16 Verify the text “Account Logout”
3.17 Click on Continue button
4. Test name verifyThatUserShouldLoginAndLogoutSuccessfully()
4.1 Clickr on My Account Link.
4.2 Call the method “selectMyAccountOptions” method and pass the parameter
“Login”
4.3 Enter Email address
4.4 Enter Last Name
4.5 Enter Password
4.6 Click on Login button
4.7 Verify text “My Account”
4.8 Clickr on My Account Link.
4.9 Call the method “selectMyAccountOptions” method and pass the parameter
“Logout”
4.10 Verify the text “Account Logout”
4.11 Click on Continue button
 */

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LaptopsAndNotebooks extends Utility {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    // Browser set up
    @Before
    // browser setup
    public void browserSetUP() {
        openBrowser(baseUrl);
    }

    //1. Test name verifyProductsPriceDisplayHighToLowSuccessfully()
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        mouseHover(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
       //1.2 Click on “Show All Laptops & Notebooks”
        clickOnElement(By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']"));
        // 1.3 Select Sort By "Price (High > Low)"
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']"),"Price (High > Low)");
        //  1.4 Verify the Product price will arrange in High to Low order.
    }
//    2. Test name verifyThatUserPlaceOrderSuccessfully()
    public void verifyThatUserPlaceOrderSuccessfully() {
        //2.1 Mouse hover on Laptops & Notebooks Tab.and click
        mouseHover(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
        //2.2 Click on “Show All Laptops & Notebooks”
        clickOnElement(By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']"));
         //   2.3 Select Sort By "Price (High > Low)"
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']"),"Price (High > Low)");
        //    2.4 Select Product “MacBook”
        clickOnElement(By.xpath("//img[@title='MacBook']"));
        //   2.5 Verify the text “MacBook”
        verifyText(driver,By.xpath("//h1[normalize-space()='MacBook']"),"MacBook");
        //    2.6 Click on ‘Add To Cart’ button
        clickOnElement(By.xpath("//button[@id='button-cart']"));
        //   2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        verifyText(driver,By.xpath("//div[@class='alert alert-success alert-dismissible']"),"Success: You have added MacBook to your shopping cart!");
//            2.8 Click on link “shopping cart” display into success message
        clickOnElement(By.xpath("//a[text()='shopping cart']"));
        //2.9 Verify the text "Shopping Cart"
        verifyText(driver,By.xpath("//h1[contains(text(),'Shopping Cart')]"),"Shopping Cart");
        //    2.10 Verify the Product name "MacBook"
        verifyText(driver,By.xpath("//a[text()='MacBook']"),"MacBook");
//            2.11 Change Quantity "2"
        sendTextToElement(By.xpath("//input[@name='quantity[31901]']"),"2");
//            2.12 Click on “Update” Tab
        clickOnElement(By.xpath("//button[@type='submit']"));
            //2.13 Verify the message “Success: You have modified your shopping cart!”
        verifyText(driver,By.xpath("//div[@class='alert alert-success alert-dismissible']"),"Success: You have modified your shopping cart!");
//            2.14 Verify the Total £737.45
        verifyText(driver,By.xpath("//tbody//tr//td[6]"),"£737.45");
//            2.15 Click on “Checkout” button
        clickOnElement(By.xpath("//a[@class='btn btn-primary']"));
            //2.16 Verify the text “Checkout”
        verifyText(driver,By.xpath("//h1[normalize-space()='Checkout']"),"Checkout");
//            2.17 Verify the Text “New Customer”
        verifyText(driver,By.xpath("//h2[normalize-space()='New Customer']"),"New Customer");
//            2.18 Click on “Guest Checkout” radio button
        clickOnElement(By.xpath("//input[@value='guest']"));
            //2.19 Click on “Continue” tab
        clickOnElement(By.xpath("//input[@id='button-account']"));
            //2.20 Fill the mandatory fields
        sendTextToElement(By.xpath("//input[@id='input-payment-firstname']"),"Prime");
        sendTextToElement(By.xpath("//input[@id='input-payment-lastname']"),"Testing");
        sendTextToElement(By.xpath("//input[@id='input-payment-email']"),"Pr1@gmail.com");
        sendTextToElement(By.xpath("//input[@id='input-payment-telephone']"),"0783453412");
        sendTextToElement(By.xpath("//input[@id='input-payment-address-1']"),"123 High street");
        sendTextToElement(By.xpath("//input[@id='input-payment-city']"),"London");
        sendTextToElement(By.xpath("//input[@id='input-payment-postcode']"),"NW2 4XZ");
        sendTextToElement(By.xpath("//select[@id='input-payment-country']"),"United Kingdom");
        sendTextToElement(By.xpath("//select[@id='input-payment-zone']"),"Middlesex");
            //2.21 Click on “Continue” Button
        clickOnElement(By.xpath("//input[@id='button-guest']"));
            //2.22 Add Comments About your order into text area
        sendTextToElement(By.xpath("//textarea[@name='comment']"),"Thank you");
            //2.23 Check the Terms & Conditions check box
        clickOnElement(By.xpath("//input[@name='agree']"));
            //2.24 Click on “Continue” button
        clickOnElement(By.xpath("//input[@id='button-payment-method']"));
            //2.25 Verify the message “Warning: Payment method required!”
        verifyText(driver,By.xpath("//div[@class='alert alert-danger alert-dismissible']"),"Warning: Payment method required!");
    }
}
