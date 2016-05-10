package Steps;
import java.util.concurrent.TimeUnit;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {
    private WebDriver driver;

    public void initBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void closeDriver()
    {
        driver.close();
    }

    public void logInOgame(String username, String password)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("https://ru.ogame.gameforge.com");
        loginPage.logIn(username, password);
    }
    public boolean isLoggedIn(String username)
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.getLoggedInUserName().equals(username));
    }
    public void logOutOgame(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logOut();
    }
    public boolean isLoggedOut()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogOut());
    }
    public void searchObj(String name,String category){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.openPage("Поиск");
        searchPage.searchUserOrPlanetOrAlliance(name,category);
    }
    public boolean isFindObject(String category){
        SearchPage searchPage = new SearchPage(driver);
        return (searchPage.isFindObjects(category));
    }

    public void buildResources(String nameOfBuilding){
        BildingPages buildPage = new BildingPages(driver);
        buildPage.openPage("Сырьё");
        buildPage.resourcesBuild(nameOfBuilding);
    }
    public void buildFabric(String nameOfFabric){
        BildingPages buildPage = new BildingPages(driver);
        buildPage.openPage("Фабрики");
        buildPage.fabricsBuild(nameOfFabric);
    }
    public boolean isBuild(){
        BildingPages buildPage = new BildingPages(driver);
        return buildPage.isBuild();
    }

    public void makeResearch(String nameOfResearch){
        ResearchPage researchPage = new ResearchPage(driver);
        researchPage.openPage("Исследования");
        researchPage.makeResearch(nameOfResearch);
    }
    public boolean isMakeResearch(){
        ResearchPage researchPage = new ResearchPage(driver);
        return researchPage.isResearching();
    }

    public void buildDefense(String nameOfBuilding, String count){
        DefensePage defensePage = new DefensePage(driver);
        defensePage.openPage("Оборона");
        defensePage.buildDefense(nameOfBuilding,count);
    }
    public boolean isBuildDef(){
        DefensePage defensePage = new DefensePage(driver);
        return defensePage.isBuildDef();
    }
    public void buildFleet(String nameOfBuilding, String count){
        FleetPage fleetPage = new FleetPage(driver);
        fleetPage.openPage("Верфь");
        fleetPage.buildFleet(nameOfBuilding,count);
    }
    public boolean isBuildFleet(){
        FleetPage fleetPage = new FleetPage(driver);
        return fleetPage.isBuildFleet();
    }
    public void createAlliance(String allyTag, String allyName){
        SearchPage searchPage=new SearchPage(driver);
        searchPage.openPage("Альянс");
        searchPage.createAlliance(allyTag,allyName);
    }
    public boolean isCreatedAlly(){
        SearchPage searchPage=new SearchPage(driver);
        return searchPage.isCreated();
    }
    public void sendFleet(String [] coords){
        FleetPage fleetPage = new FleetPage(driver);
        fleetPage.openPage("Флот");
        fleetPage.sendAllFleetToMine(coords);
    }
    public boolean isSend(String coords){
        FleetPage fleetPage = new FleetPage(driver);
        return fleetPage.isSendFleet(coords);
    }
}
