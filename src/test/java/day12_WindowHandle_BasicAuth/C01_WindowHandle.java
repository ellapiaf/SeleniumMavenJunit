package day12_WindowHandle_BasicAuth;

import day09_DropDown.TestBase;
import org.junit.Test;
//import org.openqa.selenium.WindowType;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static utilities.TestBase.bekle;
//import static utilities.TestBase.switchToWindow;

//public class C01_WindowHandle extends TestBase {
     /*
 https://www.techproeducation.com adresine gidiniz
 Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
 Tab 2'de https://www.google.com sayfasını açınız
 Tab 3'te https://www.linkedin.com sayfasını açınız
 techproeducation sayfasına geçiniz
 youtube sayfasına geçiniz
 linkedIn sayfasına geçiniz
  */

//    @Test
//    public void newTabTest() {
////        https://www.techproeducation.com adresine gidiniz
//        driver.get("https://www.techproeducation.com");
////        Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
//        assertEquals("Techpro Education | Online It Courses & Bootcamps", driver.getTitle());
////        Tab 2'de https://www.google.com sayfasını açınız
//        driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");
//        System.out.println(driver.getTitle());
//        //sayfa basliginin "google" oldugunu dogrulayiniz
//        assertEquals("Google", driver.getTitle());
////        Tab 3'te https://www.linkedin.com sayfasını açınız
//        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com");
//        //sayfa basliginin "LinkedIn" icerdigini  dogrulayiniz
//        assertTrue(driver.getTitle().contains("LinkedIn"));
//        //Window handle Set'INI BIR LIST ICERISINE ALIYORUZ
//
//        List<String> windowHandleList = new ArrayList<>(driver.getWindowHandles());
//        System.out.println("windowHandleList = " + windowHandleList);
//        //windowHandleList = [57061AB19A2C5C3D81F9E707511D8A07, 5D473CA2B7401B9E486B5CB9246547D1, 5185C73EE9CFE01983D16E48AE941091]
//        //List ile indeks kullanarak ilgili windowHandle degerine ulasabiliriz.

//        techproeducation sayfasına geçiniz
//        bekle(3);
//        driver.switchTo().window(windowHandleList.get(0));
////        youtube sayfasına geçiniz
//        bekle(3);
//        driver.switchTo().window(windowHandleList.get(1));
////        linkedIn sayfasına geçiniz
//        bekle(3);
//        driver.switchTo().window(windowHandleList.get(2));
//
//    }
//ayni soruyu testBase icinden method kullanarak da deneyebiliriz.
//    @Test
//    public void newTabTest2() {
////        https://www.techproeducation.com adresine gidiniz
//        driver.get("https://www.techproeducation.com");
////        Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
//        assertEquals("Techpro Education | Online It Courses & Bootcamps", driver.getTitle());
////        Tab 2'de https://www.google.com sayfasını açınız
//        driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");
//        assertTrue(driver.getTitle().contains("Google"));
//        System.out.println(driver.getTitle());
////        Tab 3'te https://www.linkedin.com sayfasını açınız
//        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com");
//        assertTrue(driver.getTitle().contains("LinkedIn"));
//////        techproeducation sayfasına geçiniz
////switchToWindow(0);
//////        youtube sayfasına geçiniz
////switchToWindow(1);
//////        linkedIn sayfasına geçiniz
////       switchToWindow(2);
//
//   // }
////}
  //  }