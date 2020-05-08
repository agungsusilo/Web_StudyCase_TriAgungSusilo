package demo.steps_definition;

import demo.pages.backoffice.CategoriesPage;
import demo.pages.backoffice.DashboardPage;
import demo.pages.backoffice.ItemLibraryPage;
import demo.pages.backoffice.LoginPage;
import demo.pages.backoffice.ModifiersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BackOfficeStepDefinitions {

  LoginPage loginPage = new LoginPage();
  DashboardPage dashboardPage = new DashboardPage();
  CategoriesPage categoriesPage = new CategoriesPage();
  ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
  ModifiersPage modifiersPage = new ModifiersPage();

  @Given("User open moka backoffice login page")
  public void userOpenMokaBackofficeLoginPage() {
    loginPage.openPage();
  }

  @When("User input email/phone {string} on backoffice login page")
  public void userInputEmailOnBackofficeLoginPage(String emailOrPhone) {
    loginPage.inputEmailorPhone(emailOrPhone);
  }

  @When("User input password {string} on backoffice login page")
  public void userInputPasswordOnBackofficeLoginPage(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click Sign in on backoffice login page")
  public void userClickSignInOnBackofficeLoginPage() {
    loginPage.clickSignIn();
  }


  @Then("User successfully login on backoffice")
  public void userSuccessfullyLoginOnBackoffice() {
    Assert.assertTrue(dashboardPage.isOnPage());
  }

  @When("User go to menu categories on backoffice")
  public void userGoToMenuCategoriesOnBackoffice() {
    categoriesPage.openPage();
  }


  @When("User go to menu item library on backoffice")
  public void userGoToMenuItemLibraryOnBackoffice() {
    itemLibraryPage.openPage();
  }

  @When("User go to menu modifiers on backoffice")
  public void userGoToMenuModifiersOnBackoffice() {
    modifiersPage.openPage();
  }

  @And("User click create item button on backoffice item library page")
  public void userClickCreateItemButtonOnBackofficeItemLibraryPage() {
    itemLibraryPage.clickCreateItem();
  }

  @And("User input random item name on create item form")
  public void userInputRandomItemNameOnCreateItemForm() {
    itemLibraryPage.inputItemName();
  }

  @And("User click save button on create item form")
  public void userClickSabeButtonOnCreateItemForm() {
    itemLibraryPage.clickSave();
  }

  @Then("User see newly created item")
  public void userSeeNewlyCreatedItem() {
    boolean result = itemLibraryPage.checkItemDisplayed();
    Assert.assertTrue(result);
  }

  @And("User input random price on create item form")
  public void userInputRandomPriceOnCreateItemForm() {
    itemLibraryPage.inputRandomPrice();
  }

  @And("User input random SKU name on create item form")
  public void userInputRandomSKUNameOnCreateItemForm() {
    itemLibraryPage.inputRandomSKU();
  }

  @And("User click Create Modifier button on Modifiers page")
  public void userClickCreateModifierButtonOnModifiersPage() {
    modifiersPage.createModifier();
  }

  @And("User input {string} Set name on create modifier form")
  public void userInputSetNameOnCreateModifierForm(String keyword) {
    modifiersPage.inputModifierSet(keyword);
  }

  @And("User click add or manage options button")
  public void userClickAddOrManageOptionsButton() {
    modifiersPage.addOrManageOptions();
  }

  @And("User click Add options button")
  public void userClickAddOptionsButton() {
    modifiersPage.addOptions();
  }

  @And("User input modifier name with {string}")
  public void userInputModifierNameWith(String keyword) {
    modifiersPage.inputOptionName(keyword);
  }

  @And("User input random price on add options")
  public void userInputRandomPriceOnAddOptions() {
    modifiersPage.inputModifierPrice();
  }

  @And("User click save button on modifier add or manage options")
  public void userClickSaveButtonOnModifierAddOrManageOptions() {
    modifiersPage.clickSaveOptions();
  }

  @And("User click save on create modifier")
  public void userClickSaveOnCreateModifier() {
    modifiersPage.clickSaveModifier();
  }

  @Then("User see {string} modifier added")
  public void userSeeModifierAdded(String keyword) {
    modifiersPage.checkItemDisplayed(keyword);
  }

  @And("User click create category button on categories page")
  public void userClickCreateCategoryButtonOnCategoriesPage() {
    categoriesPage.clickCreateCategory();
  }

  @And("User input Cateogry name {string} on name form")
  public void userInputCateogryNameOnNameForm(String keyword) {
    categoriesPage.inputCategoryName(keyword);
  }

  @And("User click save button on category page")
  public void userClickSaveButtonOnCategoryPage() {
    categoriesPage.clickSaveCategories();
  }

  @Then("User see {string} category added")
  public void userSeeCategoryAdded(String keyword) {
    categoriesPage.checkItemDisplayed(keyword);
  }
}
