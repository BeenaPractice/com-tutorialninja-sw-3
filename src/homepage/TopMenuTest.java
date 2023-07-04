package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    // Browser set up
    @Before
    // browser setup
    public void browserSetUP() {
        openBrowser(baseUrl);
    }

    //1.2 This method should click on the menu whatever name is passed as parameter.

    public void selectMenu(String menu) {

        driver.findElement(By.xpath("//a[normalize-space()='"+ menu +"']")).click();
    }


    @Test
    //  Write the following Test:
    //   1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //  1.1 Mouse hover on “Desktops” Tab and click
        mouseHover(By.xpath("//a[normalize-space()='Desktops']"));
        //   1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        selectMenu("Show AllDesktops");

        //1.3 Verify the text ‘Desktops’
        verifyText(driver, By.xpath("//h2[normalize-space()='Desktops']"), "Desktops");
    }

    @Test
    //  2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        mouseHover(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        selectMenu("Show AllLaptops & Notebooks");
        // 2.3 Verify the text ‘Laptops & Notebooks’
        verifyText(driver, By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']"), "Laptops & Notebooks");
    }
       public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
          //  3.1 Mouse hover on “Components” Tab and click
           mouseHover(By.xpath("//a[normalize-space()='Components']"));
           // 3.2 call selectMenu method and pass the menu = “Show All Components”
           selectMenu("Show AllComponents");
          //  3.3 Verify the text ‘Components’
           verifyText(driver,By.xpath("//h2[normalize-space()='Components']"),"Components");
        }

      @After
     public void tearDown(){
       closeBrowser();
     }
    }










