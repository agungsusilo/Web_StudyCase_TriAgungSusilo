package demo.steps_definition;

import demo.pages.pos.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @Given("User is on moka start page android")
  public void userIsOnMokaStartPageAndroid() {
    startPage.isOnPage();
  }

  @When("User click sign in button on moka start page android")
  public void userClickSignInButtonOnMokaStartPageAndroid() {
    startPage.clikSignInButton();
  }

  @And("User input email {string} on email form")
  public void userInputEmailOnEmailForm(String imel) {
    startPage.inputEmail(imel);
  }

  @And("User input password {string} on password form")
  public void userInputPasswordOnPasswordForm(String pass) {
    startPage.inputPassword(pass);
  }

  @And("User click signIn button")
  public void userClickSignInButton() {
    startPage.clickbuttonSignIn();

  }

  @And("user see main page")
  public void userSeeMainPage() {
    boolean result = startPage.isOnHomePage();
    Assert.assertTrue(result);
  }

  @When("User click {string} on favourite menu {int} times")
  public void userClickOnFavouriteMenuTimes(String namaitem, int banyak) {
    startPage.addItem(namaitem, banyak);
  }

  @And("User see the {string} on shopping cart")
  public void userSeeTheOnShoppingCart(String namaitem) {
    boolean result = startPage.itemOnShopchart(namaitem);
    Assert.assertTrue(result);
  }

  @And("User click charge button on shopping cart")
  public void userClickChargeButtonOnShoppingCart() {
    startPage.clickCheckoutButton();
  }

  @And("User choose cash option with exact amount to be paid")
  public void userChooseCashOptionWithExactAmountToBePaid() {
    startPage.clickLowestAmount();
  }

  @And("User click charge button on checkout pop-up")
  public void userClickChargeButtonOnCheckoutPopUp() {
    startPage.clickFinalCharge();
  }

  @Then("User see the receipt page")
  public void userSeeTheReceiptPage() {
    boolean result = startPage.isOnReceiptPage();
    Assert.assertTrue(result);
  }

  @And("User click No thank you button")
  public void userClickNoThankYouButton() {
    startPage.clickNoThanks();
  }
}
