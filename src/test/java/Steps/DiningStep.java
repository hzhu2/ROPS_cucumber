package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.MenuPage;

public class DiningStep extends BaseUtil {
    private BaseUtil base;
    public DiningStep(BaseUtil base) {this.base = base;}

    @Given("^I scan the qr code and navigate to the menu page$")
    public void iScanTheQrCodeAndNavigateToTheMenuPage() throws Throwable {
        base.Driver.navigate().to("http://54.169.128.207:3000/#/home/1");
        System.out.println("Menu Page Open!");
    }

    @And("^I picked the dishes$")
    public void iPickedTheDishes() throws Throwable {
        MenuPage page = new MenuPage(base.Driver);
        page.PlaceOrder();
    }

    @And("^I place my order$")
    public void iPlaceMyOrder() throws Throwable {

    }

    @And("^I confirm my order$")
    public void iConfirmMyOrder() throws Throwable {

    }

    @And("^I make my payment$")
    public void iMakeMyPayment() throws Throwable {

    }

    @Then("^I should see payment successful info$")
    public void iShouldSeePaymentSuccessfulInfo() throws Throwable {

    }
}
