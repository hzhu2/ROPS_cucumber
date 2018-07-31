package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
    public OrderSummaryPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Confirm Order')]")
    public WebElement btnConfirmOrder;

    public void ConfirmOrder(){
        btnConfirmOrder.click();
    }

}
