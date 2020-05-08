package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemLibraryPage {

  public String generatedItemName = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
  }

  public void inputItemName(){
    generatedItemName = RandomUtils.generateRandomFoodName();
    WebElement nameBox = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Item Name']"));
    nameBox.sendKeys(generatedItemName);
  }

  public void clickCreateItem(){
    WebElement createBtn = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Item')]"));
    createBtn.click();
  }

  public void selectCategories(){
    WebElement catBtn = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='Select-input']"));
    catBtn.click();
  }

  public void inputRandomPrice(){
    String price = RandomUtils.generateRandomItemPrice();
    WebElement priceBtn = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Price']"));
    priceBtn.sendKeys(price);
  }

  public void inputRandomSKU(){
    String SKU = RandomUtils.generateRandomSKU();
    WebElement skuBtn = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='SKU']"));
    skuBtn.sendKeys(SKU);
  }

  public void addVariantBtn(){
    WebElement varianBtn = WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block no-border-radius-top']"));
    varianBtn.click();
  }

  public void addDescrition(String description){
    WebElement descBox = WebDriverInstance.webDriver.findElement(By.xpath("//textarea[@placeholder='Item Description']"));
    descBox.sendKeys(description);
  }

  public void clickSave(){
    WebElement saveBtn = WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary no-outline']"));
    saveBtn.click();
  }

  public boolean checkItemDisplayed(){
    String xpath = "//td[text()='"+generatedItemName+"']";
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
    return wait.until(ExpectedConditions
            .presenceOfElementLocated(By.xpath(xpath))).isDisplayed();
  }


  //waiting a wile
  public void waitAbit(int milis){
    try {
      Thread.sleep(milis);
    } catch (InterruptedException e){
      e.printStackTrace();
    }
  }





}
