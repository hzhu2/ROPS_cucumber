package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
    public MenuPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//li[2]//input[1]")
    public WebElement txtDish1;

    @FindBy(how = How.XPATH, using = "//li[3]//input[1]")
    public WebElement txtDish2;

    @FindBy(how = How.XPATH, using = "//li[5]//input[1]")
    public WebElement txtDish3;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Place Order')]")
    public WebElement btnPlaceOrder;

    public void PickOrder(){
        txtDish1.click();
        txtDish2.click();
        txtDish3.click();

    }

    public void PlaceOrder(){
        btnPlaceOrder.click();
    }

}
