package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DefensePage extends AbstractPage {

    public DefensePage (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL) {
        driver.findElement(By.linkText(URL)).click();
    }

    public void buildDefense(String nameOfBuilding, String count){
        if(nameOfBuilding.equals("РакетнаяУстановка") && driver.findElement(By.id("defense1")).isEnabled())
            driver.findElement(By.id("defense1")).click();
        if(nameOfBuilding.equals("ЛёгкийЛазер") && driver.findElement(By.id("defense2")).isEnabled())
            driver.findElement(By.id("defense2")).click();
        if(nameOfBuilding.equals("ТяжёлыйЛазер") && driver.findElement(By.id("defense3")).isEnabled())
            driver.findElement(By.id("defense3")).click();
        if(nameOfBuilding.equals("ПушкаГауса") && driver.findElement(By.id("defense4")).isEnabled())
            driver.findElement(By.id("defense4")).click();
        if(nameOfBuilding.equals("ИонноеОрудие") && driver.findElement(By.id("defense5")).isEnabled())
            driver.findElement(By.id("defense5")).click();
        if(nameOfBuilding.equals("ПлазменноеОрудие") && driver.findElement(By.id("defense6")).isEnabled())
            driver.findElement(By.id("defense6")).click();
        if(nameOfBuilding.equals("МалыйКупол") && driver.findElement(By.id("defense7")).isEnabled())
            driver.findElement(By.id("defense7")).click();
        if(nameOfBuilding.equals("БольшойКупол") && driver.findElement(By.id("defense8")).isEnabled())
            driver.findElement(By.id("defense8")).click();
        if(nameOfBuilding.equals("Перехватчик") && driver.findElement(By.id("defense9")).isEnabled())
            driver.findElement(By.id("defense9")).click();
        if(nameOfBuilding.equals("МежпланетнаяРакета") && driver.findElement(By.id("defense10")).isEnabled())
            driver.findElement(By.id("defense10")).click();

        driver.findElement(By.id("number")).sendKeys(count);
        driver.findElement(By.className("build-it")).click();

    }
    public boolean isBuildDef() {
        return driver.findElement(By.className("shipAllCountdown")).isEnabled();

    }
}
