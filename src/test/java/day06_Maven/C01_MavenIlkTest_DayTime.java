package day06_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest_DayTime {
    /*
 https://www.amazon.com/ sayfasına gidelim
 Arama kutusunu locate edelim
 “Samsung headphones” ile arama yapalım
 Bulunan sonuç yazısını yazdıralım
 İlk ürünü tıklayalım
 Sayfadaki tüm başlıkları yazdıralım
  */
    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        https://www.amazon.com/ sayfasına gidelim
        driver.get("https://www.amazon.com/");
//        Arama kutusunu locate edelim
        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

//        “Samsung headphones” ile arama yapalım
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER); // IKI SECENEK VAR KEYS.ENTER YA DA SUMMIT YAPABILIRSIN
          //aramaKutusu.submit();//Enter'a bastik demek

//        Bulunan sonuç yazısını yazdıralım
       WebElement aramasonucu=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
       // System.out.println("aramasonucu = " + aramasonucu);//bu sekilde yazarsan hashcode cikar bunu yapma
        System.out.println("aramasonucu" + aramasonucu.getText());//bu sekilde yazarsan dogru olur sana text leri yazdirir

//        İlk ürünü tıklayalım
    WebElement Ilkurun =   driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
    Ilkurun.click();


    //NOTE: eger findelements dersek s cogulu kullanirsak bunu List icerisine atmamiz gerekir oda su sekilde :
        //Tum arama sonucu urunleri List icine koyup ilk elemani tikliyoruz.
//    List<WebElement> urunListesi  =   driver.findElements(By.xpath("//img[@class='s-image']"));
//    urunListesi.get(0).click();




//        Sayfadaki tüm başlıkları yazdıralım

  List<WebElement> sayfaBasliklari=driver.findElements(By.xpath("//h2"));
//  System.out.println(sayfaBasliklari.get(0).getText());
//  System.out.println(sayfaBasliklari.get(1).getText());
//  System.out.println(sayfaBasliklari.get(2).getText());
//  System.out.println(sayfaBasliklari.get(3).getText());
//  System.out.println(sayfaBasliklari.get(4).getText());//bu sout'lari yapmak yerine foreach loop yaparsan daha iyi olur
        //ya da for each ile yap
//        for (WebElement w:sayfaBasliklari){
//            System.out.println(w.getText());
//        }

        sayfaBasliklari.forEach(t-> System.out.println(t.getText()));

  //sayfayi kapatalim
      driver.close();

    }
}
