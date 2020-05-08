package demo.pages.backoffice;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
  }

  public void clickCreateCategory(){
    WebElement createBtn = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Category')]"));
    createBtn.click();
  }

  public void inputCategoryName(String keyword){
    WebElement optionName = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Category Name']"));
    optionName.sendKeys(keyword);
  }

  public void clickSaveCategories(){
    WebElement saveBtn = WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary PhtzjEWwHfB2xdkEDI8ca']"));
    saveBtn.click();
  }

  public boolean checkItemDisplayed(String keyword){
    String xpath = "//td[contains(text(),'"+keyword+"')]";
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
    return wait.until(ExpectedConditions
            .presenceOfElementLocated(By.xpath(xpath))).isDisplayed();
  }


}
