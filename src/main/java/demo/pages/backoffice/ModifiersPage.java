package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModifiersPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }

  public void createModifier(){
    WebElement createBtn = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Modifier')]"));
    createBtn.click();
  }

  public void inputModifierSet(String keyword){
    WebElement priceBtn = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Name']"));
    priceBtn.sendKeys(keyword);
  }

  public void addOrManageOptions(){
    WebElement AOMOptions = WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']"));
    AOMOptions.click();
  }

  public void addOptions(){
    WebElement addoptionsBtn = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Add Options')]"));
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 5);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add Options')]"))).isDisplayed();
    addoptionsBtn.click();
  }

  public void inputOptionName(String keyword){
    WebElement optionName = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-6']//input[@placeholder='Name']"));
    optionName.sendKeys(keyword);
  }

  public void inputModifierPrice(){
    String price = RandomUtils.generateRandomModifierPrice();
    WebElement optionsPrice = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-5']//input[@placeholder='Rp. 0']"));
    optionsPrice.sendKeys(price);
  }

  public void clickSaveOptions(){
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 5);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary'][contains(text(),'Save')]"))).isDisplayed();
    WebElement saveBtn = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary'][contains(text(),'Save')]"));
    saveBtn.click();
  }

  public void clickSaveModifier(){
    WebElement saveBtn = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]"));
    saveBtn.click();
  }

  public boolean checkItemDisplayed(String keyword){
    String xpath = "//td[contains(text(),'"+keyword+"')]";
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
    return wait.until(ExpectedConditions
            .presenceOfElementLocated(By.xpath(xpath))).isDisplayed();
  }

  //tr[1]//td[1]

//  public boolean checkItemDisplayed(){
//    String xpath = "//td[text()='"+generatedItemName+"']";
//    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
//    return wait.until(ExpectedConditions
//            .presenceOfElementLocated(By.xpath(xpath))).isDisplayed();
//  }

}
