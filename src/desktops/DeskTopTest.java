package desktops;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class DeskTopTest extends Utility {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    // Browser set up
    @Before
    // browser setup
    public void browserSetUP() {
        openBrowser(baseUrl);
    }

    @Test
 //   1.Test name verifyProductArrangeInAlphabeticalOrder()
    public void verifyProductArrangeInAlphabeticalOrder() {
        //1.1 Mouse hover on Desktops Tab.and click
        mouseHover(By.xpath("//a[normalize-space()='Desktops']"));

        //1.2 Click on “Show All Desktops”
        clickOnElement(By.xpath("//a[normalize-space()='Show AllDesktops']"));
        // 1.3 Select Sort By position "Name: Z to A"
      //  mouseHover(By.xpath("//select[@id='input-sort']"));
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']"),"Name (Z - A)");

        // 1.4 Verify the Product will arrange in Descending order.

    }

    //2. Test name verifyProductAddedToShoppingCartSuccessFully()
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
       // 2.1 Mouse hover on Desktops Tab.and click
        mouseHover(By.xpath("//a[normalize-space()='Desktops']"));
      //  2.2 Click on “Show All Desktops”
        clickOnElement(By.xpath("//a[normalize-space()='Show AllDesktops']"));
      //  2.3 Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']"),"Name (A - Z)");

      //   2.4 Select product “HP LP3065”
        clickOnElement(By.xpath("//img[@title='HP LP3065']"));

       // 2.5 Verify the Text "HP LP3065"
        verifyText(driver,By.xpath("//h1[normalize-space()='HP LP3065']"),"HP LP3065");
       // 2.6 Select Delivery Date "2022-11-30"
        sendTextToElement(By.xpath("//input[@id='input-option225']"),"2022-11-30");
       // 2.7.Enter Qty "1” using Select class.
        sendTextToElement(By.xpath("//input[@id='input-quantity']"),"1");
       // 2.8 Click on “Add to Cart”button
        clickOnElement(By.xpath("//button[@id='button-cart']"));
       // 2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart !”
        verifyText(driver,By.xpath("//div[@class='alert alert-success alert-dismissible']//a[contains(text(),'HP LP3065')]"),"Success:You have added HP LP3065 to your shopping cart ");

        // 2.10 Click on link “shopping cart”display into success message
       clickOnElement(By.xpath("//a[text()='shopping cart']"));
       // 2.11 Verify the text "Shopping Cart"
        verifyText(driver,By.xpath("//h1[contains(text(),'Shopping Cart')]"),"shopping cart");
       // 2.12 Verify the Product name "HP LP3065"
        verifyText(driver,By.xpath("//a[text()='HP LP3065']"),"HP LP3065");
        // 2.13 Verify the Delivery Date "2022-11-30"
        verifyText(driver,By.xpath("//small[normalize-space()='Delivery Date:2011-04-22']"),"2022-11-30");
        // 2.14 Verify the Model "Product21"
        verifyText(driver,By.xpath("//td[normalize-space()='Product 21']"),"Product21");
        //2.15 Verify the Todat "£74.73"
        verifyText(driver,By.xpath("//tbody/tr[1]/td[6]"),"£74.73");
    }

}
