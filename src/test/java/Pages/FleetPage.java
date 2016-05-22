package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FleetPage extends AbstractPage {

    public FleetPage (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL) {
        driver.findElement(By.linkText(URL)).click();
    }

    public void buildFleet(String nameOfFleet, String count){
        //WarFleet
        if(nameOfFleet.equals("ЛёгкийИстребитель") && driver.findElement(By.id("details204")).isEnabled())
            driver.findElement(By.id("details204")).click();
        if(nameOfFleet.equals("ТяжёлыйИстребитель") && driver.findElement(By.id("details205")).isEnabled())
            driver.findElement(By.id("details205")).click();
        if(nameOfFleet.equals("Крейсер") && driver.findElement(By.id("details206")).isEnabled())
            driver.findElement(By.id("details206")).click();
        if(nameOfFleet.equals("Линкор") && driver.findElement(By.id("details207")).isEnabled())
            driver.findElement(By.id("details207")).click();
        if(nameOfFleet.equals("ЛинейныйКрейсер") && driver.findElement(By.id("details215")).isEnabled())
            driver.findElement(By.id("details215")).click();
        if(nameOfFleet.equals("Бомбардировщик") && driver.findElement(By.id("details211")).isEnabled())
            driver.findElement(By.id("details211")).click();
        if(nameOfFleet.equals("Уничтожитель") && driver.findElement(By.id("details213")).isEnabled())
            driver.findElement(By.id("details213")).click();
        if(nameOfFleet.equals("ЗвездаСмерти") && driver.findElement(By.id("details214")).isEnabled())
            driver.findElement(By.id("details214")).click();
        //CivilFleet
        if(nameOfFleet.equals("МалыйТранспорт") && driver.findElement(By.id("details202")).isEnabled())
            driver.findElement(By.id("details202")).click();
        if(nameOfFleet.equals("БольшойТранспорт") && driver.findElement(By.id("details203")).isEnabled())
            driver.findElement(By.id("details203")).click();
        if(nameOfFleet.equals("Колонизатор") && driver.findElement(By.id("details208")).isEnabled())
            driver.findElement(By.id("details208")).click();
        if(nameOfFleet.equals("Переработчик") && driver.findElement(By.id("details209")).isEnabled())
            driver.findElement(By.id("details209")).click();
        if(nameOfFleet.equals("ШпионскийЗонд") && driver.findElement(By.id("details210")).isEnabled())
            driver.findElement(By.id("details210")).click();
        if(nameOfFleet.equals("СолнечныйСпутник") && driver.findElement(By.id("details212")).isEnabled())
            driver.findElement(By.id("details212")).click();

        driver.findElement(By.id("number")).sendKeys(count);
        driver.findElement(By.className("build-it")).click();
    }
    public boolean isBuildFleet() {
        return driver.findElement(By.className("shipAllCountdown")).isEnabled();
    }

    public void sendAllFleetToMine(String [] coords){
        driver.findElement(By.id("sendall")).click();
        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("galaxy")).clear();
        driver.findElement(By.id("galaxy")).sendKeys(coords[0]);
        driver.findElement(By.id("system")).clear();
        driver.findElement(By.id("system")).sendKeys(coords[1]);
        driver.findElement(By.id("position")).clear();
        driver.findElement(By.id("position")).sendKeys(coords[2]);
        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("button1")).click();
        driver.findElement(By.id("start")).click();
    }
    public boolean isSendFleet(String coords){
        boolean isSend=false;
        driver.findElement(By.linkText("Флот")).click();
        driver.findElement(By.id("movements")).click();
        try {
            isSend=driver.findElement(By.linkText(coords)).isDisplayed();
        }catch (Exception e){
            isSend=false;
        }
        return  isSend;
    }
}
