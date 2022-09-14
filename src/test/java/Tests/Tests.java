package Tests;

//import Pages.A101_Otomasyon_Pages;
import UTILS.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Tests extends DriverManager
{

    @BeforeClass
    void  BeforeClass()
    {
        SetDriver();
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }

    @Test
    public void Test_Otomasyon() throws InterruptedException {
        SiyahCorapAL();
    }
}
