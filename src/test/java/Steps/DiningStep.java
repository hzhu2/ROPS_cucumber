package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.FinalPage;
import pages.MenuPage;
import pages.OrderSummaryPage;
import pages.PaymentPage;

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
        page.PickOrder();
    }

    @And("^I place my order$")
    public void iPlaceMyOrder() throws Throwable {
        MenuPage page = new MenuPage(base.Driver);
        page.PlaceOrder();
    }

    @And("^I confirm my order$")
    public void iConfirmMyOrder() throws Throwable {
        OrderSummaryPage page = new OrderSummaryPage(base.Driver);
        page.ConfirmOrder();
    }

    @And("^I make my payment$")
    public void iMakeMyPayment() throws Throwable {
        PaymentPage page = new PaymentPage(base.Driver);
        page.MakePayment();
    }

    @Then("^I should see payment successful info$")
    public void iShouldSeePaymentSuccessfulInfo() throws Throwable {
        FinalPage page = new FinalPage(base.Driver);
        page.checkSuccess();
    }
}
