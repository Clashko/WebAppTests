package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends AbstractPage{
    public SearchPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL) {
        driver.findElement(By.linkText(URL)).click();
    }

    public void searchUserOrPlanetOrAlliance(String nameOfSearchingObject,String category){
        if(category.equals("user")){
            driver.findElement(By.id("2")).click();
            driver.findElement(By.id("searchText")).sendKeys(nameOfSearchingObject);
            driver.findElement(By.id("searchText")).sendKeys(Keys.ENTER);
        }
        else if(category.equals("planet")){
            driver.findElement(By.id("3")).click();
            driver.findElement(By.id("searchText")).sendKeys(nameOfSearchingObject);
            driver.findElement(By.id("searchText")).sendKeys(Keys.ENTER);
        }
        else{
            driver.findElement(By.id("4")).click();
            driver.findElement(By.id("searchText")).sendKeys(nameOfSearchingObject);
            driver.findElement(By.id("searchText")).sendKeys(Keys.ENTER);
        }
    }
    public boolean isFindObjects(String category){
        boolean isFind=false;
        try{
            if(category.equals("user") || category.equals("planet")){
                isFind=driver.findElement(By.className("userName")).isDisplayed();
            }
            else isFind=driver.findElement(By.className("allyTag")).isDisplayed();

        }catch (Exception e){
            isFind=false;
        }
        return isFind;
    }

    public void createAlliance(String allyTag,String allyName){
        driver.findElement(By.id("allyTagField")).sendKeys(allyTag);
        driver.findElement(By.id("allyNameField")).sendKeys(allyName);
        driver.findElement(By.id("allyNameField")).sendKeys(Keys.ENTER);
    }
    public boolean isCreated(){
        return driver.findElement(By.linkText("Страница альянса")).isDisplayed();
    }
}

