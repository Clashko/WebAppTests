package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BildingPages  extends AbstractPage {

    public BildingPages(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL) {
        driver.findElement(By.linkText(URL)).click();
    }

    public void resourcesBuild(String nameBuilding){
        if(nameBuilding.equals("Металл") && driver.findElement(By.className("supply1")).isEnabled())
            driver.findElement(By.className("supply1")).click();
        if(nameBuilding.equals("Кристаллы") && driver.findElement(By.className("supply2")).isEnabled())
            driver.findElement(By.className("supply2")).click();
        if(nameBuilding.equals("Дейтерий") && driver.findElement(By.className("supply3")).isEnabled())
            driver.findElement(By.className("supply3")).click();
        if(nameBuilding.equals("Энергия") && driver.findElement(By.className("supply4")).isEnabled())
            driver.findElement(By.className("supply4")).click();
        if(nameBuilding.equals("Термоядерная электростанция") && driver.findElement(By.className("supply12")).isEnabled())
            driver.findElement(By.className("supply12")).click();
        if(nameBuilding.equals("Солнечный спутник") && driver.findElement(By.className("supply212")).isEnabled())
            driver.findElement(By.className("supply212")).click();
        if(nameBuilding.equals("Хранилище металла") && driver.findElement(By.className("supply22")).isEnabled())
            driver.findElement(By.className("supply22")).click();
        if(nameBuilding.equals("Хранилище кристаллов") && driver.findElement(By.className("supply23")).isEnabled())
            driver.findElement(By.className("supply23")).click();
        if(nameBuilding.equals("Хранилище дейтерия") && driver.findElement(By.className("supply24")).isEnabled())
            driver.findElement(By.className("supply24")).click();

        driver.findElement(By.linkText("Улучшить")).click();
    }

    public void fabricsBuild(String nameBuilding) {
        if(nameBuilding.equals("Роботы") && driver.findElement(By.id("button0")).isEnabled())
            driver.findElement(By.id("button0")).click();
        if(nameBuilding.equals("Верфь") && driver.findElement(By.id("button1")).isEnabled())
            driver.findElement(By.id("button1")).click();
        if(nameBuilding.equals("Лаборатория") && driver.findElement(By.id("button2")).isEnabled())
            driver.findElement(By.id("button2")).click();
        if(nameBuilding.equals("Склад") && driver.findElement(By.id("button3")).isEnabled())
            driver.findElement(By.id("button3")).click();
        if(nameBuilding.equals("Шахта") && driver.findElement(By.id("button4")).isEnabled())
            driver.findElement(By.id("button4")).click();
        if(nameBuilding.equals("Наниты") && driver.findElement(By.id("button5")).isEnabled())
            driver.findElement(By.id("button5")).click();
        if(nameBuilding.equals("Терраформер") && driver.findElement(By.id("button6")).isEnabled())
            driver.findElement(By.id("button6")).click();

        driver.findElement(By.linkText("Улучшить")).click();
    }

    public boolean isBuild(){
        boolean isBuildBool=false;
        if(driver.findElement(By.id("Countdown")).isEnabled()) isBuildBool=true;
        return isBuildBool;
    }
}
