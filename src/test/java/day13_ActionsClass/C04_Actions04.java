package day13_ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.io.ObjectInputStream;

public class C04_Actions04 extends TestBase {

    /*
    https://jqueryui.com/droppable/ adresine gidin
    "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
     */

    @Test
    public void actions() {
//        https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable/");

//        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        driver.switchTo().frame(0);



        WebElement dragSource=driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement dropTarget=driver.findElement(By.xpath("//*[@id='droppable']"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(dragSource,dropTarget).perform();
        //Source(drag) webelementini alip Target(drop) webelementinin uzerine tasir.
        
    }

    @Test
    public void actions2() { // 2. farkli sekilde de yapabiliriz.

        //        https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable/");

        //        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        driver.switchTo().frame(0);



        WebElement dragSource=driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement dropTarget=driver.findElement(By.xpath("//*[@id='droppable']"));

        Actions actions=new Actions(driver);
        actions.clickAndHold(dragSource).//Webelementi tutup bekler
        moveToElement(dropTarget).//mouse'i elementin uzerine tasir.
        release().//mouse serbest birakir.
        perform();

    }

    @Test
    public void actions3() {// baska bir yontem denemesi

        //        https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable/");

        //        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        driver.switchTo().frame(0);



        WebElement dragSource=driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement dropTarget=driver.findElement(By.xpath("//*[@id='droppable']"));

        Actions actions=new Actions(driver);
        actions.clickAndHold(dragSource).
                moveByOffset(161,37).//webelementi istedigimiz koordinata tasir.
                release().perform();
    }
}
