import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Steps.Steps;

public class AutoTests {
    private Steps steps;
    private final String USERNAME = "Clashko";
    private final String PASSWORD = "3d0feefcwrxe";

    private final String resources = "Дейтерий";
    private final String fabric = "Верфь";
    private final String research = "Броня";
    private final String [] defense = {"РакетнаяУстановка","2"};
    private final String [] fleet = {"ЛёгкийИстребитель","1"};

    private final String allySearch="SOA";
    private final String [] createAlly={"TST","TestAlliance"};

    private final String [] coords={"2","36","4"};
    private final String coordsCheck="[2:36:4]";

    @BeforeMethod(description = "Init browser")
    public void setUp()
    {
        steps = new Steps();
        steps.initBrowser();
    }

    @Test(description = "Login to Ogame")
    public void logInOgame() {
        steps.logInOgame(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedIn("Игрок: " + USERNAME));
    }

    @Test(description = "LogOut to Ogame")
    public void logOutOgame(){
        steps.logInOgame(USERNAME, PASSWORD);
        steps.logOutOgame();
        Assert.assertTrue(steps.isLoggedOut());
    }

    @Test(description = "Search Users")
    public void searchingUsers(){
        steps.logInOgame(USERNAME, PASSWORD);
        steps.searchObj(USERNAME,"user");
        Assert.assertTrue(steps.isFindObject("user"));
    }

    @Test(description = "Build Resources buildings")
    public void buildRes(){
        steps.logInOgame(USERNAME, PASSWORD);
        steps.buildResources(resources);
        Assert.assertTrue(steps.isBuild());
    }

    @Test(description = "Build Fabric building")
    public void buildFabric(){
        steps.logInOgame(USERNAME, PASSWORD);
        steps.buildFabric(fabric);
        Assert.assertTrue(steps.isBuild());
    }

    @Test(description = "make research")
    public void makeResearch(){
        steps.logInOgame(USERNAME, PASSWORD);
        steps.makeResearch(research);
        Assert.assertTrue(steps.isMakeResearch());
    }
    @Test(description = "Build defense")
    public void buildDef(){
        steps.logInOgame(USERNAME, PASSWORD);
        steps.buildDefense(defense[0],defense[1]);
        steps.isBuildDef();
    }
    @Test(description = "Build fleet")
    public void buildFleet(){
        steps.logInOgame(USERNAME, PASSWORD);
        steps.buildFleet(fleet[0],fleet[1]);
        steps.isBuildFleet();
    }

    @Test(description = "Search and create alliance")
    public void searchingAndCreateAlliance(){
        steps.logInOgame(USERNAME, PASSWORD);
        steps.searchObj(allySearch,"alliance");
        Assert.assertTrue(steps.isFindObject("alliance"));
        steps.createAlliance(createAlly[0],createAlly[1]);
        Assert.assertTrue(steps.isCreatedAlly());
    }

    @Test(description = "send fleet to mine")
    public void sendFleetToMine(){
        steps.logInOgame(USERNAME,PASSWORD);
        steps.sendFleet(coords);
        Assert.assertTrue(steps.isSend(coordsCheck));
    }
    @AfterMethod(description = "Close browser")
    public void closeBrowser() {
        steps.closeDriver();
    }
}
