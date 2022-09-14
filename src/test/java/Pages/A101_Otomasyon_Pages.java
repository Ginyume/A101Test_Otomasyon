package Pages;

import UTILS.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A101_Otomasyon_Pages
{

  protected By CerezKabul=By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
  protected By UstBarGiyim=By.xpath("//section[1]/div/div/div/div/div/div/ul[1]/li[4]");
  protected By YanBargiyim=By.xpath("//li[@class='derin ']//a[@href='/giyim-aksesuar/kadin-ic-giyim/']");
  protected By YanBarDizAlti=By.linkText("Dizaltı Çorap");
  protected By Corap=By.partialLinkText("Penti Kadın 50 Denye Pantolon Çorabı Siyah");
  protected By SepeteEkle=By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button");
  protected By SepetiGoruntule=By.xpath("//*[@id=\"js-modal-basket\"]/div[3]/a[3]");
  protected By SepetiOnayla=By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/div/a");
  protected By UyeOlmadanDevamEt=By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a");
  protected By MailAlani=By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input");
  protected By MailDevamButonu=By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button");
  protected By AdresOlusturmaButonu=By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a");
  protected By AdresBasligiAlani=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[2]/div/div/label/input");
  protected By AdresIsimAlani=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[1]/div/label/input");
  protected By AdresSoyAdAlani=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[2]/div/label/input");
  protected By AdresTelefon=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[4]/div/div/label/input");
  protected By IL_ToogleBar=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select");
  protected By IlSecme_Butonu=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select/option[44]");
  protected By Ilce_ToogleBar=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[2]/div/label/div/select");
  protected By IlceSec_Butonu=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[2]/div/label/div/select/option[4]");
  protected By Mahalle_ToogleBar=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select");
  protected By MahalleSec_Butonu=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select/option[2]");
  protected By AdresAlani=By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[7]/label/textarea");
  protected By PostaKodu=By.name("postcode");
  protected By Kaydet_Butonu=By.xpath("/html/body/div[1]/div/div[2]/form/button[1]");
  protected By KargoSec_Butonu=By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div[2]/ul/li[1]/label/div[2]/input");
  protected By KaydetVeDevamEt_Butonu=By.xpath("\"/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button");
  protected By KrediKartiAD=By.xpath("\"/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[1]/label/input");
  protected By KrediKartiNo=By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[2]/label/input[1]");
  protected By KrediKartiAy=By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[2]/select");
  protected By KrediKartiYil=By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[3]/select");
  protected By KrediKartiCVC=By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[4]/label/input");
  protected By SiparisiTamamla_Butonu=By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[1]/form/div[2]/div[2]/div[6]/button");
  protected By Onaylama_Butonu=By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[3]/div/label");
  protected By SiyahRenkDogrulama_Assert=By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/span");
}
