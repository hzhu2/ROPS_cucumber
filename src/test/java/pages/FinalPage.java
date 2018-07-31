package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FinalPage {
    public FinalPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Payment has been successful')]")
    public WebElement successMsg;

    public void checkSuccess(){

        if (successMsg.getText().length() > 0) {System.out.println("Succeed! Everything!");}
        else {System.out.println("Failed");}

    }
}
