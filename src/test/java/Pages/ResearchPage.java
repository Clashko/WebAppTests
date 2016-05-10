package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ResearchPage extends AbstractPage{
    public ResearchPage (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL) {
        driver.findElement(By.linkText(URL)).click();
    }

    public void makeResearch(String nameOfReseacrh){
        //baseResearch
        if(nameOfReseacrh.equals("Энергетическая") && driver.findElement(By.id("details113")).isEnabled())
            driver.findElement(By.id("details113")).click();
        if(nameOfReseacrh.equals("Лазерная") && driver.findElement(By.id("details120")).isEnabled())
            driver.findElement(By.id("details120")).click();
        if(nameOfReseacrh.equals("Ионная") && driver.findElement(By.id("details121")).isEnabled())
            driver.findElement(By.id("details121")).click();
        if(nameOfReseacrh.equals("Гиперпространственная") && driver.findElement(By.id("details114")).isEnabled())
            driver.findElement(By.id("details114")).click();
        if(nameOfReseacrh.equals("Плазменная") && driver.findElement(By.id("details122")).isEnabled())
            driver.findElement(By.id("details122")).click();
        //engineResearch
        if(nameOfReseacrh.equals("Реактивный") && driver.findElement(By.id("details115")).isEnabled())
            driver.findElement(By.id("details115")).click();
        if(nameOfReseacrh.equals("Импульсный") && driver.findElement(By.id("details117")).isEnabled())
            driver.findElement(By.id("details117")).click();
        if(nameOfReseacrh.equals("Гиперпространственный") && driver.findElement(By.id("details118")).isEnabled())
            driver.findElement(By.id("details118")).click();
        //advancedResearch
        if(nameOfReseacrh.equals("Шпионаж") && driver.findElement(By.id("details106")).isEnabled())
            driver.findElement(By.id("details106")).click();
        if(nameOfReseacrh.equals("Компютерная") && driver.findElement(By.id("details108")).isEnabled())
            driver.findElement(By.id("details108")).click();
        if(nameOfReseacrh.equals("Астрофизика") && driver.findElement(By.id("details124")).isEnabled())
            driver.findElement(By.id("details124")).click();
        if(nameOfReseacrh.equals("МежГалСеть") && driver.findElement(By.id("details123")).isEnabled())
            driver.findElement(By.id("details123")).click();
        if(nameOfReseacrh.equals("Гравитационная") && driver.findElement(By.id("details199")).isEnabled())
            driver.findElement(By.id("details199")).click();
        //combatResearch
        if(nameOfReseacrh.equals("Оружейная") && driver.findElement(By.id("details109")).isEnabled())
            driver.findElement(By.id("details109")).click();
        if(nameOfReseacrh.equals("Щитовая") && driver.findElement(By.id("details110")).isEnabled())
            driver.findElement(By.id("details110")).click();
        if(nameOfReseacrh.equals("Броня") && driver.findElement(By.id("details111")).isEnabled())
            driver.findElement(By.id("details111")).click();

        driver.findElement(By.linkText("Исследовать")).click();
    }

    public boolean isResearching() {
        boolean isResearchBool=false;
        if(driver.findElement(By.id("researchCountdown")).isEnabled()) isResearchBool=true;
        return isResearchBool;

    }
}
