package UTILS;

import Pages.A101_Otomasyon_Pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverManager extends A101_Otomasyon_Pages
{
    public WebDriver driver;
    public WebDriverWait wait;
    JavascriptExecutor js ;

    public void SetDriver()
    {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("start-maximized","disable-extensions","disable-popup-blocking");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.a101.com.tr/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
    }
    public void SiyahCorapAL() throws InterruptedException {
        driver.findElement(CerezKabul).click();
        driver.findElement(UstBarGiyim).click();
        driver.findElement(YanBargiyim).click();
        Thread.sleep(3000);
        driver.findElement(YanBarDizAlti).click();
        driver.findElement(Corap).click();
        Assert.assertEquals(driver.findElement(SiyahRenkDogrulama_Assert).getText(),"SİYAH");
        driver.findElement(SepeteEkle).click();
        driver.findElement(SepetiGoruntule).click();
        driver.findElement(SepetiOnayla).click();
        driver.findElement(UyeOlmadanDevamEt).click();
        driver.findElement(MailAlani).sendKeys("Deneemeee@gmail.com");
        driver.findElement(MailDevamButonu).click();
        driver.findElement(AdresOlusturmaButonu).click();
        driver.findElement(AdresBasligiAlani).sendKeys("Ev Adresi");
        driver.findElement(AdresIsimAlani).sendKeys("Hamza");
        driver.findElement(AdresSoyAdAlani).sendKeys("Akinci");
        driver.findElement(AdresTelefon).sendKeys("05344059285");
        driver.findElement(IL_ToogleBar).click();
        driver.findElement(IlSecme_Butonu).click();
        driver.findElement(Ilce_ToogleBar).click();
        driver.findElement(IlceSec_Butonu).click();
        Thread.sleep(500);
        driver.findElement(Mahalle_ToogleBar).click();
        driver.findElement(MahalleSec_Butonu).click();
        driver.findElement(AdresAlani).sendKeys("Adres Tanımı Deneme1234");
        driver.findElement(PostaKodu).sendKeys("78050");
        js.executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(3000);
        driver.findElement(Kaydet_Butonu).click();
      //  driver.findElement(KargoSec_Butonu).click();
        wait.until(ExpectedConditions.elementToBeClickable(KaydetVeDevamEt_Butonu));
        driver.findElement(KaydetVeDevamEt_Butonu).click();
        driver.findElement(KrediKartiAD).sendKeys("Hamza AKINCI");
    //Aşağıdaki Alanlara Kredi Kartı Bilgileri Girilecektir
     //   driver.findElement(KrediKartiNo).sendKeys("");
     //   driver.findElement(KrediKartiAy).sendKeys("");
     //   driver.findElement(KrediKartiYil).sendKeys("");
     //   driver.findElement(KrediKartiCVC).sendKeys("");
     //   driver.findElement(SiparisiTamamla_Butonu).click();
     //   driver.findElement(Onaylama_Butonu).click();
    }
}
